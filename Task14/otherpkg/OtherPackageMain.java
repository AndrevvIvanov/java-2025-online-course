package otherpkg;

import mainpkg.Practice1;

/**
 * Главный класс в другом пакете для демонстрации доступа
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class OtherPackageMain {

    /**
     * Главный метод в другом пакете, демонстрирующий ограничения доступа
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Practice1 demo = new Practice1();

        System.out.println("Доступ из другого пакета (без наследования)");

        // Доступ к методам
        // demo.privateMethod(); // Ошибка компиляции - private недоступен
        // demo.defaultMethod(); // Ошибка компиляции - default недоступен
        // demo.protectedMethod(); // Ошибка компиляции - protected недоступен без наследования
        demo.publicMethod();     // Только public доступен

        // Доступ к полям
        // System.out.println(demo.privateField); // Ошибка компиляции
        // System.out.println(demo.defaultField); // Ошибка компиляции
        // System.out.println(demo.protectedField); // Ошибка компиляции
        System.out.println(demo.publicField);     // Только public доступен

        System.out.println("\nДоступ из подкласса в другом пакете");
        OtherPackageSubclass subclass = new OtherPackageSubclass();
        subclass.demonstrateAccess();
    }
}