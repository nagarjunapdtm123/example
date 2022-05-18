package Assesment2;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO RAILWAY RESERVATION SYSTEM : ");
        System.out.println("Enter from : ");
        String from = sc.nextLine();
        System.out.println("Enter to : ");
        String to = sc.nextLine();
        System.out.println("Enter passenger name : ");
        String name = sc.nextLine();
        System.out.println("Enter Gender : ");
        String sex = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter mobile no : ");
        int mobileno = sc.nextInt();
        System.out.println("Enter address : ");
        String address = sc.next();
        System.out.println("Enter mailid : ");
        String mailid = sc.next();
        String location;
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

