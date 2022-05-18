package javaloop;

public class Strbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        sb.append("java");
        System.out.println(sb);

        sb.capacity();
        System.out.println(sb.capacity());
        System.out.println(sb.insert(2,"nag"));
        System.out.println(sb.delete(1,3));
        System.out.println(sb.replace(1,5,"rahul"));
        System.out.println(sb.insert(2,"IPL"));
        System.out.println(sb.delete(2,4));

    }
}
