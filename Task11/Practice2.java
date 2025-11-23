/**
 * Практика #2 - Использование операторов break и continue в циклах
 *
 * Демонстрация применения операторов break для досрочного выхода из цикла
 * и continue для пропуска текущей итерации
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы, демонстрирующий работу операторов
     * break и continue в различных типах циклов
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("=== ОПЕРАТОР BREAK И CONTINUE ===");

        // Пример 1: break в цикле for
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Найдено число 5 - выход из цикла");
                break; // Выход из цикла при i == 5
            }
            System.out.println("Текущее число: " + i);
        }

        // Пример 2: continue в цикле for
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Пропускаем число 3");
                continue; // Пропуск текущей итерации при i == 3
            }
            System.out.println("Обрабатываем число: " + i);
        }

        // Пример 3: break и continue в цикле while
        int count = 0;
        while (count < 10) {
            count++;
            if (count % 2 == 0) {
                continue; // Пропускаем четные числа
            }
            if (count == 7) {
                System.out.println("Достигнуто число 7 - выход");
                break; // Выход при count == 7
            }
            System.out.println("Нечетное число: " + count);
        }

        // Пример 4: break и continue в цикле do-while
        int number = 0;
        do {
            number++;
            if (number == 2) {
                System.out.println("Пропускаем число 2");
                continue; // Пропуск числа 2
            }
            if (number == 4) {
                System.out.println("Достигнуто число 4 - выход");
                break; // Выход при number == 4
            }
            System.out.println("Обрабатываем число: " + number);
        } while (number < 5);
    }
}