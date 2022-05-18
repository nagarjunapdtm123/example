package javaloop;

public class Stmt {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            if (i == 6)
//                continue;
//                break;
                return;
            System.out.println("with continue=" +i);
        }
            System.out.println("out side  of pgrm");

    }
}
