package Comparators;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Students> stud = new ArrayList<>();
        stud.add(new Students(10, "Babu", 89.88));
        stud.add(new Students(1, "Afreen", 78.00));
        stud.add(new Students(12, "Zara",100.00));
        stud.add(new Students(23, "Ali", 123.09));

        System.out.println("-------------normal comparable -------------------");

        Collections.sort(stud);
        for (Students s : stud){
            System.out.println(s);
        }


        System.out.println("-------------Using RollNumComparator-------------------");

        Collections.sort(stud, new RollNumberComparator());
        for (Students s : stud){
            System.out.println(s);
        }


        System.out.println("-------------Using NameComparator-------------------");

        Collections.sort(stud, new NameComparator());
        for(Students s : stud){
            System.out.println(s);
        }

        System.out.println("-------------Using MarksComparator-------------------");

        Collections.sort(stud, new MarksCompartor());
        System.out.println("\nSorted by Marks (Lowest first):");
        for(Students s : stud){
            System.out.println(s);
        }

        System.out.println("-------------Empolyee salary-------------------");


        List<Employee> employees = Arrays.asList(
                new Employee("Zara", 50000),
                new Employee("Ali", 60000),
                new Employee("Babu", 60000)
        );

        Collections.sort(employees , new EmployeeSalaryComparator());
        System.out.println(employees);








    }
}