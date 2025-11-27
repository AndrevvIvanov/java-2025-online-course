/**
 * Практика #1 - Пример использования метода read() класса InputStream
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы
     * Демонстрирует работу метода read() на примере ByteArrayInputStream
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        byte[] data = {116, 101, 115, 116};

        try (java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream(data)) {
            // чтение из массива data, должо получиться  t, e, s, t
            int byteRead;
            while ((byteRead = input.read()) != -1) {
                System.out.println("Read byte: " + byteRead + " -> '" + (char) byteRead + "'");
            }
        } catch (java.io.IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}