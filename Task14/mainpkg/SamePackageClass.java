package mainpkg;

/**
 * Класс в том же пакете для демонстрации доступа
 */
public class SamePackageClass {
    public void accessDemo() {
        Practice1 demo = new Practice1();

        // Доступ к методам
        // demo.privateMethod(); // Ошибка компиляции - private недоступен
        demo.defaultMethod();    // default доступен
        demo.protectedMethod();  // protected доступен
        demo.publicMethod();     // public доступен

        // Доступ к полям
        // System.out.println(demo.privateField); // Ошибка компиляции
        System.out.println(demo.defaultField);    // default доступен
        System.out.println(demo.protectedField);  // protected доступен
        System.out.println(demo.publicField);     // public доступен
    }
}