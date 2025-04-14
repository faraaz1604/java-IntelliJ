package FunctinalIterfaces;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class All4practice {

    public static void main(String[] args) {

        List<String> names = List.of("Faraaz","john","ismael","salami","pasha");

        Supplier<String> getRandomName = () -> {
            Random random = new Random();
            return names.get(random.nextInt(names.size()));

        };

        Predicate<String> checkNameLength = str -> str.length() > 5;

        Function<String, String> toUpperCase = String::toUpperCase;

        Consumer<String> print = System.out::println;

         Stream.generate(getRandomName)
                 .limit(5)
                .filter(checkNameLength)
                .map(toUpperCase)
                .forEach(print);



    }


}
