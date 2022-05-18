package Scanner;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter name,age,salary :");
        String name=sc.nextLine();
        int age =sc.nextInt();
        double salary=sc.nextDouble();
        System.out.println("enter name :"+name);
        System.out.println("enter age : "+age);
        System.out.println("enter salary : "+salary);

    }
}
