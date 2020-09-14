/**
 * @author Evgeniy Rudikov
 */

//класс-переводчик строки в математическое выражение

import java.util.List;

public class Converter {

    //определение первого аргумента
    public static double arg1(String expression) {
        double a = 0;
        String s;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                s = expression.substring(0, i);
                if (Input.romanOrArabic(expression)) { //проверяем тип цифр(арабские или римские)
                    a = romanToArabic(s);//переводим в int, если римские
                } else {
                    a = Double.parseDouble(s);//переводим в double, если арабские
                }
            }
        }
        return a;
    }

    //ищем и возвращаем оператор
    public static String act(String expression) {
        String a = new String();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                a = expression.substring(i, i + 1);
            }
        }
        return a;
    }

    //определение второго аргумента
    public static double arg2(String expression) {
        double a = 0;
        String s;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                s = expression.substring(i + 1, expression.length());
                if (Input.romanOrArabic(expression)) { //проверяем тип цифр(арабские или римские)
                    a = romanToArabic(s);//переводим в int, если римские
                } else {
                    a = Double.parseDouble(s);//переводим в double, если арабские
                }
            }
        }
        return a;
    }

    //превращение строки с римскими цифрами в int
    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        return result;
    }

    //перевод в римское написание
    public static String arabicToRoman(double number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException("Число должно быть от 0 до 4000!");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();// т.к. этот метод нам нужен только для преревода финального рез-та в римское написание, делаем его String
    }
}
