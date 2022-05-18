package methodover;

public class Methodover1 {
   void sum(int a,long b) {
       System.out.println("Integer is invoked");
    }
    void sum(long a,int b) {
        System.out.println("long is invoked ");

    }
}
class Hello {
    public static void main(String[] args) {
        Methodover1 mo1=new Methodover1();
        mo1.sum(20,20l);

    }
}
