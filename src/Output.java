/**
 * @author Evgeniy Rudikov
 */

//класс вывода

public class Output {

    public static void resultOfActions(double result, String s) {
        if (Input.romanOrArabic(s)) { //если введены римские цифры
            System.out.println("Output:");
            if (!(result%1==0)){
                System.out.println("Результат вычисления нельзя представить в римском исчислении");
            }
            String string = Converter.arabicToRoman(result); //пререводим результат вычислений в римское написание
            System.out.println(string);
        } else {
            System.out.println("Output:");
            System.out.println(result);
        }
    }
}
