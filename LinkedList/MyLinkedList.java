package LinkedList;

public class MyLinkedList {

    Node head;


    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void print(){
        Node current  = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void swapInPairs(){
        Node current  = head;
        while(current!=null){

                Node temp = current;
                current = current.next;
                current.next = temp;


        }
    }
}
