/**
 * Практика #3 - Доступ внешнего класса к членам внутреннего класса
 *
 * Внешний класс имеет доступ к членам внутреннего класса, но возможность доступа 
 * зависит от спецификаторов доступа. Внешний класс может обращаться к:
 * - public членам внутреннего класса напрямую
 * - protected и package-private членам, если находится в том же пакете
 * - private членам только через public/protected методы
 * Для доступа к нестатическим членам внутреннего класса требуется создание его экземпляра.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice3 {

    /**
     * Внешний класс с внутренним классом
     */
    public static class OuterClass {
        private String outerField = "Поле внешнего класса";

        /**
         * Внутренний класс с разными спецификаторами доступа
         */
        public class InnerClass {
            private String privateField = "private поле внутреннего класса";
            protected String protectedField = "protected поле внутреннего класса";
            public String publicField = "public поле внутреннего класса";
            String packageField = "package-private поле внутреннего класса";

            // Private метод
            private String getPrivateData() {
                return privateField;
            }

            // Protected метод  
            protected String getProtectedData() {
                return protectedField;
            }

            // Public метод
            public String getPublicData() {
                return publicField;
            }

            // Package-private метод
            String getPackageData() {
                return packageField;
            }
        }

        /**
         * Метод внешнего класса, демонстрирующий доступ к внутреннему классу
         */
        public void accessInnerClass() {
            InnerClass inner = new InnerClass();

            // Доступ к public полю и методу
            System.out.println("Public поле: " + inner.publicField);
            System.out.println("Public метод: " + inner.getPublicData());

            // Доступ к protected полю и методу (доступно из внешнего класса)
            System.out.println("Protected поле: " + inner.protectedField);
            System.out.println("Protected метод: " + inner.getProtectedData());

            // Доступ к package-private полю и методу (доступно из того же пакета)
            System.out.println("Package поле: " + inner.packageField);
            System.out.println("Package метод: " + inner.getPackageData());

            // НЕТ прямого доступа к private полю и методу
            // System.out.println(inner.privateField); // Ошибка компиляции!
            // System.out.println(inner.getPrivateData()); // Ошибка компиляции!

            // Косвенный доступ через public методы
            System.out.println("Косвенный доступ к private: " +
                    inner.getPublicData()); // но это не даст privateField

            // Изменение полей внутреннего класса
            inner.publicField = "измененное public поле";
            inner.protectedField = "измененное protected поле";

            System.out.println("После изменения: " + inner.publicField);
        }

        /**
         * Метод, показывающий создание нескольких экземпляров внутреннего класса
         */
        public void createMultipleInnerInstances() {
            InnerClass inner1 = new InnerClass();
            InnerClass inner2 = new InnerClass();

            inner1.publicField = "Первый объект";
            inner2.publicField = "Второй объект";

            System.out.println("inner1: " + inner1.publicField);
            System.out.println("inner2: " + inner2.publicField);
        }
    }

    /**
     * Главный метод программы для демонстрации доступа внешнего класса
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        System.out.println("Доступ из внешнего класса");
        outer.accessInnerClass();

        System.out.println("\nНесколько экземпляров внутреннего класса");
        outer.createMultipleInnerInstances();

        // Доступ извне через экземпляр внутреннего класса
        OuterClass.InnerClass innerFromOutside = outer.new InnerClass();
        System.out.println("\nДоступ извне");
        System.out.println("Public поле извне: " + innerFromOutside.publicField);
    }
}