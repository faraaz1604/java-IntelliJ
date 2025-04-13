package FunctinalIterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerListMission {
    public static void main(String[] args) {
        List<String> users = List.of("faraaz", "alex", "john");

        Consumer<String> greeter = name -> System.out.println("Welcome, " + name.toUpperCase());

        users.forEach(greeter);
    }
}
