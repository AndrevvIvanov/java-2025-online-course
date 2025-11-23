import java.util.Scanner;

/**
 * Практика #1 - программа, которая просит ввести имя и выводит на консоль строку "Привет, <введенное имя>"
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.next();
        // Пользуемся методом "scan.next();", который представлен на курсе

        System.out.println("Привет, " + name);

        scanner.close();
    }
}