package Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utility {

    public static <T> List<T> reverse(List<T> list){
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    public static <T> List<T> repeat(T element, int count){
        List<T> list = new ArrayList<>(count);
        for(int i = 0 ; i<count; i++){
            list.add(element);
        }
        return list;
    }

    public static void printList(List<? extends Number> list){
        for( Number n  : list){
            System.out.println(n);
        }
    }

    public static void copy(List<? super Integer> dest, List<Integer> src){
         List<Integer> sourceList = new ArrayList<>(src);
         List<Integer> destinationList = (List<Integer>) new ArrayList<>(dest);

        destinationList.addAll(sourceList);


    }

    List<Number> numbers = new ArrayList<>();
    List<Integer> ints = Arrays.asList(1, 2, 3);





    public static void main(String[] args) {
        List<String> names = List.of("Faraaz", "John", "Ali");
        List<Integer> numbers = List.of(10, 20, 30);

        System.out.println("Reversed Names: " + reverse(names));
        System.out.println("Reversed Numbers: " + reverse(numbers));

        System.out.println("-------------repeatMethod---------------------");

        List<String> namesElemnt = repeat("Faraaz", 4);
        List<Integer> numbersElemnt = repeat(10, 2);

        System.out.println(namesElemnt);
        System.out.println(numbersElemnt);

        System.out.println("-------------foreachMethod---------------------");

        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printList(intList);
        printList(doubleList);



    }


}
