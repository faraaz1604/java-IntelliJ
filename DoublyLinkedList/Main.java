package DoublyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyDll mydll  =  new MyDll(1);
        mydll.append(2);
        mydll.append(3);
        mydll.append(4);
        mydll.printList();
        System.out.println();

        System.out.println(mydll.removeLast().value);
        mydll.getHead();
        mydll.getTail();
        mydll.getLength();

        mydll.prepend(0);
        mydll.printList();

        System.out.println(mydll.removeFist().value);
        mydll.printList();
        System.out.println();

        System.out.println(mydll.getNode(2).value);

        mydll.set(2,5);
        mydll.printList();

        System.out.println();

        System.out.println(mydll.insert(2,8));
        mydll.printList();
        System.out.println();

        mydll.remove(2);
        mydll.printList();
        System.out.println();

    }


}
