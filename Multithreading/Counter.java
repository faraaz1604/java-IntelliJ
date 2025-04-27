package Multithreading;

public class Counter {
    public static void main(String[] args) {

//        Thread numberThread = new Thread() {
//
//            public void run(){
//                for (int i = 0; i<=10; i++){
//                    System.out.println(i);
//                }
//            }
//
//        };
//
//        numberThread.start();
//
//        System.out.println("Main thread continues execution...");

        Thread thread = new Thread(() -> {
            for (int i = 0; i<=10; i++){
                System.out.println(i);
            }
        });
    }
}
