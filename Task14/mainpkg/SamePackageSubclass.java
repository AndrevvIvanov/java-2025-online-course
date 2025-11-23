package mainpkg;

/**
 * Подкласс в том же пакете
 */
public class SamePackageSubclass extends Practice1 {
    public void accessDemo() {
        // Доступ к методам через наследование
        // privateMethod(); // Ошибка компиляции - private недоступен
        defaultMethod();    // default доступен
        protectedMethod();  // protected доступен
        publicMethod();     // public доступен

        // Доступ к полям через наследование
        // System.out.println(privateField); // Ошибка компиляции
        System.out.println(defaultField);    // default доступен
        System.out.println(protectedField);  // protected доступен
        System.out.println(publicField);     // public доступен
    }
}