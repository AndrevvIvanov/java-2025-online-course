/**
 * Практика #1 - Демонстрация невозможности переопределения final-метода в подклассе
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Базовый класс с final-методом
     */
    static class BaseClass {
        // final-метод не может быть переопределен в подклассах
        public final void finalMethod() {
            System.out.println("Этот метод нельзя переопределить");
        }

        // Обычный метод для сравнения
        public void normalMethod() {
            System.out.println("Этот метод можно переопределить");
        }
    }

    /**
     * Подкласс, пытающийся переопределить final-метод
     */
    static class SubClass extends BaseClass {
        // Этот метод работает нормально - переопределение разрешено
        @Override
        public void normalMethod() {
            System.out.println("Переопределенный нормальный метод");
        }

        // это вызовет ошибку компиляции, поэтому закомментировано:
        // @Override
        // public void finalMethod() {
        //     System.out.println("Попытка переопределить final-метод");
        // }
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        SubClass sub = new SubClass();

        System.out.println("Демонстрация работы методов:");
        base.finalMethod();
        base.normalMethod();

        System.out.println("\nВ подклассе:");
        sub.finalMethod();  // Вызывает унаследованный final-метод
        sub.normalMethod(); // Вызывает переопределенный метод
    }
}