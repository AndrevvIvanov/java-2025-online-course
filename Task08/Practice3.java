/**
 * Практика #3 - Исключение NullPointerException при автоупаковке/автораспаковке
 *
 * Демонстрация ситуации, когда при автораспаковке null-значения 
 * класса-оболочки возникает исключение NullPointerException
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice3 {

    /**
     * Главный метод программы, демонстрирующий возникновение NullPointerException
     * при попытке автораспаковки null-значения
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Создаем null-ссылку на объект-оболочку
        Integer nullInteger = null;

        // Попытка автораспаковки null-значения вызовет NullPointerException
        try {
            int primitiveInt = nullInteger; // Автораспаковка null -> NullPointerException
            System.out.println("Значение: " + primitiveInt);
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Причина: попытка автораспаковки null-значения Integer в примитив int");
        }

    }
}