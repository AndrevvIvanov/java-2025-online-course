/**
 * Практика #1 - Вложение класса в интерфейс
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Интерфейс с вложенным классом
     */
    public interface MyInterface {

        /**
         * Вложенный статический класс внутри интерфейса
         */
        static class NestedClass {
            /**
             * Метод вложенного класса
             */
            public void nestedMethod() {
                System.out.println("Метод вложенного класса в интерфейсе");
            }
        }
    }

    /**
     * Главный метод программы
     * Демонстрирует вызов метода вложенного класса из интерфейса
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса и вызов его метода
        MyInterface.NestedClass nestedObj = new MyInterface.NestedClass();
        nestedObj.nestedMethod();
    }
}