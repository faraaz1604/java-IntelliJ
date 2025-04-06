package ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

//        int[] arr = getIntegers(5);
//        printArray(arr);
//        int[] sortArr = sortIntegers(arr);
//        System.out.println(Arrays.toString(sortArr));
        int[] arrMin = {-2,0,1,200,-45};
        System.out.println(findMin(arrMin));
    }

    public static int[] getIntegers(int num){
        int[] arr = new int[num];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            {
                System.out.println("Please enter a number "+i);
                arr[i] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
            System.out.println("Element "+ i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int temp = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i] < arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                    flag = true;
                }
            }
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0 ; i< arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

}




