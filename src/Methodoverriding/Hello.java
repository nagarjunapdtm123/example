package Methodoverriding;

class Hello {
    public static void main(String[] args) {
        Bank bank1 =new Sbi();
        Bank bank2 =new Icici();

        System.out.println("sbi interest is : "+bank1.getRateOfInterest());
        System.out.println("Icici interest is : "+bank2.getRateOfInterest());

    }
}
