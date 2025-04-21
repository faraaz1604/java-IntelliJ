package Collection.LinkedList;

public class LinkedList {

    Node head;

    public LinkedList(){
       this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next!= null){
            current = current.next;
        }
        
    }
}
