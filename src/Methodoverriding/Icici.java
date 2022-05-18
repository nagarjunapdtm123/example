package Methodoverriding;

class Icici extends Bank {
    @Override
    int getRateOfInterest() {
//        System.out.println("rate of icici interest is : ");
        return 8;
    }
}