/**
 * Практика #3 - Пример использования спецификаторов формата даты и времени
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice3 {

    /**
     * Главный метод программы
     * Демонстрирует использование пяти спецификаторов формата даты и времени
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        java.util.Date currentDate = new java.util.Date();

        System.out.printf("%tH%n", currentDate);// %tH - час в формате 00-23
        System.out.printf("%tM%n", currentDate);// %tM - минуты в формате 00-59
        System.out.printf("%tY%n", currentDate);// %tY - год в четырехзначном формате
        System.out.printf("%tB%n", currentDate);// %tB - полное название месяца
        System.out.printf("%tA%n", currentDate);// %tA - полное название дня недели
    }
}