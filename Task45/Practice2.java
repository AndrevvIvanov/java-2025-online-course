/**
 * Практика #2 - Примеры генерации и обработки исключений
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы
     * Демонстрирует генерацию и обработку различных типов исключений
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // ArithmeticException - деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] array = new int[5];
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // IllegalArgumentException - неверный аргумент
        try {
            throw new IllegalArgumentException("IllegalArgument");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // ClassCastException - неверное приведение типов
        try {
            Object obj = "Строка";
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // NullPointerException - обращение к null ссылке
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}