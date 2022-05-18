package Encapsulation;

public class HelloEmployee {
    public static void main(String[] args) {
        Employee e=new Employee1();
        System.out.println("Employee1 dept name is " +e.deptName());
        System.out.println("Employee1 location is :"+e.employeelocation());
        System.out.println("Employee1 sal is "+e.sal());
        Employee e1=new Employee2();
        System.out.println("Employee2 location is "+e1.employeelocation());
        System.out.println("Employee2 sal is "+e1.sal());
        System.out.println("Employee2 dept name "+e1.deptName());
    }
}