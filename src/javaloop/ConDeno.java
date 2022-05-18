package javaloop;


public class ConDeno {
    int num;
    String name;
    ConDeno() {
        System.out.println("constructor called ");
    }
}
class Gfg{
    public static void main(String[] args) {
        ConDeno cd=new ConDeno();
        System.out.println(cd.name);
        System.out.println(cd.num);
    }
}
