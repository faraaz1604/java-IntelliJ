package DSA_JAVA_UDEMY;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList =  new MyLinkedList(4);


//        myLinkedList.printHead();
//        myLinkedList.printTail();
//        myLinkedList.printLength();
//
//        myLinkedList.PrintList();

        myLinkedList.append(5);
        myLinkedList.append(6);


        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.PrintList();

        System.out.println(myLinkedList.removeLast().data);
        myLinkedList.PrintList();
        System.out.println(myLinkedList.removeLast().data);
        myLinkedList.PrintList();
        System.out.println(myLinkedList.removeLast().data);
        myLinkedList.PrintList();


    }
}
