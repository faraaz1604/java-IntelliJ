package FunctinalIterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BossBattle {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Faraaz", 22, true),
                new User("Ali", 17, true),
                new User("Sana", 25, false),
                new User("Zoya", 20, true)
        );

        Predicate<User> validName = user -> user.isActive() && user.age()>18;

        Function<User, String> toUpperCase = user -> user.name().toUpperCase() + " - " + user.age() ;

        Consumer<String> print = System.out::println;


        users.stream()
                .filter(validName)
                .map(toUpperCase)
                .forEach(print);

    }
}
