/**
 * Практика #1 - Принцип подстановки Барбары Лисков
 *
 * Принцип Лисков: объекты в программе должны быть заменяемыми на экземпляры их подтипов
 * без изменения правильности программы. Подклассы должны дополнять, а не изменять 
 * ожидаемое поведение базового класса.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Базовый класс для обработчиков платежей
     */
    static abstract class PaymentProcessor {
        protected double amount;

        public PaymentProcessor(double amount) {
            this.amount = amount;
        }

        /**
         * Метод обработки платежа
         * @return true если платеж успешен
         */
        public abstract boolean processPayment();

        /**
         * Метод валидации платежа
         * @return true если валидация пройдена
         */
        public boolean validatePayment() {
            return amount > 0 && amount <= 10000;
        }
    }

    /**
     * Обработчик кредитных карт - следует принципу Лисков
     */
    static class CreditCardProcessor extends PaymentProcessor {
        public CreditCardProcessor(double amount) {
            super(amount);
        }

        @Override
        public boolean processPayment() {
            if (!validatePayment()) return false;
            System.out.println("Processing credit card payment: " + amount);
            return true;
        }
    }

    /**
     * Обработчик PayPal - следует принципу Лисков
     */
    static class PayPalProcessor extends PaymentProcessor {
        public PayPalProcessor(double amount) {
            super(amount);
        }

        @Override
        public boolean processPayment() {
            if (!validatePayment()) return false;
            System.out.println("Processing PayPal payment: " + amount);
            return true;
        }
    }

    /**
     * Класс для обработки заказов, который работает с любым PaymentProcessor
     */
    static class OrderService {
        public void processOrder(PaymentProcessor processor) {
            if (processor.processPayment()) {
                System.out.println("Order completed successfully");
            } else {
                System.out.println("Payment failed");
            }
        }
    }

    /**
     * Главный метод программы
     * Демонстрирует принцип подстановки Лисков в платежной системе
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // используем разные обработчики платежей
        PaymentProcessor creditCard = new CreditCardProcessor(150.0);
        PaymentProcessor paypal = new PayPalProcessor(75.5);

        orderService.processOrder(creditCard);
        orderService.processOrder(paypal);

        //заменяемость в массиве
        PaymentProcessor[] processors = {
                new CreditCardProcessor(200.0),
                new PayPalProcessor(300.0)
        };

        for (PaymentProcessor processor : processors) {
            orderService.processOrder(processor);
        }
    }
}