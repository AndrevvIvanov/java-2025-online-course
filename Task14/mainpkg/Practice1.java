package mainpkg;

/**
 * Практика #1 - Демонстрация спецификаторов доступа в Java
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    // Поля с разными спецификаторами доступа
    private String privateField = "private поле";
    String defaultField = "default поле"; // без спецификатора
    protected String protectedField = "protected поле";
    public String publicField = "public поле";

    // Методы с разными спецификаторами доступа
    private void privateMethod() {
        System.out.println("private метод");
    }

    void defaultMethod() {
        System.out.println("default метод");
    }

    protected void protectedMethod() {
        System.out.println("protected метод");
    }

    public void publicMethod() {
        System.out.println("public метод");
    }

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Practice1 demo = new Practice1();

        System.out.println("Доступ из того же класса");
        demo.privateMethod();
        demo.defaultMethod();
        demo.protectedMethod();
        demo.publicMethod();

        System.out.println("\nДоступ к полям из того же класса");
        System.out.println(demo.privateField);
        System.out.println(demo.defaultField);
        System.out.println(demo.protectedField);
        System.out.println(demo.publicField);

        System.out.println("\nДоступ из того же пакета");
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessDemo();

        System.out.println("\nДоступ из подкласса в том же пакете");
        SamePackageSubclass subclass = new SamePackageSubclass();
        subclass.accessDemo();
    }
}