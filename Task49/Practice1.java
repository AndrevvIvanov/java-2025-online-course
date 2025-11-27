/**
 * Практика #1 - Пример собственного класса исключения
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * кастомное исключение для демонстрации создания собственных исключений
     */
    static class CustomException extends Exception {

        /**
         * Конструктор по умолчанию
         */
        public CustomException() {
            super();
        }

        /**
         * Конструктор с сообщением об ошибке
         * @param message описание ошибки
         */
        public CustomException(String message) {
            super(message);
        }

        /**
         * Конструктор с сообщением и причиной исключения
         * @param message описание ошибки
         * @param cause исходное исключение
         */
        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Метод, который генерирует пользовательское исключение
     */
    public static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number cannot be negative: " + number);
        }
    }

    /**
     * Главный метод программы
     * Демонстрирует использование пользовательского исключения
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        try {
            validateNumber(-5);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}