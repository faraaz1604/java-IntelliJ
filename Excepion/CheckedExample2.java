package Excepion;

public class CheckedExample2 {
    public static void main(String[] args) {
        try {
            System.out.println("Sleeping...");
            Thread.sleep(2000);
            System.out.println("Awake!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
