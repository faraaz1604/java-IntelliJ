package Map.HashMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer , String> map = new TreeMap<>();

        map.put(90,"Faraaz");
        map.put(30,"Pavan");
        map.put(10,"Ruthvik");
        map.put(100,"Vikas");

        System.out.println(map);

        System.out.println(map.headMap(90));
        System.out.println(map.tailMap(30));
    }

}
