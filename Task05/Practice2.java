/**
 * Практика #2 - Печать имени с использованием Unicode
 *
 * @author Андрей Иванов
 * @version 1.0
 * @since 2025
 */
public class Practice2 {

    /**
     * Главный метод программы
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // создаем переменные для каждой буквы и для пробела
        char letterA = '\u0410';  // А
        char letterN = '\u043D';  // н
        char letterD = '\u0434';  // д
        char letterR = '\u0440';  // р
        char letterE = '\u0435';  // е
        char letterY = '\u0439';  // й
        char space = '\u0020';    // пробел
        char letterI = '\u0418';  // И
        char letterV = '\u0432';  // в
        char letterA2 = '\u0430'; // а
        char letterO = '\u043E';  // о

        // формируем полное имя
        String fullName = "" + letterA + letterN + letterD + letterR + letterE + letterY +
                space +
                letterI + letterV + letterA2 + letterN + letterO + letterV;

        // печать имени в консоль
        System.out.println(fullName);
    }
}