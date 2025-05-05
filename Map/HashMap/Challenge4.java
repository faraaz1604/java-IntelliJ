package Map.HashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Challenge4 {

    public static Map<Integer, List<String>> groupWordsByLength(String[] strs){

        LinkedHashMap<Integer, List<String>> map = new LinkedHashMap<>();

        for(String str : strs){
            int key = str.length();

            map.computeIfAbsent(key , k -> new ArrayList<>()).add(str);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "hi", "cat", "bat", "dog", "hat", "book", "a"};
        System.out.println(groupWordsByLength(words));
    }
}
