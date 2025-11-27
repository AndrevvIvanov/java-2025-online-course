/**
 * Практика #2 - Преобразование между String, StringBuffer и StringBuilder
 *
 * Методы преобразования:
 * String -> StringBuffer: конструктор StringBuffer(String)
 * String -> StringBuilder: конструктор StringBuilder(String)
 * StringBuffer -> String: метод toString()
 * StringBuilder -> String: метод toString()
 * StringBuffer -> StringBuilder: через String (StringBuffer -> String -> StringBuilder)
 * StringBuilder -> StringBuffer: через String (StringBuilder -> String -> StringBuffer)
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы
     * Демонстрирует преобразование между String, StringBuffer и StringBuilder
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String str = "Hello World";

        // String -> StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.toString());

        // String -> StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.toString());

        // StringBuffer -> String
        String fromBuffer = stringBuffer.toString();
        System.out.println(fromBuffer);

        // StringBuilder -> String  
        String fromBuilder = stringBuilder.toString();
        System.out.println(fromBuilder);

        // StringBuffer -> StringBuilder (через String)
        StringBuilder bufferToBuilder = new StringBuilder(stringBuffer.toString());
        System.out.println(bufferToBuilder.toString());

        // StringBuilder -> StringBuffer (через String)
        StringBuffer builderToBuffer = new StringBuffer(stringBuilder.toString());
        System.out.println(builderToBuffer.toString());
    }
}