/**
 * Практика #1 - Пример обработки и неперехвата исключений
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Метод, который генерирует два исключения
     * Одно перехватывается, другое приводит к аварийной остановке
     */
    public static void generateExceptions() {
        // Первое исключение - перехватывается
        try {
            int result = 10 / 0; // Генерация ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Второе исключение - не перехватывается, приводит к аварийной остановке
        String text = null;
        text.length(); // Генерация NullPointerException
    }

    /**
     * Главный метод программы
     * Демонстрирует обработку одного исключения и аварийную остановку из-за другого
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Начало выполнения программы");

        generateExceptions();

        // Этот код не выполнится из-за неперехваченного исключения
        System.out.println("Конец выполнения программы");
    }
}