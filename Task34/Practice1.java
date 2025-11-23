/**
 * Практика #1 - Демонстрация внутренних классов и спецификаторов доступа
 *
 * Спецификаторы доступа для внутренних классов работают так же, как и для обычных классов:
 * - public: класс доступен из любого другого класса
 * - private: класс доступен только внутри внешнего класса
 * - protected: класс доступен внутри пакета и для классов-наследников
 * - (по умолчанию): класс доступен только внутри пакета
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Внешний класс ClassA с внутренними классами
     */
    public static class ClassA {
        private InnerClassA icA;
        private InnerClassB icB;

        /**
         * Public внутренний класс - доступен извне
         */
        public class InnerClassA {
            private String a = "InnerClassA data";

            public String getData() {
                return a;
            }

            /**
             * Метод, показывающий доступ к полям внешнего класса
             */
            public void accessOuter() {
                // Внутренний класс имеет доступ к private полям внешнего класса
                System.out.println("Доступ из InnerClassA к icB: " + (icB != null));
            }
        }

        /**
         * Private внутренний класс - доступен только внутри ClassA
         */
        private class InnerClassB {
            private String b = "InnerClassB data";

            public String getData() {
                return b;
            }
        }

        /**
         * Protected внутренний класс
         */
        protected class InnerClassC {
            private String c = "InnerClassC data";

            public String getData() {
                return c;
            }
        }

        /**
         * Метод для демонстрации работы с private внутренним классом
         */
        public void demonstratePrivateClass() {
            icB = new InnerClassB();
            System.out.println("Доступ к private классу из внешнего: " + icB.getData());
        }

        /**
         * Метод для создания внутренних классов
         */
        public void createInnerClasses() {
            icA = new InnerClassA();
            icB = new InnerClassB();
            System.out.println("Созданы оба внутренних класса");
        }
    }

    /**
     * Главный метод программы для демонстрации работы с внутренними классами
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        ClassA outer = new ClassA();

        // Создание public внутреннего класса извне
        ClassA.InnerClassA publicInner = outer.new InnerClassA();
        System.out.println("Public внутренний класс: " + publicInner.getData());
        publicInner.accessOuter();

        // Доступ к private внутреннему классу только через методы внешнего класса
        outer.demonstratePrivateClass();

        // Создание protected внутреннего класса (доступно так как в одном файле)
        ClassA.InnerClassC protectedInner = outer.new InnerClassC();
        System.out.println("Protected внутренний класс: " + protectedInner.getData());

        // Попытка создать private внутренний класс извне вызовет ошибку компиляции:
        // ClassA.InnerClassB privateInner = outer.new InnerClassB(); // Ошибка!
    }
}