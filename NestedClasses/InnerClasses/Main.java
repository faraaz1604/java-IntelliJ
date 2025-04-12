package NestedClasses.InnerClasses;

import NestedClasses.LocalClasses.ExpenseTracker;

public class Main {

    public static void main(String[] args) {

//        Library lib =  new Library("Mysore Library");
//        Library.Book book = lib.new Book("Java Programing", "Faraaz");
//        System.out.println(book);
//
//        lib.addBooks(lib.new Book("Java Programing 1", "Faraaz1"));
//        lib.addBooks(lib.new Book("Java Programing 2", "Faraaz2"));
//        lib.addBooks(lib.new Book("Java Programing 3", "Faraaz3"));
//        lib.addBooks(lib.new Book("Java Programing 4", "Faraaz4"));
//
//        lib.printBooks();

        Company company = new Company("Google");
        Company.Employee employee = company.new Employee("Faraaz", "SDE-2");

        employee.display();

        company.addEmployee(company.new Employee("MD Faraaz", "SDE-2"));
        company.addEmployee(company.new Employee("Haris", "Pharmasist"));
        company.addEmployee(company.new Employee("Danish", "Sales"));
        company.addEmployee(company.new Employee("Fardeen", "Accountant"));

        company.listEmployees();

        ExpenseTracker expenseTracker = new ExpenseTracker();
        expenseTracker.printExpenseReport();
    }
}
