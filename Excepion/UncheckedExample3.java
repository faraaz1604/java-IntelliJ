package Excepion;

public class UncheckedExample3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // 💥 ArrayIndexOutOfBoundsException
    }
}

