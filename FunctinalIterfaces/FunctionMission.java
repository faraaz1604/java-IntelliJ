package FunctinalIterfaces;

import java.util.function.Function;

public class FunctionMission {
    public static void main(String[] args) {
        Function<String, String> wordToUpperCase = word -> word.toUpperCase();

        System.out.println("UpperCase of 'faraaz' is: " + wordToUpperCase.apply("faraaz"));


    }
}
