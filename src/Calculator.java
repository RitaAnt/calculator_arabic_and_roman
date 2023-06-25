public class Calculator {
    public static int calc(int num1, int num2, char operation) throws Exception {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) 3");
        }
        return result;
    }
    public static String calc(String num1, String num2, char operation) throws Exception {
        ArabicToRoman convert = new ArabicToRoman();

        int result = 0;
        switch (operation) {
            case '+':
                result = convert.toArabic(num1) + convert.toArabic(num2);
                break;
            case '-':
                result = convert.toArabic(num1) - convert.toArabic(num2);
                break;
            case '*':
                result = convert.toArabic(num1) * convert.toArabic(num2);
                break;
            case '/':
                result = convert.toArabic(num1) / convert.toArabic(num2);
                break;
            default:
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return convert.toRoman(result);
    }
}
