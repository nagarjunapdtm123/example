package javaloop;

import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("enter character :");
        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
        String ch= sc.next();
        if (ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("u") || ch.equalsIgnoreCase("o")) {
            System.out.println("Given character is vowel ");
        }
            else{
                System.out.println("Given character is consonant ");
            }



    }
}

       /* String str = "Codexbox";
        int vowel = 0;
        int consonant = 0;
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);*/
/*
            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {

                vowel++;
            }

                else  (ch >=='a' || ch <=='z') {
                consonant++;

            }
        }
        System.out.println("vowel is:" +vowel);
        System.out.println("consonant is  :" +consonant);*/

/*

    }
}
*/

