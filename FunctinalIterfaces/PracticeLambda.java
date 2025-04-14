package FunctinalIterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeLambda {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Ahmed", "John", "Arjun", "Steve");

        Predicate<String> listPredicate = name -> name.startsWith("A");

        Function<String, Integer> getLength = str -> str.length();
        List<Integer> lengthList = names.stream()
                .map(getLength)
                .collect(Collectors.toList());
        System.out.println(lengthList);

        List<String> names2 = List.of("Java", "Lambda", "Streams", "Backend");

        Consumer<String> reverseString = str -> {
            StringBuilder sb  = new StringBuilder(str);
            System.out.print(sb.reverse()+" ");
        };

        names2.stream().forEach(reverseString);


        Supplier<String> randomOTP = () -> {
            Random random = new Random();
            int randomNum = random.nextInt(9999-1000)+1000;
            String otp = "OTP-"+randomNum;
            return otp;
        };

        Stream.generate(randomOTP).limit(5).forEach(s -> System.out.println(s));


        List<String> words = List.of("Java", "",  "Spring", " ");
        Predicate<String> checkempty = str -> str == null || str.trim().isEmpty();

        List<String> filteredlist = words.stream()
                                         .filter(checkempty.negate())
                                         .collect(Collectors.toList());

        System.out.println(filteredlist);


    }
}
