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

        myLinkedList.prepend(3);

        myLinkedList.PrintList();
        myLinkedList.printLength();

        System.out.println(myLinkedList.removeFirst().data);


        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.PrintList();

        System.out.println(myLinkedList.get(3).data);
        System.out.println(myLinkedList.insert(2, 28));
        myLinkedList.PrintList();

        myLinkedList.reverse();
        myLinkedList.PrintList();


    }
}
