package NestedClasses.Anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(10,23,3,55,100));


        Collections.sort(list, (o1, o2) -> o2 - o1);

        System.out.println(list);


        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Woof woof");
            }
        };

        dog.sound();
    }






}
