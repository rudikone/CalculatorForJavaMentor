/**
 * @author Evgeniy Rudikov
 */

//класс исключений

public class MyExceptions extends Exception {

    public MyExceptions(double a, double b) {
        super("Неверно введен аргумент (используйте целые числа от 1 до 10!)");
    }

    public MyExceptions(String s) {
        super("Некорректно введено выражение! (используйте либо римские, либо арабские цифры, а также операторы +, -, *, /)");
    }
}
