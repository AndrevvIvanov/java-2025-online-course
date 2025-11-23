/**
 * Практика #1 - Способы инициализации final поля
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий способы инициализации final поля
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        A1 obj1 = new A1();
        System.out.println("Сразу присвоили значение: " + obj1.a);

        A2 obj2 = new A2(99);
        System.out.println("Через параметризованный конструктор: " + obj2.a);

        A3 obj3 = new A3();
        System.out.println("Через конструктор по умолчанию: " + obj3.a);

        A4 obj4 = new A4();
        System.out.println("Через блок инициализации: " + obj4.a);
    }
}

/**
 * Класс A с final полем, сразу присвоили значение
 */
class A1 {
    public final int a = 45; // сразу присвоили значение

    public void print() {
        System.out.println(a);
    }
}

/**
 * Класс A с final полем, параметризованный конструктор
 */
class A2 {
    public final int a;

    public A2(int value) {
        this.a = value; // инициализация через параметризованный конструктор
    }

    public void print() {
        System.out.println(a);
    }
}

/**
 * Класс A с final полем, конструктор по умполчанию
 */
class A3 {
    public final int a;

    public A3() {
        this.a = 100; // инициализация через конструктор значением по умолчанию
    }

    public void print() {
        System.out.println(a);
    }
}

/**
 * Класс A с final полем, блок инициализации
 */
class A4 {
    public final int a;

    // блок инициализации
    {
        a = -87;
    }

    public void print() {
        System.out.println(a);
    }
}