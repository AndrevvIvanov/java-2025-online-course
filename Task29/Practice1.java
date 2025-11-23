/**
 * Практика #1 - Пример перегруженных методов
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Класс Calculator с перегруженными методами
     */
    static class Calculator {

        /**
         * Сложение двух целых чисел
         * @param a первое целое число
         * @param b второе целое число
         * @return сумма a и b
         */
        public int add(int a, int b) {
            return a + b;
        }

        /**
         * Сложение трех целых чисел
         * @param a первое целое число
         * @param b второе целое число
         * @param c третье целое число
         * @return сумма a, b и c
         */
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    /**
     * Главный метод программы для демонстрации работы перегруженных методов
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сложение двух целых: " + calc.add(5, 3));
        System.out.println("Сложение трех целых: " + calc.add(5, 3, 2));
    }
}