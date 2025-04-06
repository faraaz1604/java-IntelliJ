package Inheritance;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public int getAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDate end = (endDate == null || endDate.isEmpty()) ? LocalDate.now() : LocalDate.parse(endDate, formatter);

        return Period.between(birth,end).getYears();
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("you are terminated at " + endDate);
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = null;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + (endDate != null ? endDate: "Still Working") + '\'' +
                '}';
    }
}
