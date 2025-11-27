/**
 * Практика #2 - Пример использования метода write(int) класса OutputStream
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы
     * Демонстрирует работу метода write(int) на примере ByteArrayOutputStream
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        try (java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream()) {
            output.write(116); // t
            output.write(101); // e
            output.write(115); // s
            output.write(116); // t
            // опять test но теперь Output

            byte[] result = output.toByteArray();
            System.out.println("Written data: " + new String(result));
        } catch (java.io.IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}