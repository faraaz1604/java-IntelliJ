package LL_DSA;

public class Main {

    public static void main(String[] args) {
        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();  // Make list empty
        System.out.println("Expected: null");
        System.out.println("Actual: " + (myLinkedList.findMiddleNode() == null ? "null" : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 2: List with 1 element
        System.out.println("Test 2: List with 1 Element");
        myLinkedList = new LinkedList(1);
        System.out.println("1");
        System.out.println("Expected Middle Node: 1");
        System.out.println("Actual Middle Node: " + (myLinkedList.findMiddleNode() == null ? "null" : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 3: List with odd number of elements
        System.out.println("Test 3: List with Odd Number of Elements");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected Middle Node: 3");
        System.out.println("Actual Middle Node: " + (myLinkedList.findMiddleNode() == null ? "null" : myLinkedList.findMiddleNode().value));
        System.out.println();

        // Test 4: List with even number of elements
        System.out.println("Test 4: List with Even Number of Elements");
        myLinkedList.append(6);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println("Expected Middle Node: 4");
        System.out.println("Actual Middle Node: " + (myLinkedList.findMiddleNode() == null ? "null" : myLinkedList.findMiddleNode().value));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            Expected: null
            Actual: null

            Test 2: List with 1 Element
            1
            Expected Middle Node: 1
            Actual Middle Node: 1

            Test 3: List with Odd Number of Elements
            1 -> 2 -> 3 -> 4 -> 5
            Expected Middle Node: 3
            Actual Middle Node: 3

            Test 4: List with Even Number of Elements
            1 -> 2 -> 3 -> 4 -> 5 -> 6
            Expected Middle Node: 4
            Actual Middle Node: 4
        */
    }

}
