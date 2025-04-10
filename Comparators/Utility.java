package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility {

    public static <T> List<T> reverse(List<T> list){
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }
    public static void main(String[] args) {
        List<String> names = List.of("Faraaz", "John", "Ali");
        List<Integer> numbers = List.of(10, 20, 30);

        System.out.println("Reversed Names: " + reverse(names));
        System.out.println("Reversed Numbers: " + reverse(numbers));
    }
}
