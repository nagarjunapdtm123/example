package javaloop;

public class ConDemo1 {
    String name;
    int id;
    ConDemo1(String n,int i){
        name = n;
        id = i;
    }
    public void display() {
        System.out.println("employee name : " + name);
        System.out.println("Employee id: " + id);
    }
}
class Gfg1{
    public static void main(String[] args) {
        ConDemo1 cd=new ConDemo1("nag",1);
        ConDemo1 cd1=new ConDemo1("mani",2);
        cd.display();
        cd1.display();

    }
}
