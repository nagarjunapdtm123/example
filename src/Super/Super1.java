package Super;

class Super1 extends Super {
    void sum() {
        System.out.println("This sum is child class");
    }
    void disp() {
        sum();
        super.sum();
    }
}
