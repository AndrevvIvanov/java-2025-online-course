/**
 * Практика #2 - Решение конфликта default методов при множественном наследовании интерфейсов
 *
 * Если класс реализует два интерфейса с одинаковыми default методами возникает ошибка компиляции,
 * так как компилятор не может определить, какой метод использовать. Для решения этой проблемы
 * класс должен явно переопределить конфликтующий метод и указать реализацию какого интерфейса
 * использовать или предоставить собственную реализацию.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Первый интерфейс с default методом
     */
    interface PrinterA {
        default void print() {
            System.out.println("Печать из PrinterA");
        }
    }

    /**
     * Второй интерфейс с default методом той же сигнатуры
     */
    interface PrinterB {
        default void print() {
            System.out.println("Печать из PrinterB");
        }
    }

    /**
     * Класс реализует оба интерфейса
     * Должен явно переопределить конфликтующий метод
     */
    static class MultiPrinter implements PrinterA, PrinterB {

        /**
         * Явное переопределение конфликтующего метода
         * Можно выбрать одну из реализаций или создать свою
         */
        @Override
        public void print() {
            // Вариант 1: Вызов реализации из PrinterA
            PrinterA.super.print();

            // Вариант 2: Вызов реализации из PrinterB
            // PrinterB.super.print();

            // Вариант 3: Собственная реализация
            // System.out.println("Собственная реализация печати");
        }
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        MultiPrinter printer = new MultiPrinter();
        printer.print();
    }
}