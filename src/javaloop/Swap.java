package javaloop;

public class Swap {
    public static void main(String[] args) {
        int a=10,b=20;
       float f1=12.3f,f2=34.6f;
       double d1=23.43,d2=65.12;
       boolean bb1=true;
       boolean bb2=false;
       char ch1='a';
       char ch2='b';
       long l1=12l;
       long l2=56l;

       System.out.println("before swaping: a,b= "+a+" , "+ +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swaping: a,b= "+a+" ,"+ +b);

        System.out.println("before swaping: f1,f2= "+f1+" , "+ +f2);
        float c1=f1;
        f1=f2;
        f2=c1;
        System.out.println("after swaping: f1,f2= "+f1+" ,"+ +f2);

        System.out.println("before swaping: d1,d2= "+d1+" , "+ +d2);
        double c2=d1;
        d1=d2;
        d2=c2;
        System.out.println("after swaping: d1,d2= "+d1+" ,"+ +d2);

        System.out.println("before swaping: bb1,bb2= "+bb1+" , " +bb2);
        boolean c3=bb1;
        bb1=bb2;
        bb2=c3;
        System.out.println("after swaping: bb1,bb2= "+bb1+" ," +bb2);

        System.out.println("before swaping: ch1,ch2= "+ch1+" , "+ +ch2);
        char c4=ch1;
        ch1=ch2;
        ch2=c4;
        System.out.println("after swaping: ch1,ch2= "+ch1+" ,"+ +ch2);

        System.out.println("before swaping: a,b= "+l1+" , "+ +l2);
        long c5=l1;
        l1=l2;
        l2=c5;
        System.out.println("after swaping: l1,l2= "+l1+" ,"+ +l2);

    }
}
