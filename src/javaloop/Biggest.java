package javaloop;

public class Biggest {
    public static void main(String[] args) {
        int a=20,b=37,c=89,result;
        result=((a > b) ? (a > c) ? a : c: (b > c) ? b : c);
        System.out.println("Max of three numbers  =" +result);
    }
}
