/**
 * Практика #3 - Переписывание кода с использованием конструкции this()
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice3 {

    /**
     * Класс A с конструкторами, использующими вызовы this()
     */
    static class A {
        int a;
        int b;
        int c;
        int z;

        /**
         * Конструктор по умолчанию
         */
        public A() {
            this(0, 0, 0); // Вызов конструктора с тремя параметрами
        }

        /**
         * Конструктор с одним параметром
         * @param a значение для поля a
         */
        public A(int a) {
            this(a, 0, 0); // Вызов конструктора с тремя параметрами
        }

        /**
         * Конструктор с двумя параметрами
         * @param a значение для поля a
         * @param b значение для поля b
         */
        public A(int a, int b) {
            this(a, b, 0); // Вызов конструктора с тремя параметрами
        }

        /**
         * Основной конструктор с тремя параметрами
         * Устанавливает значения всех полей, включая z=1
         * @param a значение для поля a
         * @param b значение для поля b
         * @param c значение для поля c
         */
        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = 1; // Инициализация поля z значением 1
        }
    }

    /**
     * Главный метод программы для демонстрации работы конструкторов
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10, 20);
        A obj4 = new A(10, 20, 30);

        System.out.println("Объект 1: a=" + obj1.a + ", b=" + obj1.b + ", c=" + obj1.c + ", z=" + obj1.z);
        System.out.println("Объект 2: a=" + obj2.a + ", b=" + obj2.b + ", c=" + obj2.c + ", z=" + obj2.z);
        System.out.println("Объект 3: a=" + obj3.a + ", b=" + obj3.b + ", c=" + obj3.c + ", z=" + obj3.z);
        System.out.println("Объект 4: a=" + obj4.a + ", b=" + obj4.b + ", c=" + obj4.c + ", z=" + obj4.z);
    }
}