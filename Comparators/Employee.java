package Comparators;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
