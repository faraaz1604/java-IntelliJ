package Collection.LinkedList;

public class LinkedList {

    Node head;


    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void  print(){
        Node current = head;
        while (current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data + "->");
        System.out.println("NULL");
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }




}
