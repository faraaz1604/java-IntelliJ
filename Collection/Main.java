package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(100);
        System.out.println(list.getFirst());
        System.out.println(list.size());

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.forEach(System.out::println);

        System.out.println();

        for (Integer i: list){
            System.out.println(i);
        }

        boolean doesContain = list.contains(34);
        System.out.println(doesContain);

        list.remove(1);
        System.out.println(list);

        list.add(1,29);
        System.out.println(list);

        list.set(1,30);
        System.out.println(list);
    }
}
