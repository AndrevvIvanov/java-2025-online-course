/**
 * Практика #6 - Суждающее преобразование типов
 *
 * При сужающем преобразовании возможна потеря данных
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice6 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        // Пример 1: int -> byte (преобразование без потери данных)
        int intValue = 100;
        byte byteValue = (byte) intValue;  // Явное приведение int к byte
        System.out.println("Пример 1 - int -> byte: " + intValue + " -> " + byteValue);
        // Значение 100 помещается в диапазон byte (-128 до 127), поэтому данные сохраняются

        // Пример 2: int -> byte (преобразование c потерей данных)
        int largeInt = 300;                // 300 превышает максимальное значение byte (127)
        byte truncatedByte = (byte) largeInt; // Произойдет обрезка значения
        System.out.println("\nПример 2 - int -> byte: " + largeInt + " -> " + truncatedByte);
        // 300 > 127, происходит переполнение, 300 - 256 = 44

        // Пример 3: double -> int (потеря дробной части)
        double doubleValue = 123.456;
        int intFromDouble = (int) doubleValue;  // Дробная часть отбрасывается
        System.out.println("\nПример 3 - double -> int: " + doubleValue + " -> " + intFromDouble);
        // Дробная часть .456 теряется при приведении к целому типу
    }
}