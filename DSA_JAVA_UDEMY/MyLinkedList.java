package DSA_JAVA_UDEMY;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node{

        int data;
        Node next;

        public Node(int value){
            this.data = value;
        }
    }

    public MyLinkedList(int value){
        Node myNode = new Node(value);
        head = myNode;
        tail = myNode;
        length = 1;

    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public void PrintList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printHead(){
        System.out.println("Head : " + this.head.data);
    }

    public void printTail(){
        System.out.println("Tail : " + this.tail.data);
    }

    public void printLength(){
        System.out.println("Length : " + length);
    }
}
