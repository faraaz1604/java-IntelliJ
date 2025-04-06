package Inheritance;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public boolean retier(){
        return isRetired;
    }

    @Override
    public double collectPay() {
        return annualSalary/12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
