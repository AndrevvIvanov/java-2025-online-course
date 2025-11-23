/**
 * Практика #1 - Типы переменных в операторе switch
 *
 * Демонстрация всех возможных типов переменных, которые могут использоваться
 * в операторе switch в Java :
 * - целочисленные примитивные типы (byte, short, int, char),
 * - их классы-оболочки (Byte, Short, Integer, Character),
 * - String,
 * - enum
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий использование switch
     * с различными типами переменных
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        demonstrateIntegerTypes(); //целочисленные типы
        demonstrateCharType();//символьные типы
        demonstrateStringType();//строковые типы
        demonstrateEnumType();//тип enum
        demonstrateWrapperTypes();//классы-оболочки
    }

    /**
     * Демонстрирует использование switch с целочисленными типами: byte, short, int
     */
    public static void demonstrateIntegerTypes() {
        System.out.println("=== ЦЕЛОЧИСЛЕННЫЕ ТИПЫ ===");

        // int - уровень доступа
        int accessLevel = 2;
        switch (accessLevel) {
            case 0: System.out.println("int: Гость"); break;
            case 1: System.out.println("int: Пользователь"); break;
            case 2: System.out.println("int: Модератор"); break;
            case 3: System.out.println("int: Администратор"); break;
            default: System.out.println("int: Неизвестный уровень доступа");
        }

        // byte - приоритет задачи
        byte taskPriority = 1;
        switch (taskPriority) {
            case 1: System.out.println("byte: Высокий приоритет"); break;
            case 2: System.out.println("byte: Средний приоритет"); break;
            case 3: System.out.println("byte: Низкий приоритет"); break;
            default: System.out.println("byte: Неопределенный приоритет");
        }

        // short - код ошибки
        short errorCode = 404;
        switch (errorCode) {
            case 200: System.out.println("short: Успех"); break;
            case 404: System.out.println("short: Не найдено"); break;
            case 500: System.out.println("short: Ошибка сервера"); break;
            default: System.out.println("short: Неизвестный код ошибки");
        }
    }

    /**
     * Демонстрирует использование switch с символьным типом char
     */
    public static void demonstrateCharType() {
        System.out.println("\n=== СИМВОЛЬНЫЙ ТИП CHAR ===");

        char direction = 'N';
        switch (direction) {
            case 'N': System.out.println("char: Север"); break;
            case 'S': System.out.println("char: Юг"); break;
            case 'E': System.out.println("char: Восток"); break;
            case 'W': System.out.println("char: Запад"); break;
            default: System.out.println("char: Неизвестное направление");
        }
    }

    /**
     * Демонстрирует использование switch со строковым типом String
     */
    public static void demonstrateStringType() {
        System.out.println("\n=== СТРОКОВЫЙ ТИП STRING ===");

        String fruit = "APPLE";
        switch (fruit) {
            case "APPLE": System.out.println("String: Яблоко"); break;
            case "ORANGE": System.out.println("String: Апельсин"); break;
            case "BANANA": System.out.println("String: Банан"); break;
            default: System.out.println("String: Неизвестный фрукт");
        }
    }

    enum VehicleType {CAR, BUS, TRUCK, MOTORCYCLE, BICYCLE}
    /**
     * Демонстрирует использование switch с типом enum
     */
    public static void demonstrateEnumType() {
        System.out.println("\n=== ПЕРЕЧИСЛЕНИЯ ENUM ===");

        VehicleType vehicle = VehicleType.MOTORCYCLE;
        switch (vehicle) {
            case CAR: System.out.println("enum: Легковой автомобиль"); break;
            case BUS: System.out.println("enum: Автобус"); break;
            case TRUCK: System.out.println("enum: Грузовик"); break;
            case MOTORCYCLE: System.out.println("enum: Мотоцикл"); break;
            case BICYCLE: System.out.println("enum: Велосипед"); break;
            default: System.out.println("enum: Неизвестный тип транспорта");
        }
    }

    /**
     * Демонстрирует использование switch с классами-оболочками
     */
    public static void demonstrateWrapperTypes() {
        System.out.println("\n=== КЛАССЫ-ОБОЛОЧКИ ===");

        // Integer - рейтинг
        Integer rating = 5;
        switch (rating) {
            case 1: System.out.println("Integer: Очень плохо"); break;
            case 2: System.out.println("Integer: Плохо"); break;
            case 3: System.out.println("Integer: Удовлетворительно"); break;
            case 4: System.out.println("Integer: Хорошо"); break;
            case 5: System.out.println("Integer: Отлично"); break;
            default: System.out.println("Integer: Неизвестный рейтинг");
        }

        // Character - размер одежды
        Character size = 'M';
        switch (size) {
            case 'S': System.out.println("Character: Маленький размер"); break;
            case 'M': System.out.println("Character: Средний размер"); break;
            case 'L': System.out.println("Character: Большой размер"); break;
            case 'X': System.out.println("Character: Очень большой размер"); break;
            default: System.out.println("Character: Неизвестный размер");
        }
    }
}