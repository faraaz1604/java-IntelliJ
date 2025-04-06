package List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Mysore");
        placesToVisit.add("Bangalore");
        placesToVisit.add("jammu and kashmir");
        placesToVisit.add("kerala");
        placesToVisit.add("Mandya");

//        placesToVisit.forEach(System.out::println);

        placesToVisit.stream()
                .filter(tn -> tn.startsWith("M"))
                .forEach(System.out::println);


//        printLinkedList(placesToVisit);
    }

    private static void printLinkedList(LinkedList<String> placesToVisit) {

        System.out.println("Trip starts at "+ placesToVisit.getFirst());
        String firstTown = placesToVisit.getFirst();
        ListIterator<String> iterator = placesToVisit.listIterator(1);
        while (iterator.hasNext()){
            String town = iterator.next();
            System.out.println("--> from "+ firstTown + " to "+ town);
            firstTown = town;
        }
        System.out.println("Trip ends at "+ placesToVisit.getLast());


    }


}
