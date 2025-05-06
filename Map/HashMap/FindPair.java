package Map.HashMap;

import java.util.*;

public class FindPair {

    public static List<int[]> findPairs(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int num : arr){
            int complement = target - num;

            if(map.containsKey(complement)){
                result.add(new int[]{complement, num});
            }
            map.put(num,1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;

        List<int[]>  result = findPairs(arr,target);

        for (int[] pair : result){
            System.out.println(pair[0] + " + " + pair[1] + " = " + target);
        }

    }
}
