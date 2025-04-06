package ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {

        int[] arr = new int[5];
        reverserRandArr(arr);
        int[] finalarr = reverse(arr);

        System.out.println(Arrays.toString(finalarr));




        }

        public static int[] reverserRandArr(int[] arr) {

            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }

            Arrays.sort(arr);

            return arr;
        }

        public static int[] reverse(int[] arr){
        int[] reverseArr = new int[arr.length];

            for (int i = 0; i< arr.length; i++){
                reverseArr[i] = arr[arr.length-1-i];
            }

            return reverseArr;
        }
    }

