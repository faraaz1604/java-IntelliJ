package Map.HashMap;

import java.util.*;

public class Challenge3 {

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = String.valueOf(chars);

            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input));
    }


}
