package javaloop;

public abstract class Motorbike {
     abstract void brake();

}
class Apache extends Motorbike {
     public void brake() {
          System.out.println("Apache brake is disc");

     }
}
class Honda extends Motorbike {
     public void brake() {
          System.out.println("Honda brake is sudden brake ");
     }
}
class hello3 {
     public static void main(String[] args) {
          Apache a=new Apache();
          a.brake();
          Honda h=new Honda();
          h.brake();
     }
}

