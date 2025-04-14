package SortingPractice;

import java.time.LocalDate;

public class User {

    String name;
    LocalDate signupDate;

    public User(String name, LocalDate signupDate) {
        this.name = name;
        this.signupDate = signupDate;
    }

    @Override
    public String toString() {
        return name + "|" + signupDate;

    }

}
