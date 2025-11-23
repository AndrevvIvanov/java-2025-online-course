/**
 * Практика #1 - Демонстрация операторов в Java
 *
 * Примеры использования операторов с базовыми типами и строкой
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice1 {

    /**
     * Главный метод программы, демонстрирующий работу основных операторов
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("=== ОПЕРАТОРЫ ПРИСВАИВАНИЯ ===");

        int a = 10;
        System.out.println("a = " + a);

        a += 5;
        System.out.println("a += 5 -> " + a);

        a -= 3;
        System.out.println("a -= 3 -> " + a);

        a *= 2;
        System.out.println("a *= 2 -> " + a);

        a /= 4;
        System.out.println("a /= 4 -> " + a);

        a %= 3;
        System.out.println("a %= 3 -> " + a);

        System.out.println("\n=== АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ ===");

        int x = 15, y = 4;
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));

        System.out.println("\n=== ИНКРЕМЕНТ И ДЕКРЕМЕНТ ===");

        // Префиксная и постфиксная формы
        int pref = 5;
        int post = 5;

        System.out.println("Префиксная форма:");
        System.out.println("Исходное значение: " + pref);
        System.out.println("++pref: " + (++pref)); // Сначала увеличиваем, потом используем
        System.out.println("После операции: " + pref);

        System.out.println("\nПостфиксная форма:");
        System.out.println("Исходное значение: " + post);
        System.out.println("post++: " + (post++)); // Сначала используем, потом увеличиваем
        System.out.println("После операции: " + post);

        System.out.println("\n=== ОПЕРАТОРЫ СРАВНЕНИЯ ===");

        int m = 10, n = 20;
        System.out.println(m + " == " + n + " -> " + (m == n));
        System.out.println(m + " != " + n + " -> " + (m != n));
        System.out.println(m + " > " + n + " -> " + (m > n));
        System.out.println(m + " >= " + n + " -> " + (m >= n));
        System.out.println(m + " < " + n + " -> " + (m < n));
        System.out.println(m + " <= " + n + " -> " + (m <= n));

        System.out.println("\n=== ЛОГИЧЕСКИЕ ОПЕРАТОРЫ ===");

        boolean b1 = true, b2 = false;
        System.out.println(b1 + " && " + b2 + " -> " + (b1 && b2));
        System.out.println(b1 + " || " + b2 + " -> " + (b1 || b2));
        System.out.println("!" + b1 + " -> " + (!b1));

        System.out.println("\n=== ПОБИТОВЫЕ ОПЕРАТОРЫ ===");

        int p = 5, q = 3; // 5 = 101, 3 = 011 в двоичной системе
        System.out.println(p + " & " + q + " -> " + (p & q)); //and
        System.out.println(p + " | " + q + " -> " + (p | q)); //or
        System.out.println(p + " ^ " + q + " -> " + (p ^ q)); //xor
        System.out.println("~" + p + " -> " + (~p)); //not

        System.out.println("\n=== ОПЕРАТОРЫ СДВИГА ===");

        int num = 8; // 1000 в двоичной системе
        System.out.println(num + " >> 1 -> " + (num >> 1));
        System.out.println(num + " << 1 -> " + (num << 1));
        System.out.println(num + " >>> 1 -> " + (num >>> 1));

        System.out.println("\n=== ОПЕРАТОР ? ==="); //компактная форма if-else

        int age = 18;
        String status = (age >= 18) ? "совершеннолетний" : "несовершеннолетний";
        System.out.println("Возраст " + age + ", тогда  " + status);

        System.out.println("\n=== ОПЕРАТОРЫ ДЛЯ СТРОК ===");

        String str1 = "Hello";
        String str2 = "World";

        // Конкатенация строк
        String result1 = str1 + " " + str2;
        System.out.println("Конкатенация: " + str1 + " + \" \" + " + str2 + " = " + result1);

        // += для строк
        String message = "Java";
        message += " Programming";
        System.out.println("+= для строк: " + message);

        // Сравнение строк
        System.out.println("Сравнение строк: " + str1 + " == " + str2 + " -> " + (str1 == str2));
        System.out.println("Сравнение строк: " + str1 + " != " + str2 + " -> " + (str1 != str2));

        // Демонстрация приоритета операторов
        System.out.println("\n=== ПРИОРИТЕТ ОПЕРАТОРОВ ===");
        int result = 2 + 3 * 4;  // Умножение имеет более высокий приоритет
        System.out.println("2 + 3 * 4 = " + result );

        boolean logicResult = true || false && false;  // && имеет более высокий приоритет чем ||
        System.out.println("true || false && false = " + logicResult + " (&& выполняется первым)");

        System.out.println("\n=== ОПЕРАТОРЫ [] И () ===");

        // Оператор [] для работы с массивами
        int[] numbers = {1, 2, 3, 4, 5};  // Создание массива
        System.out.println("Массив numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("numbers[0] = " + numbers[0]);  // Доступ к элементу по индексу 0
        System.out.println("numbers[2] = " + numbers[2]);  // Доступ к элементу по индексу 2

        // Изменение элемента массива с помощью []
        numbers[1] = 10;
        System.out.println("После numbers[1] = 10: " + java.util.Arrays.toString(numbers));

        // Оператор () для управления порядком вычислений
        int withParentheses = (2 + 3) * 4;  // Сначала сложение, потом умножение
        int withoutParentheses = 2 + 3 * 4;  // Сначала умножение, потом сложение
        System.out.println("(2 + 3) * 4 = " + withParentheses);
        System.out.println("2 + 3 * 4 = " + withoutParentheses);

        // () для вызова методов
        String text = "Hello World";
        int length = text.length();  // Оператор () для вызова метода
        System.out.println("Длина строки \"" + text + "\" = " + length);
    }
}