/**
 * @author Evgeniy Rudikov
 */

public class CalculatorJavaMentor {
    public static void main(String[] args) throws MyExceptions {
        String s = Input.read();//чтение выражения из консоли
        CheckRules.equalsArgs(s);//проверка условия, что аргументы одного типа
        CheckRules.correctEntry(s);//проверка условия, что выражение записано верно
        double a = Converter.arg1(s);//определение первого аргумента
        double b = Converter.arg2(s);//определение второго аргумента
        CheckRules.argNotMoreTen(a, b);//проверка условия, что аргумент - целое число от 1 до 10
        String d = Converter.act(s);//определения математического действия
        Double r = Calculate.calculate(a, b, d);//вычисление
        Output.resultOfActions(r, s);//вывод результата в консоль
    }
}
