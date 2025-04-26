package Multithreading;

public class MultiThread {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i<=5; i++){
                System.out.println("Thread 1 : " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread thread2 = new Thread(() -> {
            for (char c = 'A'; c<='E'; c++){
                System.out.println("Thread 2 : " + c );
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        thread1.start();
        thread2.start();
    }

}
