package javaloop;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char ch;
        String s;
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        s= sc.nextLine();
        System.out.println("Vowels in a String are :");
        for(int j=0;j < s.length(); j++)
        {
            ch=s.charAt(j);

        switch(ch)
        {
            case  'a':
            case 'e':
            case 'i':
            case  'o':
            case 'u':
            case 'A':
            case  'E':
            case 'I':
            case 'O':
            case 'U': i=1;
                System.out.println(ch);
        }
    }
    if(i==0)
     System.out.println("There are no vowels in a string :");
}
}
