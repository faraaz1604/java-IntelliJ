import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] arr = {20,-34,54,2,1,4,100};
//
//        System.out.println("the smallest number in array is :" + smallestElement(arr));
//
//       int[] reversedArray =  reverseArray(arr);
//       printArray(reversedArray);
//
//       countOddEven(arr);

//        System.out.println("the third largest element is : " + findthirdMaxNumber(arr));
//
//        int[] sortedArray = {1,1,2,2,3,4,4,5};
//        int size = removeDuplicated(sortedArray);
//        System.out.println("the new size after removing duplicates is : " + size);
//
//        int[] numArr = {1,2,3,5};
//        int missingNumber = checkNum(numArr);
//        System.out.println("missing number is : "+ missingNumber);

//        int[] InputArr = {2,4,3,5,7,8,9};
//        int targetsum = 10;
//
//        findAllPairs(InputArr, targetsum);

//        int[] freArr = {1, 3, 2, 3, 4, 3, 5, 2,2,2,2};

//        int num  = mostFrequentNumber(freArr);
//        System.out.println(num);
//
//        int[] arrSort = {1, 3, 10,34,55,100,-9,23};
//        System.out.println("before sorting = ");
//        printArray(arrSort);
//        bubbleSort(arrSort);
//
//        System.out.println("after bubble sort = ");
//        printArray(arrSort);
//
        int[] roArr = {1,2,3,4,5};
        int k = 2;
        rotateArray(roArr, k);
        printArray(roArr);




    }
    private static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-1 );
        reverse(arr,0, k-1);
        reverse(arr, k, n-1);

    }

    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }



    private static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }


    private static int mostFrequentNumber(int[] arr){
        Arrays.sort(arr);
        int mostFrequentElement = arr[0];
        int maxFrequency = 1;
        int currentFrequency = 1;

        for(int i = 1; i<arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentFrequency++;
            } else {
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    mostFrequentElement = arr[i - 1];
                }
                currentFrequency = 1;
            }
        }
        if(currentFrequency > maxFrequency){
            mostFrequentElement = arr[arr.length-1];
        }
        return mostFrequentElement;
    }



    private static void findAllPairs(int[] arr, int sum) {
        boolean isFirst = true;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    if (!isFirst) {
                        System.out.print(", ");
                    }
                    System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                    isFirst = false;
                }
            }
        }
    }


    private static int checkNum(int[] arr){

        int n = arr.length+1;
        int expectedSum = n * (n + 1) /2;

        int presentSum = 0;
        for (int num : arr){
            presentSum += num;
        }
        return expectedSum - presentSum;
    }


    private static int removeDuplicated(int[] array){
        if(array.length == 0){
            return 0;
        }
        int index = 0;
        for(int j = 1; j<array.length; j++){
            if(array[j]!=array[index]){
                index++;
                array[index]= array[j];
            }
        }
        for (int i = 0; i<index+1; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
          return index+1;


    }

    private static long findthirdMaxNumber(int[] arr){
        long max = Integer.MIN_VALUE;
        long secondMax = Integer.MIN_VALUE;
        long thirdMax = Integer.MIN_VALUE;

        for (int i = 0 ; i<arr.length; i++){
            if(arr[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];

            }
            else if(arr[i] > secondMax && arr[i]< max){
                secondMax = arr[i];
                thirdMax = secondMax;
            }
            else if(arr[i] > thirdMax && arr[i]>secondMax){
                thirdMax = arr[i];
            }
        }
        return thirdMax;

    }


    private static int smallestElement(int[] arr) {
       int smallest = arr[0];
       for(int i =1; i<arr.length; i++){
           if(arr[i] < smallest){
               smallest =arr[i];
           }
       }
        return smallest;
    }

    private static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] array){
        int[] reverseArr = new int[array.length];

        for(int i = 0; i<array.length; i++){
            reverseArr[i] = array[array.length - 1 - i];
        }
        return reverseArr;
    }

    private static void countOddEven(int[] array){
        int oddCount = 0;
        int evenCount = 0;
        for (int i : array){
            if(i%2 == 0){
                evenCount++;
            }else{ oddCount++;}
        }
        System.out.println("number of numbers in array that are even are : " + evenCount);
        System.out.println("number of numbers in array that are odd are : " + oddCount);
    }



}



