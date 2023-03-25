import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int a;
        int b;
        System.out.println("Введите математический пример");
        Scanner scan =new Scanner(System.in);
        String primer = scan.nextLine();

        String [] str = primer.split(" ");

        if (str.length!=3){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Вы ввели некорректную строку");;
                System.exit(1);
            }

        }

        a=Integer.parseInt(str[0]);
        b=Integer.parseInt(str[2]);
        String operation = str[1];
        if ((a<1||a>10)||(b<1||b>10)){
            System.out.println("Число в не диапозона");

        }
        else {int result=Calc(a,b,operation);
            System.out.println("Результат Вашего вычисления "  +  result);

        }
    }

    public static int Calc(int a, int b,String operation){
        switch (operation) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:

                throw new UnsupportedOperationException("Математическая операция не распознана");
        }

    }


}
