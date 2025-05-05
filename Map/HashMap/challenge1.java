package Map.HashMap;

import java.util.HashMap;

public class challenge1 {

    public static void main(String[] args) {



    }

    public static Character findNonRepeatingChar(String word){

        HashMap<Character, Integer> map = new HashMap<>();


        for(char c  : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : word.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return 0;

    }
}
