/**
 * Практика #1 - Пример default и static методов в интерфейсе
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Интерфейс с default и static методами
     */
    interface MessageService {

        /**
         * Default метод - неабстрактный метод с реализацией по умолчанию
         */
        default void showMessage(String text) {
            System.out.println("Сообщение: " + text);
        }

        /**
         * Static метод - вызывается через имя интерфейса
         */
        static void printInfo() {
            System.out.println("Информация о сервисе сообщений");
        }
    }

    /**
     * Класс, реализующий интерфейс MessageService
     * Использует default метод без переопределения
     */
    static class SimpleMessenger implements MessageService {
        // Наследует default метод showMessage без необходимости его реализации
    }

    /**
     * Главный метод программы
     * Демонстрирует все способы вызова методов интерфейса
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        SimpleMessenger messenger = new SimpleMessenger();

        // Способ 1: Вызов default метода через объект класса
        messenger.showMessage("тест");

        // Способ 2: Вызов static метода через имя интерфейса
        MessageService.printInfo();
    }
}