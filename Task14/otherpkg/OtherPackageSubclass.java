package otherpkg;

import mainpkg.Practice1;

/**
 * Подкласс в другом пакете для демонстрации protected доступа
 */
public class OtherPackageSubclass extends Practice1 {
    public void demonstrateAccess() {
        System.out.println("Доступ через наследование в другом пакете");

        // Доступ к методам через наследование
        // privateMethod(); // Ошибка компиляции - private недоступен
        // defaultMethod(); // Ошибка компиляции - default недоступен из другого пакета
        protectedMethod();  // protected доступен через наследование
        publicMethod();     // public доступен

        // Доступ к полям через наследование
        // System.out.println(privateField); // Ошибка компиляции
        // System.out.println(defaultField); // Ошибка компиляции
        System.out.println(protectedField);  // protected доступен через наследование
        System.out.println(publicField);     // public доступен
    }
}