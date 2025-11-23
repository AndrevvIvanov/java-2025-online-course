/**
 * Практика #1 - Тривиальные примеры бесконечных циклов
 *
 * Демонстрация бесконечных циклов для конструкций while и do-while
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий бесконечные циклы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.out.println("=== БЕСКОНЕЧНЫЕ ЦИКЛЫ ===");

        // Пример 1: бесконечный цикл while с всегда истинным условием
        while (true) {
            System.out.println("Этот цикл будет выполняться вечно");
        }

        // Пример 2: бесконечный цикл while без изменения условия
        int counter = 0;
        while (counter < 5) {
            System.out.println("counter = " + counter);
            // Отсутствует counter++ - условие никогда не изменится
        }

        // Пример 3: бесконечный цикл do-while с всегда истинным условием
        do {
         System.out.println("Этот цикл тоже будет выполняться вечно");
        } while (true);

    }
}