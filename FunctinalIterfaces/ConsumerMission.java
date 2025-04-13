package FunctinalIterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMission {
    public static void main(String[] args) {
        Consumer<String> greeter = name -> System.out.println("Hello, " + name.toUpperCase() + "!");

        greeter.accept("Faraaz");
        greeter.accept("Java Master");

        Consumer<String> processString = s -> {
            String name = s.toUpperCase();
            System.out.println("upperCase name: " + name + " length: " + s.length());
        };

        processString.accept("Faraaz");


        Consumer<StringBuilder> appendString = sb -> System.out.println(sb.append("- Modified"));
        appendString.accept(new StringBuilder("hello world "));

        Consumer<List<Integer>> addTen = list -> list.add(10);
        Consumer<List<Integer>> removeOdd = list -> list.removeIf(n -> n % 2 != 0);
        Consumer<List<Integer>> combinedList = addTen.andThen(removeOdd);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        combinedList.accept(list);
        System.out.println(list);



    }

}

