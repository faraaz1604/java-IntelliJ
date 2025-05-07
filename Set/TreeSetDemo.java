package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> set =  new TreeSet<>();
        set.add(90);
        set.add(10);
        set.add(80);
        set.add(70);
        set.add(20);
        System.out.println(set);

        for (int n : set){
            System.out.println(n);
        }

        System.out.println(set.contains(90));
        System.out.println(set.size());
        System.out.println(set.remove(90));
        System.out.println(set);
        set.clear();
        System.out.println(set.isEmpty());



    }
}
