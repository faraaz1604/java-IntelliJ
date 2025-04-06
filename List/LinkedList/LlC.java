package List.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LlC {

    public static void main(String[] args) {

        LinkedList<Place> itinerary = new LinkedList<>();

        itinerary.add(new Place("Sydney", 0));
        itinerary.add(new Place("Adelaide", 1374));
        itinerary.add(new Place("Alice Spring", 2771));
        itinerary.add(new Place("Brisbane", 917));
        itinerary.add(new Place("Darwin", 3972));
        itinerary.add(new Place("Melbourne", 877));
        itinerary.add(new Place("Perth", 3923));

        Scanner sc = new Scanner(System.in);
        printMenu(itinerary, sc);
        sc.close();

    }

    public static void printMenu(LinkedList<Place> itinerary, Scanner sc){
        String message = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;


        ListIterator<Place> iterator = itinerary.listIterator();
        boolean flag = true;
        boolean goingFarward = true;
        while (flag){
            System.out.println(message);
            String action = sc.nextLine().trim().toUpperCase();
            switch (action){
                case "F","Forward" -> {
                    if(!goingFarward && iterator.hasNext()){
                        iterator.next();
                    }
                    if(iterator.hasNext()){
                        System.out.println("Your next place is :"+ iterator.next());
                        goingFarward = true;
                    }
                    else System.out.println("End of the list. Cant move forward");
                }
                case "B","Backward" -> {
                    if(goingFarward && iterator.hasPrevious()){
                        iterator.previous();
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Your next place is :"+ iterator.previous());
                        goingFarward = false;
                    }
                    else System.out.println("Start of the list cant move backward");

                }
                case "L","List Places" -> printList(itinerary);
                case "M","Menu" -> {}
                case "Q","Quit" -> flag = false;
                default -> System.out.println("invalid options");
            }
        }
    }



    public static void printList(LinkedList<Place> itinerary) {
        itinerary.forEach(System.out::println);
    }

    public static void moveBackward(LinkedList<Place> itinerary) {
        ListIterator<Place> iterator = itinerary.listIterator();
        if (iterator.hasPrevious()){
            System.out.println("your last place was: "+ iterator.previous());
        }
    }

    public static void moveForward(LinkedList<Place> itinerary) {
        ListIterator<Place> iterator = itinerary.listIterator();
        if (iterator.hasNext()){
            System.out.println("your next place is: "+ iterator.next());
        }
    }


}
