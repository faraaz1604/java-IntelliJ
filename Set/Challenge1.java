package Set;

import java.util.HashSet;
import java.util.Set;

public class Challenge1 {

    public static Character findUnique(String word){

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : word.toCharArray()){
            if(seen.contains(c)){
                duplicate.add(c);
            }else {
                seen.add(c);
            }
        }

        System.out.println("Seen: " + seen);
        System.out.println("Dublicate: " + duplicate);

        for (char c : word.toCharArray()){
            if (!duplicate.contains(c)){
                return c;
            }
        }


        return '_';



    }

    public static void main(String[] args) {

        String word = "abbcdssppsbb";
        System.out.println(findUnique(word));
    }
}
