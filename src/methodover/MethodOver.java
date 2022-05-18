package methodover;

public class MethodOver {
    int sum(int a,int b) {
        return a+b;
    }
    float sum(int a,float b) {
        return a+b+10;
    }
     double sum(double a,double b) {
        return a+b;
    }
}
class Hello2 {
    public static void main(String[] args) {
        MethodOver mo=new MethodOver();
        System.out.println(mo.sum(10,67));
        System.out.println(mo.sum(33,47.5f));
        System.out.println(mo.sum(12.3,45.6));
    }
}