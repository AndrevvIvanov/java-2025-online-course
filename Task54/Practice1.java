/**
 * Практика #1 - Чтение данных из текстового файла с помощью Scanner
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice1 {

    /**
     * Главный метод программы
     * Демонстрирует чтение данных из текстового файла с помощью Scanner различных данных
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        try (Scanner fileScanner = new Scanner(new File("example.txt"))) {
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    int number = fileScanner.nextInt();
                    System.out.println("Integer: " + number);
                } else if (fileScanner.hasNextDouble()) {
                    double decimal = fileScanner.nextDouble();
                    System.out.println("Double: " + decimal);
                } else if (fileScanner.hasNextBoolean()) {
                    boolean flag = fileScanner.nextBoolean();
                    System.out.println("Boolean: " + flag);
                } else {
                    String text = fileScanner.next();
                    System.out.println("String: " + text);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}