package Methodoverriding;

public class Operation {
    long  sum(int a,long b) {
        return a+b;
     }
}
class Operation1 extends Operation {
    int sum(int a,int b) {
        return a+b;

    }
}
class Hello3 {
    public static void main(String[] args) {
        Operation o=new Operation();
        System.out.println(o.sum(20,34l));
        Operation1 o1=new Operation1();
        System.out.println(o.sum(20,23));
        System.out.println(o1.sum(20,67l));
    }
}

