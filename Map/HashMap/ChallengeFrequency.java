package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChallengeFrequency {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = sc.nextLine();
        System.out.println(countFreq(word));



    }

    public static Map<Character , Integer> countFreq(String word) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        return map;

    }
}
