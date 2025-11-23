/**
 * Практика #1 - Примеры использования аннотаций
 *
 * Аннотации используются для предоставления метаданных коду:
 * - @Override указывает, что метод переопределяет метод суперкласса и проверяет это на этапе компиляции
 * - @Deprecated помечает устаревшие элементы, которые не рекомендуется использовать
 * - @SuppressWarnings убирает предупреждения компилятора для конкретного элемента
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Базовый класс для демонстрации @Override
     */
    static class BaseClass {
        public void display() {
            System.out.println("Метод базового класса");
        }
    }

    /**
     * Производный класс с использованием аннотаций
     */
    static class DerivedClass extends BaseClass {

        /**
         * Аннотация @Override гарантирует, что метод переопределяет метод суперкласса
         * Если метод не будет найден в суперклассе - компилятор сообщит об ошибке
         */
        @Override
        public void display() {
            System.out.println("Переопределенный метод");
        }

        /**
         * Аннотация @Deprecated помечает устаревший метод
         * Компилятор выдаст предупреждение при использовании этого метода
         */
        @Deprecated
        public void oldMethod() {
            System.out.println("Устаревший метод");
        }

        /**
         * Аннотация @SuppressWarnings убирает предупреждения компилятора
         * В данном случае подавляется предупреждение о неиспользуемой переменной
         */
        @SuppressWarnings("unused")
        public void methodWithWarning() {
            int unusedVariable = 42; // Обычно компилятор выдал бы предупреждение
        }

        /**
         * Новый метод, заменяющий устаревший
         */
        public void newMethod() {
            System.out.println("Новый метод");
        }
    }

    /**
     * Главный метод программы для демонстрации работы аннотаций
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();

        // Демонстрация @Override
        obj.display();

        // Демонстрация @Deprecated - при использовании будет предупреждение
        obj.oldMethod();

        // Демонстрация @SuppressWarnings
        obj.methodWithWarning();

        // Использование нового метода вместо устаревшего
        obj.newMethod();
    }
}