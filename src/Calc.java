import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        String example = in.nextLine();


        char[] arr = ParserLine.processingL1(example); // разбиваем строку на символы для проверки

        String operator = ParserLine.processingL2(arr);
        String [] str = example.split("\\" + operator); // разбиваем исходную строку на операнды

        if (ParserLine.isNumber(str[0]) && ParserLine.isNumber(str[1])){
            ParserLine.processingL3(str); // дополнительная проверка на ограничения по величине

            // производим вычисления
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            Operation operation = new Operation();
            int result = operation.calc(x, y, operator);

            System.out.printf("Output: \n %s ", result);
        } else {
            int x = Converting.romanToArabic(str[0]);
            int y = Converting.romanToArabic(str[1]);

            if (x > 10 || x < 1 || y > 10 || y < 1){
                throw new Exception("invalid input");
            }

            Operation operation = new Operation();
            int result = operation.calc(x, y, operator);

            System.out.printf("Output: \n %s ", Converting.arabicToRoman(result));
        }

        in.close();
    }

}
