/**
 * Практика #1 - Демонстрация использования ключевого слова super
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Базовый класс кнопки
     */
    static class Button {
        protected String text = "Кнопка";

        public Button(String text) {
            this.text = text;
        }

        public void render() {
            System.out.println("Отрисовка базовой кнопки");
        }
    }

    /**
     * Подкласс кнопки отправки
     */
    static class SubmitButton extends Button {
        private String text = "Отправить";

        public SubmitButton() {
            super("Кнопка отправки"); // 1. Обращение к конструктору суперкласса
        }

        public void displayText() {
            System.out.println("Локальный текст: " + this.text);
            System.out.println("Текст суперкласса: " + super.text); // 2. Доступ к полю суперкласса
        }

        @Override
        public void render() {
            super.render(); // 3. Доступ к методу суперкласса
            System.out.println("Отрисовка кнопки отправки с зеленым цветом");
        }
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        SubmitButton submitBtn = new SubmitButton();
        submitBtn.displayText();
        submitBtn.render();
    }
}