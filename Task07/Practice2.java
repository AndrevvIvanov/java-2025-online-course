/**
 * Практика #2 - Демонстрация оператора instanceof
 *
 * Оператор instanceof возвращает true, если объект является экземпляром данного типа или одного из его подклассов.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы, демонстрирующий работу оператора instanceof
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Создаем объекты разных типов
        Object obj1 = "Это строка";
        Object obj2 = 123;
        Object obj3 = null;

        String str = "Hello";
        Integer num = 100;

        // Демонстрация работы оператора instanceof
        System.out.println("=== ДЕМОНСТРАЦИЯ ОПЕРАТОРА instanceof ===");

        // Пример 1: Строка является экземпляром String и Object
        System.out.println("obj1 instanceof String: " + (obj1 instanceof String));
        System.out.println("obj1 instanceof Object: " + (obj1 instanceof Object));

        // Пример 2: Число является экземпляром Integer и Object, но не String
        System.out.println("obj2 instanceof Integer: " + (obj2 instanceof Integer));
        System.out.println("obj2 instanceof Object: " + (obj2 instanceof Object));
        System.out.println("obj2 instanceof String: " + (obj2 instanceof String));

        // Пример 3: null-объект с оператором instanceof
        System.out.println("obj3 instanceof String: " + (obj3 instanceof String));
        System.out.println("obj3 instanceof Object: " + (obj3 instanceof Object));

        // Пример 4: Прямые проверки
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println("num instanceof Integer: " + (num instanceof Integer));

    }
}