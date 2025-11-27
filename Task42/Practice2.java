/**
 * Практика #2 - Примеры использования класса StringJoiner
 *
 * StringJoiner используется для объединения строк с указанным разделителем
 * также может добавлять префикс и суффикс к результирующей строке.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы
     * Демонстрирует работу класса StringJoiner
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        //список через запятую
        java.util.StringJoiner list = new java.util.StringJoiner(", ");
        list.add("test1");
        list.add("test2");
        list.add("test3");
        System.out.println(list.toString());

        // тройка чисел - зддесь появляются суффикс и префикс
        java.util.StringJoiner triple = new java.util.StringJoiner(", ", "(", ")");
        triple.add("100");
        triple.add("200");
        triple.add("300");
        System.out.println(triple.toString());
    }
}