package FunctinalIterfaces;

import java.util.function.Consumer;

public class ConsumerMission {
    public static void main(String[] args) {
        Consumer<String> greeter = name -> System.out.println("Hello, " + name.toUpperCase() + "!");

        greeter.accept("Faraaz");
        greeter.accept("Java Master");
    }

}

