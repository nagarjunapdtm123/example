package Encapsulation;

 public  class Employee1 extends Employee {
    String employeelocatin() {
        return "Hyd";
    }

     @Override
     String employeelocation() {
         return "Bang";
     }

     long sal() {
        return 12L;
    }

     @Override
     String deptName() {
         return "Electrical";
     }

 }
