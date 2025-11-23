/**
 * Практика #2 - Демонстрация реализации перечисления с дополнительными методами
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Перечисление арифметических операций с методами вычисления
     */
    public enum MathOperation {
        ADD("+") {
            public double calculate(double a, double b) {
                return a + b;
            }
        },
        SUBTRACT("-") {
            public double calculate(double a, double b) {
                return a - b;
            }
        },
        MULTIPLY("*") {
            public double calculate(double a, double b) {
                return a * b;
            }
        },
        DIVIDE("/") {
            public double calculate(double a, double b) {
                return a / b;
            }
        };

        private final String symbol;

        MathOperation(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        // Абстрактный метод, который реализует каждая операция
        public abstract double calculate(double a, double b);

        // Дополнительный метод для поиска операции по символу
        public static MathOperation fromSymbol(String symbol) {
            for (MathOperation op : values()) {
                if (op.symbol.equals(symbol)) {
                    return op;
                }
            }
            throw new IllegalArgumentException("Неизвестная операция: " + symbol);
        }
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Демонстрация работы перечисления с дополнительными методами
        double x = 10;
        double y = 5;

        for (MathOperation op : MathOperation.values()) {
            double result = op.calculate(x, y);
            System.out.println(x + " " + op.getSymbol() + " " + y + " = " + result);
        }

        // Демонстрация поиска операции по символу
        MathOperation foundOp = MathOperation.fromSymbol("*");
        System.out.println("\nНайдена операция: " + foundOp + ", результат: " + foundOp.calculate(6, 7));
    }
}