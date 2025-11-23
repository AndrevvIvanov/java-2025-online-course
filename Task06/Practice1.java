/**
 * Практика #1 - Изучение утилиты javadoc
 *
 * Этот класс демонстрирует использование javadoc комментариев для документирования Java кода.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 1.0 (2025)
 */
public class Practice1 {

    /**
     * Поле класса, хранящее имя пользователя
     */
    private String userName;

    /**
     * Конструктор класса Practice1
     *
     * @param name имя пользователя для инициализации
     */
    public Practice1(String name) {
        this.userName = name;
    }

    /**
     * Метод для приветствия пользователя
     *
     * @return строку с приветствием
     */
    public String greet() {
        return "Привет, " + userName + "!";
    }

    /**
     * Метод для сложения двух чисел
     *
     * @param a первое число
     * @param b второе число
     * @return сумму двух чисел
     * @throws IllegalArgumentException если любой из параметров отрицательный
     */
    public int add(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Числа не должны быть отрицательными");
        }
        return a + b;
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Practice1 practice = new Practice1("Андрей");

        // приветствуем
        System.out.println(practice.greet());

        // сложение чисел
        int result = practice.add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}