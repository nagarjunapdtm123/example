package Assesment2;

import java.util.Scanner;

public class PassengerDetails extends RailwayReservation  {

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PASSENGER DETAILS");
        System.out.println("Enter passenger name : ");
        String name=sc.nextLine();
        System.out.println("Enter Gender : ");
        String gender=sc.nextLine();
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        System.out.println("Enter mobile no : ");
        int mobileno=sc.nextInt();
        System.out.println("Enter address : ");
        String address=sc.next();
        System.out.println("Enter mailid : ");
        String mailid=sc.next();

    }
}
