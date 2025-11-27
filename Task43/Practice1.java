/**
 * Практика #1 - Демонстрация методов классов StringBuffer и StringBuilder
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы
     * Демонстрирует работу методов StringBuffer и StringBuilder
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Демонстрация методов StringBuffer
        System.out.println("StringBuffer методы");
        StringBuffer sbuffer = new StringBuffer("test test");

        sbuffer.append(" append"); // добавляет строку в конец
        System.out.println(sbuffer.toString());

        sbuffer.insert(4, " INSERT"); // вставляет строку в указанную позицию
        System.out.println(sbuffer.toString());

        sbuffer.delete(4, 11); // удаляет символы в указанном диапазоне
        System.out.println(sbuffer.toString());

        sbuffer.reverse(); // переворачивает строку
        System.out.println(sbuffer.toString());
        sbuffer.reverse(); // возвращаем обратно

        sbuffer.replace(0, 4, "REPLACED"); // заменяет символы в указанном диапазоне
        System.out.println(sbuffer.toString());

        System.out.println(sbuffer.capacity()); // возвращает текущую емкость буфера

        sbuffer.setLength(5); // устанавливает новую длину строки
        System.out.println(sbuffer.toString());

        System.out.println(sbuffer.charAt(0)); // возвращает символ по указанному индексу

        sbuffer.setCharAt(0, 'r'); // устанавливает символ по указанному индексу
        System.out.println(sbuffer.toString());

        System.out.println(sbuffer.substring(1, 4)); // возвращает подстроку

        // Демонстрация методов StringBuilder
        System.out.println("\nStringBuilder методы");
        StringBuilder sbuilder = new StringBuilder("test test");

        sbuilder.append(123); // добавляет данные разных типов в конец
        System.out.println(sbuilder.toString());

        sbuilder.deleteCharAt(8); // удаляет символ по указанному индексу
        System.out.println(sbuilder.toString());

        System.out.println(sbuilder.indexOf("test")); // возвращает индекс первого вхождения подстроки

        System.out.println(sbuilder.lastIndexOf("t")); // возвращает индекс последнего вхождения подстроки

        System.out.println(sbuilder.length()); // возвращает текущую длину строки

        sbuilder.ensureCapacity(50); // гарантирует минимальную емкость буфера
        System.out.println(sbuilder.capacity());

        sbuilder.trimToSize(); // уменьшает емкость до текущей длины строки
        System.out.println(sbuilder.capacity());

        System.out.println(sbuilder.codePointAt(0)); // возвращает код Unicode символа по индексу

        System.out.println(sbuilder.codePointBefore(1)); // возвращает код Unicode предыдущего символа

        char[] chars = new char[4];
        sbuilder.getChars(0, 4, chars, 0); // копирует символы в массив
        System.out.println(new String(chars));
    }
}