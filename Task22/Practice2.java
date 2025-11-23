import java.util.ArrayList;
import java.util.List;

/**
 * Практика #2 - Демонстрация использования конструкций <? extends ?> и <? super ?>
 *
 * Примеры использования generic.
 * <? extends T> позволяет работать с T и его подклассами (producer - чтение данных).
 * <? super T> позволяет работать с T и его суперклассами (consumer - запись данных).
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Класс-пример для демонстрации <? extends T>
     * Ограничивает параметр типа T классами, реализующими Comparable<T>
     *
     * @param <T> тип элемента, должен реализовывать Comparable<T>
     */
    static class ExtendsExample<T extends Comparable<T>> {
        private T item;

        /**
         * Устанавливает значение элемента
         *
         * @param item устанавливаемое значение
         */
        public void setItem(T item) {
            this.item = item;
        }

        /**
         * Возвращает значение элемента
         *
         * @return значение элемента
         */
        public T getItem() {
            return item;
        }

        /**
         * Находит максимальный элемент в списке используя <? extends T>
         * Может принимать списки с элементами типа T или его подклассов
         *
         * @param <T> тип элементов в списке
         * @param list список для поиска максимума
         * @return максимальный элемент или null если список пуст
         */
        public static <T extends Comparable<T>> T getMaxFlexible(List<? extends T> list) {
            if (list == null || list.isEmpty()) return null;
            T max = list.get(0);
            for (T item : list) {
                if (item.compareTo(max) > 0) max = item;
            }
            return max;
        }
    }

    /**
     * Класс-пример для демонстрации <? super T>
     *
     * @param <T> тип элемента
     */
    static class SuperExample<T> {
        private T item;

        /**
         * Устанавливает значение элемента
         *
         * @param item устанавливаемое значение
         */
        public void setItem(T item) {
            this.item = item;
        }

        /**
         * Возвращает значение элемента
         *
         * @return значение элемента
         */
        public T getItem() {
            return item;
        }

        /**
         * Копирует элементы из исходного списка в целевой используя <? super T> и <? extends T>
         * Может копировать из списка с элементами T или его подклассов в список с элементами T или его суперклассов
         *
         * @param <T> тип элементов
         * @param dest целевой список (consumer - принимает данные)
         * @param src исходный список (producer - предоставляет данные)
         */
        public static <T> void copyFlexible(List<? super T> dest, List<? extends T> src) {
            for (T item : src) {
                dest.add(item);
            }
        }
    }

    /**
     * Главный метод программы, демонстрирующий работу конструкций <? extends T> и <? super T>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Демонстрация работы <? extends T> и <? super T>");

        // Создаем списки для демонстрации
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println("\nДемонстрация <? extends T> - чтение данных:");
        Number max1 = ExtendsExample.getMaxFlexible(integers);
        Number max2 = ExtendsExample.getMaxFlexible(doubles);
        System.out.println("Максимум в integers: " + max1);
        System.out.println("Максимум в doubles: " + max2);

        System.out.println("\nДемонстрация <? super T> - запись данных:");
        SuperExample.copyFlexible(numbers, integers);
        SuperExample.copyFlexible(objects, integers);
        System.out.println("Содержимое numbers после копирования: " + numbers);
        System.out.println("Содержимое objects после копирования: " + objects);
    }
}