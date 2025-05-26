package Set;

import NestedClasses.InnerClasses.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetChallenge3 {

    public static int findClosest(int[] arr, int target){

        TreeSet<Integer> nums = new TreeSet<>();

        for (int n : arr){
            nums.add(n);
        }

        Integer floor = nums.floor(target);
        Integer ceiling = nums.ceiling(target);

        System.out.println(floor);
        System.out.println(ceiling);

        if (floor == null)return ceiling;
        if (ceiling == null)return floor;

        return (Math.abs(target-floor)<= Math.abs(ceiling-target))?floor:ceiling;

    }

    public static String makeCapital(String word){
        return word.substring(0,1).toUpperCase()+word.substring(1);

    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 5, 7, 9};
        int target = 5;
//        System.out.println("Closest: " + findClosest(sortedArr, target)); // Output: 5 or 7 (depending on logic)
        System.out.println(makeCapital("faraaz"));
    }
}
