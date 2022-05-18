package Encapsulation;

import java.util.Scanner;

public  abstract class Employee {
    private int empid;
    private String empName;
    private String address;

    public int getEmpid() {
        return empid;
    }
        Scanner sc = new Scanner(System.in);



    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   abstract String employeelocation();
      abstract long sal();
      abstract String deptName();
}

