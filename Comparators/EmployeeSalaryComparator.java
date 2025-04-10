package Comparators;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int salaryComperision = Double.compare(e2.getSalary(), e1.getSalary());

        if(salaryComperision == 0){
            return e1.getName().compareTo(e2.getName());
        }
        return salaryComperision;
    }
}
