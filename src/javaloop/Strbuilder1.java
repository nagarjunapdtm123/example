package javaloop;
//import java.lang.String;

public class Strbuilder1 {
    public static void main(String[] args) {
        String str="codex box";
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder("nag codex box");
       StringBuffer sb99=new StringBuffer("hyhuyjhbj");
        str=str + "company";
        sb1.append(" ");
        System.out.println(sb1.append("mani"));
       /* sb1.insert(4," ");
        System.out.println(sb1.insert(4,"rahul"));
        System.out.println(sb1.delete(3,8));
        System.out.println(sb1.replace(3,6,"pen"));*/
        System.out.println("before string " +sb1.length());
        System.out.println(sb1.deleteCharAt(4));
        System.out.println(sb1.replace(4,9,"jani"));
        System.out.println(sb1.indexOf("box"));
        System.out.println("normal creation " +str.hashCode());
        System.out.println("string builder " +sb.hashCode());
        System.out.println("string builder1 " +sb1.hashCode());
        System.out.println("string buffer " +sb99.hashCode());


        System.out.println("string buffer " +  sb99);
        System.out.println("capcity " +sb.capacity());
        System.out.println("capacity " +sb1.capacity());
        System.out.println("capacity " +sb99.hashCode());
        System.out.println("length " +sb1.length());

    }
}
