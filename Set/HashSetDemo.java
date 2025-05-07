package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Faraaz");
        set.add("Ruthvik");
        set.add("Pavan");
        set.add("Faraaz"); //duplicate value will be ignored

        System.out.println(set);
    }
}
