package Multithreading;

public class ThreadJoinExample {
    public static void main(String[] args) {
        // Create a thread that counts to 5 with delay
        Thread countingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Counting: " + i);
                try {
                    Thread.sleep(500); // Sleep for half a second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Counting thread finished its work");
        });

        System.out.println("Main thread: Starting the counting thread");
        countingThread.start();

        try {
            System.out.println("Main thread: Waiting for counting thread to finish...");
            // This is where the main thread waits for the counting thread to finish
            countingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This will only execute after the counting thread has finished
        System.out.println("Main thread: Finished");
    }
}
