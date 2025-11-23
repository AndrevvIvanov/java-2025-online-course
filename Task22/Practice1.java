/**
 * Практика #1 - Использование instanceof с параметризованными классами
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий использование instanceof
     * с объектами параметризованных классов
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(42);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14);

        Object obj1 = intWrapper;
        Object obj2 = stringWrapper;
        Object obj3 = doubleWrapper;
        Object obj4 = "Not a wrapper";

        // Использование instanceof с параметризованными классами
        System.out.println("obj1 instanceof Wrapper: " + (obj1 instanceof Wrapper));
        System.out.println("obj2 instanceof Wrapper: " + (obj2 instanceof Wrapper));
        System.out.println("obj3 instanceof Wrapper: " + (obj3 instanceof Wrapper));
        System.out.println("obj4 instanceof Wrapper: " + (obj4 instanceof Wrapper));

        // Демонстрация безопасного приведения с проверкой instanceof
        processWrapper(obj1);
        processWrapper(obj2);
        processWrapper(obj3);
        processWrapper(obj4);
    }

    /**
     * Метод для безопасной обработки Wrapper объектов
     *
     * @param obj объект для проверки и обработки
     */
    public static void processWrapper(Object obj) {
        if (obj instanceof Wrapper) {
            Wrapper<?> wrapper = (Wrapper<?>) obj;
            System.out.println("Обнаружен Wrapper с значением: " + wrapper.getItem());
        } else {
            System.out.println("Объект не является Wrapper: " + obj);
        }
    }
}

/**
 * Параметризованный класс-обертка
 *
 * @param <T> тип хранимого значения
 */
class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}