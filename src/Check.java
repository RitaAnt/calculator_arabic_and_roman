import java.util.Arrays;

public class Check {
    static String Rome = "X IX VIII VII VI V IV III II I";
    static String Arab = "10 9 8 7 6 5 4 3 2 1";
    static String Operators = "+ - / *";
    public static void Check(String num1, String num2, String operator) throws Exception {

        if(Operators.contains(operator))
        {

            if(Rome.contains(num1) && Arab.contains(num2) ||
                    Arab.contains(num1) && Rome.contains(num2))
            {
                throw new Exception("//т.к. используются одновременно разные системы счисления");
            }

            else if (Rome.contains(num1) && Rome.contains(num2))
            {
                ArabicToRoman convert = new ArabicToRoman();
                if(operator.equals("-") && (convert.toArabic(num2) >= convert.toArabic(num1)))
                {
                    throw new Exception("//т.к. в римской системе нет отрицательных чисел");
                }
                else{
                    Calculator calc = new Calculator();
                    String result = calc.calc(num1, num2, operator.charAt(0));
                    System.out.println(result);}
                }


            else if (Arab.contains(num1) && Arab.contains(num2))
            {
                Calculator calc = new Calculator();
                int result = calc.calc( Integer.parseInt(num1), Integer.parseInt(num2), operator.charAt(0));
                System.out.println(result);
            }

            else
            {
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - принимать на вход числа от 1 до 10 включительно, не более");
            }
        }
        else
        {
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) 2");
        }

    }
}
