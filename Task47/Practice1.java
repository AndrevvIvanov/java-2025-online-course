/**
 * Практика #1 - Примеры обработки нескольких исключений
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    // Создаем иерархию исключений
    static class Ex1 extends Exception {}
    static class Ex2 extends Ex1 {}
    static class Ex3 extends Ex2 {}

    /**
     * Главный метод программы
     * Демонстрирует две ситуации обработки исключений
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        //несколько исключений обрабатываются одинаково
        try {
            int random = (int) (Math.random() * 3);
            if (random == 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (random == 1) {
                throw new NullPointerException();
            } else {
                throw new IllegalArgumentException();
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Одинаковая обработка для разных исключений: " + e.getClass().getSimpleName());
        }

        //иерархия исключений Ex1 <- Ex2 <- Ex3
        try {
            throw new Ex3(); // Генерируем исключение самого нижнего уровня
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }
}