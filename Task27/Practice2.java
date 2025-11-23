/**
 * Практика #2 - Демонстрация невозможности наследования от final-класса
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Final-класс - от него нельзя наследоваться
     */
    static final class FinalClass {
        public void showMessage() {
            System.out.println("Этот класс нельзя унаследовать");
        }
    }

    /**
     * Обычный класс для сравнения
     */
    static class NormalClass {
        public void showMessage() {
            System.out.println("От этого класса можно наследоваться");
        }
    }

    /**
     * Подкласс от обычного класса - работает нормально
     */
    static class SubClass extends NormalClass {
        @Override
        public void showMessage() {
            System.out.println("Успешное наследование от NormalClass");
        }
    }

    /**
     * закомментировано так как вызовет ошибку компиляции:
     * static class IllegalSubClass extends FinalClass {
     *     @Override
     *     public void showMessage() {
     *         System.out.println("Попытка наследования от final-класса");
     *     }
     * }
     */

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        NormalClass normalObj = new NormalClass();
        SubClass subObj = new SubClass();

        System.out.println("Демонстрация работы классов:");
        finalObj.showMessage();
        normalObj.showMessage();
        subObj.showMessage();

    }
}