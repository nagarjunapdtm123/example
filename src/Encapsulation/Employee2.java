package Encapsulation;

public class Employee2 extends Employee{
    @Override
    String employeelocation() {
        return "Ndl";
    }

    @Override
    long sal() {
        return 98L;
    }

    String deptName() {
       return "IT";
    }
}
