package Assesment2;

import java.util.Scanner;

public class AccouDetails extends  PassengerDetails {
    void fare() {
        String location;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter location");
        location = sc.next();
        switch (location) {
            case "Kurnool":
                System.out.println("General: " + 300);
                System.out.println("Sleeper :" + 200);
                System.out.println("AC:" + 500);
                break;
            case "Hyd":
                System.out.println("General " + 250);
                System.out.println("Sleeper :" + 400);
                System.out.println("Ac: " + 600);
                break;
            case "Tirupati":
                System.out.println("Genera : " + 600);
                System.out.println("Sleeper " + 800);
                System.out.println("AC " + 1200);
                break;
            case "Ongole":
                System.out.println("General :" + 200);
                System.out.println("Sleeper " + 400);
                System.out.println("AC" + 700);
                break;
        }
        System.out.println("Enter amount");
        int accountbalance=sc.nextInt();
        if(accountbalance>100) {
            System.out.println("Your ticket is confirmed");
        }
        else {
            System.out.println("Sorry ,there is no sufficient balance in your account");
        }
    }

}
