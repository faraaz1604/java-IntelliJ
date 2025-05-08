package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetChallenge2 {

    public static void printUniqueNum(int[] arr){

        Set<Integer> nums = new LinkedHashSet<>();

        for(int num : arr){
            nums.add(num);
        }

        for (int num : nums){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,3,4,5,2,2,1};
        printUniqueNum(arr);

    }
}
