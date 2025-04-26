package Multithreading;

public class PrintMessage {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() ->{
            for (int i = 1; i<=5; i++) {
                System.out.print("Hello ");
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 1; i<=5; i++) {
                System.out.print("World ");
            }
        });

        thread1.start();
        thread2.start();
    }
}
