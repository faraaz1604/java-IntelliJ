package FunctinalIterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMission {
    public static void main(String[] args) {
//        Predicate<Integer> isEven = num -> num%2==0;
//
//        System.out.println("Is 20 an even number? " + isEven.test(20));
//        System.out.println("Is 15 an even number? " + isEven.test(15));

        Predicate<String> isValidEmail = email ->
                email != null && email.contains("@") && email.contains(".");
        boolean valid = isValidEmail.test("user@example.com"); // true

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> integerPredicate = num -> num > 50;

        Predicate<Integer> combine = isEven.and(integerPredicate);

        System.out.println(combine.test(60));


        Predicate<List<String>> isEmpty = list -> list.isEmpty();
        Predicate<List<String>> isNotEmpty =  isEmpty.negate();

        List<String> emptyList = new ArrayList<>();
        List<String> fullList = Arrays.asList("item1", "item2");

        boolean result1 = isNotEmpty.test(emptyList); // false
        boolean result2 = isNotEmpty.test(fullList);

        System.out.println(result1);
        System.out.println(result2);

    }
}
