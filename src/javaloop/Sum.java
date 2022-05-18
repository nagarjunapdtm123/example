package javaloop;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       char symbol;
        int x,y,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose an symbol:+,-,*,/");
        symbol=sc.next().charAt(0);
        System.out.println("enter first number");
        x=sc.nextInt();
        System.out.println("enter second number");
        y=sc.nextInt();
        switch (symbol){
            case '+':
                result=x + y;
                System.out.println(x + " + " + y + " = " +result);
                break;
            case '-':
                result=x - y;
                System.out.println(x + " - " + y + " = " +result);
                break;
            case '*':
                result=x * y;
                System.out.println(x + " * " + y + " = " +result );
                break;
            case '/':
                result=x / y;
                System.out.println(x + " / " + y + " = " +result);
                break;
            default:
                System.out.println("Invalid symbol");
                break;

        }






       /*int x=10, y=20,result;
        result= x + y;
        System.out.println("sum of two numbers: " +result);
*/

    }
}
