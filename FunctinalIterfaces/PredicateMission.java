package FunctinalIterfaces;

import java.util.function.Predicate;

public class PredicateMission {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num%2==0;

        System.out.println("Is 20 an even number? " + isEven.test(20));
        System.out.println("Is 15 an even number? " + isEven.test(15));
    }
}
