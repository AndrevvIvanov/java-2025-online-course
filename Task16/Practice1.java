/**
 * Практика #1 - Демонстрация перегрузки и переопределения методов
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Перегрузка методов:");
        // Демонстрация перегрузки методов
        FormValidator validator = new FormValidator();
        System.out.println("Валидация email: " + validator.validate("test@example.com"));
        System.out.println("Валидация числа: " + validator.validate(42));
        System.out.println("Валидация диапазона: " + validator.validate(15, 1, 100));

        System.out.println("\nПереопределение методов:");
        // Демонстрация переопределения методов
        Button basicButton = new Button();
        Button submitButton = new SubmitButton();
        Button imageButton = new ImageButton();

        basicButton.render();
        submitButton.render();    // Переопределенный метод
        imageButton.render();     // Переопределенный метод
    }
}

/**
 * Класс для демонстрации перегрузки методов
 */
class FormValidator {

    // Перегрузка метода validate с разными параметрами

    /**
     * Валидация email
     */
    public boolean validate(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    /**
     * Валидация положительного числа
     */
    public boolean validate(int number) {
        return number > 0;
    }

    /**
     * Валидация числа в диапазоне
     */
    public boolean validate(int number, int min, int max) {
        return number >= min && number <= max;
    }

    /**
     * Валидация длины строки
     */
    public boolean validate(String text, int maxLength) {
        return text != null && text.length() <= maxLength;
    }
}

/**
 * Базовый класс для демонстрации переопределения методов
 */
class Button {

    /**
     * Метод, который будет переопределен в подклассах
     */
    public void render() {
        System.out.println("Отрисовка базовой кнопки");
    }

    /**
     * Перегруженный метод для указания позиции
     */
    public void render(int x, int y) {
        System.out.println("Отрисовка кнопки в позиции (" + x + ", " + y + ")");
    }
}

/**
 * Подкласс с переопределением метода
 */
class SubmitButton extends Button {

    /**
     * Переопределенный метод
     */
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки отправки с зеленым цветом");
    }

    /**
     * Перегруженный метод в подклассе
     */
    public void render(boolean disabled) {
        if (disabled) {
            System.out.println("Отрисовка неактивной кнопки отправки");
        } else {
            System.out.println("Отрисовка активной кнопки отправки");
        }
    }
}

/**
 * Другой подкласс с переопределением метода
 */
class ImageButton extends Button {

    /**
     * Переопределенный метод
     */
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки с изображением");
    }

    /**
     * Перегруженный метод в подклассе
     */
    public void render(String imagePath) {
        System.out.println("Отрисовка кнопки с изображением: " + imagePath);
    }
}