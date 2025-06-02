package LL_DSA;

public class LinkedList {

    private Node head;
    private Node tail;

    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // WRITE FIND MIDDLE NODE METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////

    public Node findMiddleNode(){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop() {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;

    }

    public Node findKthFromEnd(int k){

        Node fast = head;
        Node slow = head;

        for(int i = 0 ; i < k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;

        }

        while (fast!= null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    public void removeDuplicates(){
        Node current = head;
        while(current != null){
            Node runner = current;
            while (runner != null && runner.next != null){
                if (runner.next.value == current.value){
                    runner.next = runner.next.next;
                    length--;
                }
                runner = runner.next;

            }
        }
        current = current.next;
    }


}


