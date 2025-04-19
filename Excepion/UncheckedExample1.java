package Excepion;

public class UncheckedExample1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int result = x / y; // 💥 ArithmeticException
        System.out.println(result);
    }
}

