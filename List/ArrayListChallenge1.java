package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        boolean flag = true;
        while(flag) {
            System.out.println("Enter a number for which action you want to do (0: quit, 1: add, 2: remove): ");
            int option = sc.nextInt();
            sc.nextLine(); // consume the newline

            switch (option) {
                case 0 -> flag = false;
                case 1 -> addItem(groceryList, sc);
                case 2 -> removeItem(groceryList, sc);
                default -> System.out.println("Enter Valid option");
            }
        }
        sc.close();
    }

    private static void removeItem(ArrayList<String> groceryList, Scanner sc) {
        System.out.println("Please enter the item you want to remove: ");
        String item = sc.nextLine();

        if(groceryList.contains(item)){
            groceryList.remove(item);
            System.out.println("Item removed from the groceryList");
        }
        else {
            System.out.println("Item not found in the groceryList");
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current list: " + groceryList);
    }

    private static void addItem(ArrayList<String> groceryList, Scanner sc) {
        System.out.println("Please enter the item you want to add: ");
        String item = sc.nextLine();

        if(groceryList.contains(item)){
            System.out.println("Item already present in the groceryList");
        }
        else {
            groceryList.add(item);
            System.out.println("Item added to the groceryList");
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Current list: " + groceryList);
    }
}