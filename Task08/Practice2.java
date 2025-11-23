/**
 * Практика #2 - Все способы создания экземпляра класса Boolean
 *
 * Демонстрация различных методов создания объектов Boolean.
 * Конструкторы new Boolean() начиная с Java 9 не рекомендуются к использованию.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы, демонстрирующий все способы создания Boolean
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // 1. Статический метод valueOf(boolean)
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(): " + bool1 + ", " + bool2);

        // 2. Статический метод valueOf(String)
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        Boolean bool5 = Boolean.valueOf("True");
        Boolean bool6 = Boolean.valueOf("anything");
        System.out.println("Boolean.valueOf(String): " + bool3 + ", " + bool4 + ", " + bool5 + ", " + bool6);

        // 3. Статические константы
        Boolean bool7 = Boolean.TRUE;
        Boolean bool8 = Boolean.FALSE;
        System.out.println("Boolean.TRUE/FALSE: " + bool7 + ", " + bool8);

        // 4. Автоупаковка boolean
        Boolean bool9 = true;
        Boolean bool10 = false;
        System.out.println("Автоупаковка: " + bool9 + ", " + bool10);

        // 5. Парсинг строки
        Boolean bool11 = Boolean.parseBoolean("true");
        Boolean bool12 = Boolean.parseBoolean("false");
        Boolean bool13 = Boolean.parseBoolean("yes");
        System.out.println("Boolean.parseBoolean(): " + bool11 + ", " + bool12 + ", " + bool13);

        // 6. Конструктор с boolean - устаревшийё
        Boolean bool14 = new Boolean(true);
        Boolean bool15 = new Boolean(false);
        System.out.println("new Boolean(boolean): " + bool14 + ", " + bool15);

        // 7. Конструктор со строкой - устаревший
        Boolean bool16 = new Boolean("true");
        Boolean bool17 = new Boolean("false");
        Boolean bool18 = new Boolean("TRUE");
        Boolean bool19 = new Boolean("any_text");
        System.out.println("new Boolean(String): " + bool16 + ", " + bool17 + ", " + bool18 + ", " + bool19);
    }
}