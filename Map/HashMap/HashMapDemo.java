package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Afreen");
        students.put(2,"Aidha");
        students.put(3,"bumika");
        students.put(4,"charandi");

        for (Integer roll : students.keySet()){
            System.out.println("Keys : "+ roll );
        }

        for(String names : students.values()){
            System.out.println("Values : " + names);
        }

        for (Map.Entry<Integer, String> studentlist : students.entrySet()) {
            System.out.println(studentlist.getKey() + " -> " + studentlist.getValue());

        }

    }
}
