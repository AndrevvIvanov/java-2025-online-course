/**
 * Практика #1 - Демонстрация инициализации элементов перечисления
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Перечисление статусов заказа с простой инициализацией
     */
    public enum OrderStatus {
        NEW(1),
        PROCESSING(2),
        COMPLETED(3),
        CANCELLED(0);

        private final int code;

        OrderStatus(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.NEW;
        System.out.println("Статус: " + status + ", код: " + status.getCode());

        // Использование в switch
        switch (status) {
            case NEW:
                System.out.println("Новый заказ");
                break;
            case PROCESSING:
                System.out.println("Заказ в обработке");
                break;
            case COMPLETED:
                System.out.println("Заказ завершен");
                break;
            case CANCELLED:
                System.out.println("Заказ отменен");
                break;
        }

        // Простой перебор всех статусов
        for (OrderStatus s : OrderStatus.values()) {
            System.out.println(s + " - код: " + s.getCode());
        }
    }
}