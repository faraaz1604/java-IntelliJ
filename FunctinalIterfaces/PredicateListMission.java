package FunctinalIterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateListMission {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 7, 10, 13, 16);

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> greater10 = num -> num > 10;

        System.out.println("Even numbers:");
        numbers.stream()
                .filter(isEven)
                .filter(greater10)
                .forEach(System.out::println);
    }
}

