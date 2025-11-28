import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 * Главный класс для кодирования и декодирования данных алгоритмом Хаффмана
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Huffman {

    /**
     * Главный метод приложения
     * обрабатывает аргументы командной строки и запускает нужный процесс
     *
     * @param args аргументы командной строки: команда, входной файл, выходной файл
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            String rules =
                    """ 
                    Please follow the rules of usage.
                        If you want to encode your file, use:
                            "java Huffman encode <input file name> <output file name>"
                        If you want to decode your file, use:
                            "java Huffman decode <input file name> <output file name>"
                    """;
            System.out.println(rules);
            return;
        }

        String command = args[0];
        String inputFile = args[1];
        String outputFile = args[2];

        try {
            Coder coder = new Coder();
            if ("encode".equalsIgnoreCase(command)) {
                coder.encode(inputFile, outputFile);
            } else if ("decode".equalsIgnoreCase(command)) {
                coder.decode(inputFile, outputFile);
            } else {
                System.out.println("Unknown command: " + command);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}

/**
 * класс который реализует логику сжатия и распаковки данных алгоритмом Хаффмана
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
class Coder {

    /**
     * кодирует файл с использованием алгоритма Хаффмана
     *
     * @param source путь к исходному файлу
     * @param goal путь к целевому файлу для записи сжатых данных
     * @throws IOException если возникают ошибки ввода-вывода
     */
    public void encode(String source, String goal) throws IOException {
        byte[] inputData = Files.readAllBytes(Paths.get(source));

        if (inputData.length == 0) {//обработка пустого файла
            System.out.println("Source file is empty!");
            return;
        }

        Map<Byte, Integer> frequencyMap = new HashMap<>();//создаем соварь частот
        for (byte b : inputData) {
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        }

        Tree tree = new Tree(frequencyMap);//делаем дерево по словарю
        Map<Byte, String> codeTable = tree.buildCodeTable();

        StringBuilder bitString = new StringBuilder();//собираем битовую строку
        for (byte b : inputData) {
            bitString.append(codeTable.get(b));
        }

        int paddingBits = (8 - (bitString.length() % 8)) % 8;//вычисляем padding

        for (int i = 0; i < paddingBits; i++) {//нули для выравнивания
            bitString.append('0');
        }

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(goal))) {
            int alphabetSize = frequencyMap.size();//записываем размер алфавита (он равен размеру словаря частот)
            outputStream.writeByte(alphabetSize - 1);

            for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {//записываем словарь частот
                outputStream.writeByte(entry.getKey());
                outputStream.writeInt(entry.getValue());
            }

            outputStream.writeByte(paddingBits);//записываем padding

            String bits = bitString.toString();//записываем кодированную информацию
            for (int i = 0; i < bits.length(); i += 8) {
                String byteStr = bits.substring(i, i + 8);
                int byteValue = Integer.parseInt(byteStr, 2);
                outputStream.writeByte(byteValue);
            }
        }
    }

    /**
     * декодирует файл с кодом Хаффмана
     *
     * @param source путь к сжатому файлу
     * @param goal путь к целевому файлу для записи распакованных данных
     * @throws IOException если возникают ошибки ввода/вывода
     */
    public void decode(String source, String goal) throws IOException {
        File file = new File(source);
        long fileLength = file.length();

        if (fileLength == 0) {//обработка пустого файла
            System.out.println("Source file is empty!");
            return;
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(source));
             FileOutputStream outputStream = new FileOutputStream(goal)) {

            int tableSizeByte = inputStream.readByte() & 0xFF;// читаем размер алфавита (он равен размеру словаря частот)
            int tableSize = tableSizeByte + 1;

            Map<Byte, Integer> frequencyMap = new HashMap<>();//читаем словарь
            for (int i = 0; i < tableSize; i++) {
                byte b = inputStream.readByte();
                int freq = inputStream.readInt();
                frequencyMap.put(b, freq);
            }

            int paddingBits = inputStream.readByte() & 0xFF;//читаем padding

            int headerSize = 1 + tableSize * 5 + 1;
            long dataBytes = fileLength - headerSize;

            StringBuilder bitString = new StringBuilder();//читаем все закодированные данные
            for (int i = 0; i < dataBytes; i++) {
                int byteValue = inputStream.readByte() & 0xFF;
                String byteBits = String.format("%8s", Integer.toBinaryString(byteValue)).replace(' ', '0');
                bitString.append(byteBits);
            }

            if (paddingBits > 0) {// Убираем padding биты
                bitString.setLength(bitString.length() - paddingBits);
            }

            Tree tree = new Tree(frequencyMap);//восстанавливаем дерево
            Node root = tree.getRoot();

            Node current = root;//декодируем битовую строку
            for (int i = 0; i < bitString.length(); i++) {
                char bit = bitString.charAt(i);

                //идем по дереву
                if (bit == '0') {
                    current = current.left;
                } else {
                    current = current.right;
                }

                //если лист то записываем соответсвующий байт и возвращаемся в корень
                if (current.isLeaf()) {
                    outputStream.write(current.byteValue);
                    current = root;
                }
            }
        }
    }
}

