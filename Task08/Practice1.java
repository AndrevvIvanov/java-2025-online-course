/**
 * Практика #1 - Демонстрация использования метода decode() в классах-оболочках
 *
 * Метод decode() преобразует строку в число, учитывая различные системы счисления:
 * - Десятичные: "123" (без префикса)
 * - Восьмеричные: "0123" (начинается с 0)
 * - Шестнадцатеричные: "0x123", "0X123", "#123" (0x, 0X, #)
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий работу метода decode()
     * для различных классов-оболочек и систем счисления
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ МЕТОДА decode() ===");

        // Примеры для Integer
        System.out.println("\n--- Класс Integer ---");
        Integer int1 = Integer.decode("123");
        Integer int2 = Integer.decode("0123");
        Integer int3 = Integer.decode("0x7B");
        Integer int4 = Integer.decode("0X7B");
        Integer int5 = Integer.decode("#7B");

        System.out.println("decode(\"123\") = " + int1);
        System.out.println("decode(\"0123\") = " + int2 + " (восьмеричное 123 = десятичное " + 0123 + ")");
        System.out.println("decode(\"0x7B\") = " + int3);
        System.out.println("decode(\"0X7B\") = " + int4);
        System.out.println("decode(\"#7B\") = " + int5);

        // Примеры для Long
        System.out.println("\n--- Класс Long ---");
        Long long1 = Long.decode("123");
        Long long2 = Long.decode("0123");
        Long long3 = Long.decode("0x7B");

        System.out.println("Long.decode(\"123\") = " + long1);
        System.out.println("Long.decode(\"0123\") = " + long2);
        System.out.println("Long.decode(\"0x7B\") = " + long3);

        // Примеры для Short
        System.out.println("\n--- Класс Short ---");
        Short short1 = Short.decode("123");
        Short short2 = Short.decode("0123");
        Short short3 = Short.decode("0x7B");

        System.out.println("Short.decode(\"123\") = " + short1);
        System.out.println("Short.decode(\"0123\") = " + short2);
        System.out.println("Short.decode(\"0x7B\") = " + short3);

        // Примеры для Byte
        System.out.println("\n--- Класс Byte ---");
        Byte byte1 = Byte.decode("123");
        Byte byte2 = Byte.decode("0123");
        Byte byte3 = Byte.decode("0x7B");

        System.out.println("Byte.decode(\"123\") = " + byte1);
        System.out.println("Byte.decode(\"0123\") = " + byte2);
        System.out.println("Byte.decode(\"0x7B\") = " + byte3);

    }
}