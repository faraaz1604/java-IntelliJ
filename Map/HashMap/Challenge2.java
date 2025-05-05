package Map.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Challenge2 {

    public static char findNonRepeatingChar(String word){

        LinkedHashMap<Character , Integer>  map = new LinkedHashMap<>();

        for (char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+ 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        char result = findNonRepeatingChar("abccbadee");
        System.out.println(result);
    }

}
