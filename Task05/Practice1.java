/**
 * Практика #1 - Примеры базовых типов данных
 *
 * Демонстрация восьми базовых типов данных Java с примерами ненулевых и нулевых значений.
 * В задании не требовалось приводить примеры для оболочек, а только для типов, поэтому в решении их нет.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // ненулевые примеры
        byte nonZeroByte = 100;
        short nonZeroShort = 30000;
        int nonZeroInt = 2000000000;
        long nonZeroLong = 9000000000000000000L;
        float nonZeroFloat = 3.14f;
        double nonZeroDouble = 2.71828;
        char nonZeroChar = 'A';
        boolean nonZeroBoolean = true;

        // вывод ненулевых значений
        System.out.println("=== Ненулевые значения базовых типов ===");
        System.out.println("byte: " + nonZeroByte);
        System.out.println("short: " + nonZeroShort);
        System.out.println("int: " + nonZeroInt);
        System.out.println("long: " + nonZeroLong);
        System.out.println("float: " + nonZeroFloat);
        System.out.println("double: " + nonZeroDouble);
        System.out.println("char: " + nonZeroChar);
        System.out.println("boolean: " + nonZeroBoolean);

        // нулевые значения базовых типов
        byte zeroByte = 0;
        short zeroShort = 0;
        int zeroInt = 0;
        long zeroLong = 0L;
        float zeroFloat = 0.0f;
        double zeroDouble = 0.0;
        char zeroChar = '\u0000';
        boolean zeroBoolean = false;

        // вывод нулевых значений
        System.out.println("\n=== Нулевые значения базовых типов ===");
        System.out.println("byte: " + zeroByte);
        System.out.println("short: " + zeroShort);
        System.out.println("int: " + zeroInt);
        System.out.println("long: " + zeroLong);
        System.out.println("float: " + zeroFloat);
        System.out.println("double: " + zeroDouble);
        System.out.println("char (как число): " + (int)zeroChar);
        System.out.println("boolean: " + zeroBoolean);
    }
}