package FunctinalIterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentsMarks {

    public static void main(String[] args) {

        List<Integer> studentsMarks = Arrays.asList(10,39,82,99,100,39);

        Predicate<Integer> isPassing = marks -> marks>=50;

        Function<Integer,String> toResult = marks -> marks>=50?"Pass":"Fail";

        Consumer<String> print = System.out::println;

        studentsMarks.stream()
                .map(toResult)

                .forEach(System.out::println);

    }

}
