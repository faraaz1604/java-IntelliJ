package NestedClasses.Anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class challenge {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous Runnable!");
            }
        };

        runnable.run();

        List<String> names = Arrays.asList("Faraaz", "Alia", "Zayn", "Christopher");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());

            }
        });

        System.out.println(names.reversed());


    }







}


