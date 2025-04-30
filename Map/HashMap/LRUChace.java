package Map.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUChace<K, V> extends LinkedHashMap<K ,V> {

    int capacity;

    public LRUChace( int capacity) {
        super(capacity, 0.5f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUChace<String , Integer> lruChace = new LRUChace<>(3);

        lruChace.put("Faraaz", 20);
        lruChace.put("HAris", 30);
        lruChace.put("mango", 40);
        lruChace.put("apple", 50);
        lruChace.putIfAbsent("Faraaz",10);
        lruChace.get("Faraaz");
        lruChace.get("apple");

        System.out.println(lruChace);

    }
}
