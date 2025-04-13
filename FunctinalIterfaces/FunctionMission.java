package FunctinalIterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionMission {
    public static void main(String[] args) {
        Function<String, String> wordToUpperCase = word -> word.toUpperCase();

        System.out.println("UpperCase of 'faraaz' is: " + wordToUpperCase.apply("faraaz"));


        Function<String, String> reverseString = s -> {
            String reverse = "";
            for (int i = 0; i<s.length(); i++){
                reverse = s.charAt(i) + reverse;
            }
            return reverse;
        };

        System.out.println(reverseString.apply("Faraaz"));

        Function<List<String>, Map<String , Integer>> typeConversion = list -> {

            Map<String, Integer> map = new HashMap<>();

            for (String s : list){
                map.put(s , s.length());
            }
            return map;

        };

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> map = typeConversion.apply(words);
        System.out.println(map);


        Function<Integer, Integer> add10 = num -> num+10;
        Function<Integer, Integer> mul2 = num -> num*2;
        Function<Integer, String> combinetoString = n -> "result: "+ n;

        Function<Integer, String> processNumber = add10.andThen(mul2).andThen(combinetoString);

        System.out.println(processNumber.apply(5));

    }
}
