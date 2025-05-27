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

    public Node removeLast(){
        if ( length == 0)return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp =temp.next;
        }
        tail = pre;
        tail.next = null;
        length --;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }

    public void prepend(int value){
        Node newNode  = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
            length++;

        }
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index == 0)return null;
        int count = 1;
        while (count != index){
           temp = temp.next;
            count++;
        }
       return temp;

    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        Node newNode = new Node(value);
        Node temp = head;
        Node pre = head;
        for (int i =0 ; i<index; i++){
            pre = temp;
            temp = temp.next;
        }
        pre.next = newNode;
        newNode.next = temp;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length)return null;
        if(index == 0)return removeFirst();
        if(index == length-1)return removeLast();

        Node temp;
        Node prev = get(index-1);
        temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after  = temp.next;
        Node before  = null;

        for (int i = 0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
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
