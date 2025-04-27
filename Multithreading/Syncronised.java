package Multithreading;

public class Syncronised {

    int counter;

//    public synchronized void increment(){
//        counter++;
//    }


    public int getCounter(){
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {

        Syncronised sy = new Syncronised();

        Thread thread1 = new Thread(() ->{
            for (int i =1; i<=1000; i++){
                 sy.counter++;
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i =1; i<=1000; i++){
                sy.counter++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sy.getCounter());
    }
}
