package javaloop;

public class trim {
    public static void main(String[] args) {
        String s2=" hello ";
        String s1="";
        String s3="hello java world";
        String s4="manisanddep";


        if(s1.length()==0 || s1.isEmpty())
        System.out.println("string1 is empty");
        else
            System.out.println("s1");
        if(s2.length()==0 || s2.isEmpty())
            System.out.println("string2 is empty");
        else
        System.out.println(s2);


        System.out.println(s2+"java"); //without trim
        System.out.println(s2.trim()+"nagarjuna"); // with trim
        System.out.println(s3.contains("java"));
        System.out.println(s3.contains("nag"));
        System.out.println(s3.substring(4,8));
        System.out.println(s3.substring(6));
        System.out.println(s2.charAt(4));
        System.out.println();
        char[] chars=s4.toCharArray();
        System.out.println(chars);
        for (int i=0;i<chars.length;i++)
        {
            System.out.println(chars[i]);
        }



    }
}
