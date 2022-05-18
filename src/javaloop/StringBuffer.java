package javaloop;
import java.lang.String;

public class StringBuffer {
    public StringBuffer(String kljnkjnk) {
    }

    public static void main(String[] args) {
        java.lang.StringBuffer sb=new java.lang.StringBuffer("welcome kapil towers ");
       /* StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("mani");*/
//        sb.reverse();

        /*System.out.println(sb.capacity());
        sb.append("java is pgrming lan");
        System.out.println(sb.capacity());*/
//        sb.replace(4,8,"nag");
//        sb.delete(1,6);
        sb.insert(1,"java");
        System.out.println(sb);
        System.out.println("buffer hash code " +sb.hashCode());
        System.out.println("string buffer " +sb);
    }


}
