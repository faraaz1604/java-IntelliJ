package Set;

import java.util.HashSet;
import java.util.Set;



public class SetChallenge4 {

    public static Character findFirst(String str){

        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()){
            if(!set.add(c)){ // this is imp this will return false

                return c;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String name = "Faraaz";
        System.out.println(findFirst(name));


    }
}
