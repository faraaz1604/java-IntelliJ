package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }
}


public class Main {


    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Apples", "produce", 2));
        groceryList.add(new GroceryItem("Bananas", "produce", 4));
        groceryList.addFirst(new GroceryItem("Mangoes", "produce", 10));

//        System.out.println(groceryList);

        String[] item  = {"apple", "mango", "handWash", "RoomFreshner"};

        List<String> gl = List.of(item);
//        gl.add("tissue");
        System.out.println(gl);

        ArrayList<String> ngl = new ArrayList<>(gl);
        ngl.add("tissue");


        System.out.println(ngl);

        System.out.println("second item " + ngl.get(2));
        if(ngl.contains("tissue")){
            System.out.println("tissue hai already ..no need");
        }
        ngl.add("mango");
        System.out.println(ngl.indexOf("mango"));
        System.out.println(ngl.lastIndexOf("mango"));

        ngl.clear();

        ngl.addAll(List.of("apple","Banana", "Mango"));
        ngl.addAll(Arrays.asList("milk","butter", "sugar"));

        ArrayList<String> arrayList = new ArrayList<>(List.of("first","second", "third", "fourth"));
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

        String[] originalArray = {"first","second", "third"};

        var arrayList1 = Arrays.asList(originalArray);


    }
}
