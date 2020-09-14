/**
 * @author Evgeniy Rudikov
 */

//класс-считалка

public class Calculate {

    public static double calculate(double a, double b, String act) {
        double y = 0;
        switch (act) {
            case "+":
                y = a + b;
                break;
            case "-":
                y = a - b;
                break;
            case "*":
                y = a * b;
                break;
            case "/":
                y = a / b;
                break;
        }
        return y;
    }
}
