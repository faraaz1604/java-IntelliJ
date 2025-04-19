package Excepion;

public class UncheckedExample4 {
    public static void main(String[] args) {
        String number = "abc";
        int x = Integer.parseInt(number); // 💥 NumberFormatException
        System.out.println(x);
    }
}
