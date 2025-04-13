package FunctinalIterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Combinefunctions {


    public static void main(String[] args) {

        Supplier<List<Integer>> number = () -> {
            List<Integer> numGen = new ArrayList<>(10);
            Random random = new Random();
            for (int i = 0; i<10; i++){
                numGen.add(random.nextInt(100)+1);
            }
            return numGen;
        };

        Predicate<Integer> isOdd = num -> num % 2 ==0;

        Function<Integer, String> convertString = n -> "Number: " + n;

        Consumer<String> printNum = s -> System.out.println(s);

        List<Integer> numbergenerated = number.get();
        System.out.println(numbergenerated);

        numbergenerated.stream()
                .filter(isOdd)
                .map(convertString)
                .forEach(printNum);
    }
}
