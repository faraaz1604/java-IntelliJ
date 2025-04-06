package ArrayChallenge;

import java.util.Scanner;
public class MinimumElement {


    public static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }



    public static int[] readElements(int num){
        Scanner sc = new Scanner(System.in);
        int[] newArr = new int[num];
        for(int i =0; i<newArr.length; i++){
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }

    public static int findMin(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i : num){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}
