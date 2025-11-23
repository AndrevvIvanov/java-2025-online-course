/**
 * Практика #5 - Расширяющие преобразования базовых типов в арифметических выражениях
 *
 * Правило: byte -> short -> int -> long -> float -> double
 * Результат операции соответствует большему из типов операндов
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice5 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("=== Демонстрация расширяющих преобразований ===");

        // Пример 1: byte + short -> int
        // byte (8 бит) и short (16 бит) автоматически расширяются до int (32 бита)
        byte b = 10;
        short s = 20;
        int result1 = b + s;  // byte + short = int
        System.out.println("Пример 1 - byte + short: " + b + " + " + s + " = " + result1 + " (тип: int)");

        // Пример 2: int + long -> long  
        // int (32 бита) расширяется до long (64 бита) при операции с long
        int i = 100;
        long l = 200L;
        long result2 = i + l;  // int + long = long
        System.out.println("Пример 2 - int + long: " + i + " + " + l + " = " + result2 + " (тип: long)");

        // Пример 3: long + float -> float
        // long (64 бита) расширяется до float (32 бита) - возможна потеря точности
        long longVal = 123456789L;
        float f = 3.14f;
        float result3 = longVal + f;  // long + float = float
        System.out.println("Пример 3 - long + float: " + longVal + " + " + f + " = " + result3 + " (тип: float)");

        // Пример 4: float + double -> double
        // float (32 бита) расширяется до double (64 бита)
        float floatVal = 2.5f;
        double d = 1.5;
        double result4 = floatVal + d;  // float + double = double
        System.out.println("Пример 4 - float + double: " + floatVal + " + " + d + " = " + result4 + " (тип: double)");

        // Пример 5: byte + double -> double
        // byte (8 бит) расширяется до double (64 бита) через цепочку преобразований
        byte byteVal = 5;
        double doubleVal = 2.5;
        double result5 = byteVal + doubleVal;  // byte + double = double
        System.out.println("Пример 5 - byte + double: " + byteVal + " + " + doubleVal + " = " + result5 + " (тип: double)");

        // Пример 6: char + int -> int
        // char (16 бит) расширяется до int (32 бита)
        char c = 'A';  // Unicode значение 65
        int intVal = 10;
        int result6 = c + intVal;  // char + int = int
        System.out.println("Пример 6 - char + int: '" + c + "' (" + (int)c + ") + " + intVal + " = " + result6 + " (тип: int)");
    }
}