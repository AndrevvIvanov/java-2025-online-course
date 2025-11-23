/**
 * Практика #4 - Демонстрация перегруженного оператора + с объектами типа String и переменными других типов
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice4 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Примеры переменных разных типов
        int number = 42;
        double price = 19.99;
        boolean available = true;
        char currency = '$';

        // Строковые переменные
        String product = "Кофе";
        String category = "Напитки";

        System.out.println("=== Демонстрация перегруженного оператора + ===");

        // Пример 1: Конкатенация строк с числами
        // При использовании + со строкой и числом, число автоматически преобразуется в строку
        String description = product + " стоит " + price + currency;
        System.out.println("Пример 1: " + description);

        // Пример 2: Порядок операций имеет значение
        // Без скобок: конкатенация происходит слева направо
        String result1 = "Итог: " + number + 10;
        // Со скобками: сначала выполняется математическая операция
        String result2 = "Итог: " + (number + 10);

        System.out.println("Пример 2a (без скобок): " + result1);
        System.out.println("Пример 2b (со скобками): " + result2);

        // Пример 3: Конкатенация с boolean
        // Boolean автоматически преобразуется в "true" или "false"
        String status = "Товар " + product + " доступен: " + available;
        System.out.println("Пример 3: " + status);

        // Пример 4: Множественная конкатенация
        String fullDescription = "Категория: " + category +
                ", Товар: " + product +
                ", Цена: " + price + currency +
                ", В наличии: " + available;
        System.out.println("Пример 4: " + fullDescription);

        // Пример 5: Конкатенация null значений
        String nullString = null;
        String resultWithNull = "Значение: " + nullString; // null преобразуется в "null"
        System.out.println("Пример 5: " + resultWithNull);
    }
}