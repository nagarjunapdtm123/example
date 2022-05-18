package Methodoverriding;

class Sbi extends Bank {
    @Override
    int getRateOfInterest() {
//        System.out.println("rate of sbi interest is : ");
        return 5;
    }
}

