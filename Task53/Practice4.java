/**
 * Практика #4 - Пример использования интерфейса AutoCloseable
 *
 * Интерфейс AutoCloseable позволяет использовать ресурсы в конструкции try,
 * которая автоматически закрывает ресурсы после выполнения блока кода, даже при возникновении исключения.
 * Это избавляет от необходимости явно вызывать метод close() в блоке finally и предотвращает утечки ресурсов.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice4 {

    /**
     * класс который реализуюет AutoCloseable
     */
    static class SimpleResource implements AutoCloseable {
        private String name;

        public SimpleResource(String name) {
            this.name = name;
            System.out.println("Resource '" + name + "' created");
        }

        public void use() {
            System.out.println("Using resource '" + name + "'");
        }

        @Override
        public void close() {
            System.out.println("Resource '" + name + "' closed");
        }
    }

    /**
     * Главный метод программы
     * Демонстрирует автоматическое закрытие ресурсов с помощью try
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Использование try для автоматического закрытия
        try (SimpleResource resource = new SimpleResource("TestResource")) {
            resource.use();
        } // ресурс автоматически закроется здесь
    }
}