package Inheritance;

public class Main {

    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee("Faraaz", "2000-04-22", 1,
                "2022-09-22", 25000, false);

        boolean isRetired = e1.retier();
        System.out.println(isRetired ? "Employee is retired ": "Still Working");

        System.out.println(e1.getAge());

        System.out.println("Monthly Pay: $" + e1.collectPay());
        e1.terminate("2024-04-18");
        System.out.println(e1);

    }




}
