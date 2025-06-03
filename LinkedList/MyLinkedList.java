package LinkedList;

public class MyLinkedList {

    Node head;
    Node tail;
    int length;

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

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }
}