/**
 * узел дерева Хаффмана
 * реализует Comparable для использования в очереди с приоритетом
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
class Node implements Comparable<Node> {
    final Byte byteValue;
    final int frequency;
    final Node left;
    final Node right;

    /**
     * конструктор для листового узла
     *
     * @param byteValue байтовое значение символа
     * @param frequency частота символа
     */
    public Node(Byte byteValue, int frequency) {
        this(byteValue, frequency, null, null);
    }

    /**
     * конструктор для внутреннего узла
     *
     * @param byteValue байтовое значение
     * @param frequency суммарная частота потомков
     * @param left левый потомок
     * @param right правый потомок
     */
    public Node(Byte byteValue, int frequency, Node left, Node right) {
        this.byteValue = byteValue;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    /**
     * проверяет является ли узел листовым
     *
     * @return true если узел не имеет дочерних элементов
     */
    boolean isLeaf() {
        return left == null && right == null;
    }

    /**
     * сравнивает узлы по частоте для очереди с приоритетом
     *
     * @param o узел для сравнения
     * @return результат сравнения частот
     */
    @Override //нужно чтобы работала очередь с приоритетом
    public int compareTo(Node o) {
        return Integer.compare(this.frequency, o.frequency);
    }
}

/**
 * структура данных Дерева Хаффмана
 * строит дерево для кодирования символов
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
class Tree {
    private final Node root;

    /**
     * строит дерево Хаффмана по частотам символов
     *
     * @param frequencies словарь частот символов
     */
    public Tree(Map<Byte, Integer> frequencies) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Byte, Integer> entry : frequencies.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        //если файл состоит из 1 уникального символа то надо создаать формальный корень(чтобы путь до этого символа был 0)
        if (pq.size() == 1) {
            Node onlyNode = pq.poll();
            pq.add(new Node(null, onlyNode.frequency, onlyNode, null));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(null, left.frequency + right.frequency, left, right);
            pq.add(parent);
        }
        this.root = pq.poll();
    }

    /**
     * возвращает корневой узел дерева
     *
     * @return корневой узел
     */
    public Node getRoot() {
        return root;
    }

    /**
     * строит словарь кодов для всех символов дерева
     *
     * @return словарь байтов и их кодов
     */
    public Map<Byte, String> buildCodeTable() {
        Map<Byte, String> map = new HashMap<>();
        if (root != null) {
            buildTableRecursive(root, "", map);
        }
        return map;
    }

    /**
     * рекурсивно обходим дерево для построения таблицы кодов
     *
     * @param node текущий узел
     * @param code текущий код
     * @param map словарь для записи результатов
     */
    private void buildTableRecursive(Node node, String code, Map<Byte, String> map) {
        if (node.isLeaf()) {
            map.put(node.byteValue, code);
        } else {
            if (node.left != null) buildTableRecursive(node.left, code + "0", map);
            if (node.right != null) buildTableRecursive(node.right, code + "1", map);
        }
    }
}
