/**
 * @author Evgeniy Rudikov
 */

//Класс проверки условий

public class CheckRules {

    //целое число от 1 до 10
    public static void argNotMoreTen(double a, double b) throws MyExceptions {
        if (a > 10 || a < 0 || !(a % 1 == 0) || b > 10 || b < 0 || !(b % 1 == 0)) {
            throw new MyExceptions(a, b);
        }
    }

    //числа либо римские либо арабские
    public static void equalsArgs(String s) throws MyExceptions {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                for (int j = 0; j < s.length(); j++) {
                    switch (s.charAt(j)) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            throw new MyExceptions(s);
                    }
                }
            }
        }
    }

    //введен ли оператор?
    public static void correctEntry(String s) throws MyExceptions {
        if (!availabilityOperator(s)) {
            throw new MyExceptions(s);
        }
    }

    //проверка наличия оператора
    private static boolean availabilityOperator(String s) {
        boolean b = false;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                b = true;
            }
        }
        return b;
    }

}



