/**
 * Практика #2 - Доступ внутреннего класса к членам внешнего класса
 *
 * Внутренний класс имеет полный доступ ко всем полям и методам внешнего класса,
 * включая private-члены. Возможность доступа не зависит от спецификаторов доступа -
 * внутренний класс может обращаться даже к private полям и методам внешнего класса.
 * Это работает потому, что внутренний класс неявно содержит ссылку на экземпляр внешнего класса.
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Внешний класс с полями разной видимости
     */
    public static class OuterClass {
        private String privateField = "private поле";
        protected String protectedField = "protected поле";
        public String publicField = "public поле";
        String packageField = "package-private поле";

        /**
         * Private метод внешнего класса
         */
        private void privateMethod() {
            System.out.println("Вызван private метод внешнего класса");
        }

        /**
         * Public метод внешнего класса
         */
        public void publicMethod() {
            System.out.println("Вызван public метод внешнего класса");
        }

        /**
         * Public внутренний класс
         */
        public class InnerClass {
            /**
             * Метод, демонстрирующий доступ к членам внешнего класса
             */
            public void accessOuterMembers() {
                // Доступ к полям внешнего класса с разными спецификаторами
                System.out.println("Доступ к private полю: " + privateField);
                System.out.println("Доступ к protected полю: " + protectedField);
                System.out.println("Доступ к public полю: " + publicField);
                System.out.println("Доступ к package-private полю: " + packageField);

                // Доступ к методам внешнего класса
                privateMethod();
                publicMethod();

                // Изменение полей внешнего класса
                privateField = "измененное private поле";
                System.out.println("После изменения: " + privateField);
            }

            /**
             * Метод, показывающий доступ к this внешнего класса
             */
            public void showOuterReference() {
                // Доступ к ссылке на внешний класс через OuterClass.this
                System.out.println("Ссылка на внешний класс: " + OuterClass.this);
            }
        }

        /**
         * Метод для создания и тестирования внутреннего класса
         */
        public void testInnerClass() {
            InnerClass inner = new InnerClass();
            inner.accessOuterMembers();
            inner.showOuterReference();
        }
    }

    /**
     * Главный метод программы для демонстрации доступа внутреннего класса
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Создание внутреннего класса и тестирование доступа
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterMembers();

        System.out.println("\n--- Тестирование через метод внешнего класса ---");
        outer.testInnerClass();
    }
}