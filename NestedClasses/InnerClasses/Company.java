package NestedClasses.InnerClasses;

import Inheritance.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    private List<Employee>  list = new ArrayList<>();

    public void addEmployee(Employee emp){
        list.add(emp);
    }

    public void listEmployees(){
        for (Employee e : list){
            System.out.println(e);
        }
    }

    public class Employee{

        private String empName;
        private String role;

        public Employee(String empName, String role) {
            this.empName = empName;
            this.role = role;
        }

        public void display() {
            if (role.equalsIgnoreCase("SDE-2")) {
                System.out.println(empName + " is a developer at " + companyName);
            } else {
                System.out.println(empName + " works as a " + role + " at " + companyName);
            }
        }


        @Override
        public String toString() {
            return "EmployeeName: " + empName + " | Role: " + role + " | Company: " + companyName;
        }

    }

}
