package Multithreading;

public class DelayNumber {

    public static void main(String[] args) {

        Thread delayThread = new Thread(() ->{
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Number :" + i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println("Thread was interpeted");
                e.printStackTrace();

            }

        });

        delayThread.start();
    }
}
