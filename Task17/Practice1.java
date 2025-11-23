/**
 * Практика #1 - Варианты вызова статического метода
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий все варианты вызова статического метода
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // 1. Вызов через имя класса
        System.out.println("1. Через имя класса:");
        A.printVars();

        // 2. Вызов через объект класса
        System.out.println("2. Через объект класса:");
        A obj = new A();
        obj.printVars();

        // 3. Внутри статического метода
        System.out.println("3. Внутри статического метода:");
        A.staticRun();

        // 4. Внутри нестатического метода
        System.out.println("4. Внутри нестатического метода:");
        A.staticRun();

        // 5. Вызов через наследование (если бы был подкласс)
        System.out.println("5. Через подкласс:");
        B b = new B();
        b.callParentStaticMethod();
    }
}

/**
 * Класс A данный по условию, в который добавлены два вызова метода printVars
 */
class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void staticRun() {
        printVars();
    }

    public void run() {
        printVars();
    }
}

/**
 * Подкласс для демонстрации вызова статического метода родителя
 */
class B extends A {
    public void callParentStaticMethod() {
        // Можно вызвать через имя класса
        A.printVars();
        // Или через наследование
        printVars();
    }
}