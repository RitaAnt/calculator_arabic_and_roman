import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String [] vvod = scan();
        if(vvod.length == 3){
            Check check = new Check();
            check.Check(vvod[0], vvod[2], vvod[1]);
        }
        else{
            throw new Exception("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) 1");
        }

    }


    private static String[] scan(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String[] vvod = in.nextLine().split(" ");
        return vvod;
    }

}