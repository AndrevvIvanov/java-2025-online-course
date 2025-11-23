/**
 * Практика #1 - Демонстрация перегрузки метода с переменным числом параметров
 *
 * Пример класса с перегруженными методами, использующими varargs (переменное число параметров)
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий работу перегруженных методов с varargs
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Сумма целых чисел: " + calculator.sum(1, 2, 3, 4, 5));
        System.out.println("Сумма дробных чисел: " + calculator.sum(1.5, 2.5, 3.5));
        System.out.println("Конкатенация строк: " + calculator.sum("кошка", "собака", "птичка"));
        System.out.println("Сумма массивов: " + calculator.sum(new int[]{1, 2}, new int[]{3, 4}));
    }
}

/**
 * Класс Calculator с перегруженными методами sum, использующими переменное число параметров
 */
class Calculator {

    /**
     * Суммирует переменное количество целых чисел
     *
     * @param numbers целые числа для суммирования
     * @return сумма всех переданных чисел
     */
    public int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    /**
     * Суммирует переменное количество дробных чисел
     *
     * @param numbers дробные числа для суммирования
     * @return сумма всех переданных чисел
     */
    public double sum(double... numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    /**
     * Конкатенирует переменное количество строк
     *
     * @param strings строки для конкатенации
     * @return результирующая строка после конкатенации
     */
    public String sum(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    /**
     * Суммирует элементы переменного количества массивов целых чисел
     *
     * @param arrays массивы целых чисел для суммирования
     * @return сумма всех элементов всех массивов
     */
    public int sum(int[]... arrays) {
        int result = 0;
        for (int[] array : arrays) {
            for (int num : array) {
                result += num;
            }
        }
        return result;
    }
}