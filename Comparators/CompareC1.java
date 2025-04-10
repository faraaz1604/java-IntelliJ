package Comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareC1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        Collections.sort(people);
        System.out.println(people);

        Collections.sort(people, new PeopleNameComparator());
        System.out.println(people);



    }
}
