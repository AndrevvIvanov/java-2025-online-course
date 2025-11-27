/**
 * Практика #3 - Пример использования текстовых блоков с тройными кавычками
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice3 {

    /**
     * Главный метод программы
     * Демонстрирует использование текстовых блоков с тройными кавычками
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        //пример HTML-кода
        String html = """
            <html>
                <body>
                    <h1>Заголовок страницы</h1>
                    <p>текст</p>
                </body>
            </html>
            """;

        System.out.println(html);

        //пример SQL запроса
        String sql = """
            SELECT id, name, email 
            FROM users 
            WHERE status = 'active' 
            """;

        System.out.println(sql);
    }
}