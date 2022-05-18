package Immutability;

public class HelloWorld {
    public static void main(String[] args) {

        Immute im=new Immute(101,"nag","IT",2,12000.67);
        System.out.println("enter empno is "+im.getEmpno());
        System.out.println("name is "+im.getName());
        System.out.println("enter deptname is "+im.getDeptname());
        System.out.println("enter deptid is "+im.getDeptid());
       System.out.println("enter empsal is "+im.getEmpsal());
    }
}

