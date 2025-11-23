/**
 * Практика #1 - Переопределение метода equals()
 *
 * Соглашения для реализации метода equals():
 * 1. Рефлексивность: объект должен быть равен самому себе
 * 2. Симметричность: если a.equals(b) = true, то b.equals(a) = true
 * 3. Транзитивность: если a.equals(b) и b.equals(c), то a.equals(c)
 * 4. Непротиворечивость: повторные вызовы должны возвращать одинаковый результат
 * 5. Сравнение с null всегда возвращает false
 * 6. Согласованность с hashCode(): равные объекты должны иметь одинаковый хэш-код
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Класс Пользователь для демонстрации переопределения equals()
     */
    static class User {
        private String email;
        private int id;

        /**
         * Конструктор пользователя
         * @param email электронная почта пользователя
         * @param id уникальный идентификатор пользователя
         */
        public User(String email, int id) {
            this.email = email;
            this.id = id;
        }

        /**
         * Переопределенный метод equals для сравнения пользователей
         * @param obj объект для сравнения
         * @return true если объекты равны, false в противном случае
         */
        @Override
        public boolean equals(Object obj) {
            // Проверка рефлексивности (объект равен самому себе)
            if (this == obj) return true;

            // Проверка на null и совместимость типов
            if (obj == null || getClass() != obj.getClass()) return false;

            // Приведение типа и сравнение значимых полей
            User user = (User) obj;
            return id == user.id &&
                    java.util.Objects.equals(email, user.email);
        }

        /**
         * Переопределенный hashCode для согласованности с equals
         * @return хэш-код объекта
         */
        @Override
        public int hashCode() {
            return java.util.Objects.hash(email, id);
        }
    }

    /**
     * Главный метод программы для тестирования метода equals()
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        User user1 = new User("test@mail.com", 1);
        User user2 = new User("test@mail.com", 1);
        User user3 = new User("other@mail.com", 2);

        System.out.println("user1 equals user2: " + user1.equals(user2)); // true
        System.out.println("user1 equals user3: " + user1.equals(user3)); // false
        System.out.println("user1 equals null: " + user1.equals(null));   // false
    }
}