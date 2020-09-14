/**
 * @author Evgeniy Rudikov
 */

//класс чтения из консоли

import java.util.Scanner;

public class Input {

    //метод чтения
    public static String read() {
        System.out.println("Input:");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        return expression;
    }

    //определяем, какими цифрами введена строка
    public static boolean romanOrArabic(String s) {
        boolean b = false; //строка не имеет римских символов
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                b = true; //строка имеет римские символы
            }
        }
        return b;
    }

}
