package Map.HashMap;

import java.util.*;

public class DemoHashMap1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Faraaz", 20);
        map.put("Pavan", 60);
        map.put("Ruthvik", 50);

        System.out.println(map.get("Faraaz"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        int isPresentNithik = map.getOrDefault("Nithik", 0);
        System.out.println(isPresentNithik);

       Set<String> names = map.keySet();

       Collection<Integer> rollnumber = map.values();

       boolean isSanjayPrent = map.containsKey("Sanjay");
        System.out.println(isSanjayPrent);

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        map.remove("Pavan");
    }
}
