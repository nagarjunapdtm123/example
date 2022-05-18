package javaloop;

import java.util.StringTokenizer;

public class Strtoken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("hello|welcome|to|codex|box", "|");
        /*String token=st.nextToken();
        while (st.hasMoreElements())
        {
            String token=st.nextToken();
            if(token.equalsIgnoreCase("box")){
                continue;
            }*/

//            System.out.println(st.nextToken());
        System.out.println("total number of tokens: " +st.countTokens());
        }
       /* String str="hello:java:world";
        String[] string=str.split(":");
        System.out.println("strings :" +string);
        for (String strings:string) {
            System.out.println(string);*/

        }

  /*  }
}*/
