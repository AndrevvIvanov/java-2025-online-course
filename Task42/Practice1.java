/**
 * Практика #1 - Демонстрация методов класса String
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы
     * Демонстрирует работу 10 различных методов класса String
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String demoString = "test test test";
        String demoString2 = "TEST";
        String demoString3 = "    spaces    ";
        String demoString4 = "test";
        String demoString5 = "test";

        System.out.println(demoString.length());//length() возвращает длину строки
        System.out.println(demoString.charAt(5));//charAt() возвращает символ по указанному индексу
        System.out.println(demoString.substring(0, 4));//возвращает подстроку
        System.out.println(demoString.toUpperCase());// преобразует строку в верхний регистр
        System.out.println(demoString2.toLowerCase());//toLowerCase() - преобразует строку в нижний регистр
        System.out.println(demoString3.trim());//trim() удаляет пробелы в начале и конце строки
        System.out.println(demoString.replace('e', 'p'));//replace() заменяет все вхождения символа или подстроки
        String[] items = demoString.split(" "); //split() разбивает строку на массив подстрок по разделителю
        System.out.println(java.util.Arrays.toString(items));
        System.out.println(demoString4.equals(demoString5));//equals() - сравнивает строку с другим объектом
        System.out.println(demoString.contains("test"));//contains() проверяет содержит ли строка указанную строку
    }
}