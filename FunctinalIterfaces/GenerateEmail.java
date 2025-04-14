package FunctinalIterfaces;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateEmail {

    public static void main(String[] args) {

        Supplier<String> generateEmail = () ->{
            Random random = new Random();
            int randomNum = 100+random.nextInt(999);
            String name = "faraaz";
            String postFix = "@gamil.com";
            String fakeEmail = String.format("%s%d%s",name,randomNum,postFix);
            return fakeEmail;
        };


        Stream.generate(generateEmail)
                .limit(5)
                .forEach(System.out::println);
    }
}
