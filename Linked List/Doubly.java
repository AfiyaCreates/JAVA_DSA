//doubly linkedlist
//each node points to next node as well as previous node 
//for head previous is null and for tail next is null
//see ss
//draw ll what u want to do  and understand to code its easy see ss
//do all methods of insertion and deletion for doubly linked list as well like how we did in singly linked list 

//if tail is not given we have to check for every node ...when we get a node whose next is null ...we treat it as a last node
//but we start chcking from head ...so first check if head is present or not 

public class Doubly {
    private Node head; // head and tail of linke list mentioned here itself
    private Node tail;

    private int size; // of linkedlist

    public Doubly() { // so whenever new likedlist is created (when default constructor is called a
        // new linkedlist with size 0 is created)
        this.size = 0;
    }

    // details of node
    private class Node { // for new node create a class
        private int value; // it stores value
        private Node next; // and a next node
        private Node prev;// stores prev node

        // constructors can use any constructor acc to need

        public Node(int value) {
            this.value = value; // to store the value of the node with no next node
        }

        public Node(int value, Node next, Node prev) { // to store the value of node with its next node
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertFirst(int val) { // to insert the first node(as head)
        Node node = new Node(val); // creates a node with value
        node.next = head;
        node.prev = null;
        // check for null pointer ...if head exists or not
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++; // increase size of list by 1

        // check if we write this or not
        // if (tail == null) { // means first item is added
        // tail = head;
        // }
    }

    // insert last
    public void insertLast(int val) {
        // consider if tail was not given
        Node node = new Node(val);
        // find the last node ..start with head
        Node last = head;
        if (head == null) {
            node.prev = null; // if no head
            head = node;
            return;
        }
        while (last.next != null) { // finds te last node
            last = last.next;
        }
        // here last is kind of null
        last.next = node;
        node.prev = last;
        node.next = null;

    }

    // to find the node with a value
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next; // to move to next node
        }
        return null;

    }

    // to insert a node somewhere in middle ...after a value...first find that prev
    // node from where we want to add next node ..so we use find method
    // also check for null pointer
    public void insertAfter(int after, int val) {
        Node p = find(after); // find node with after value..store in p node
        if (p == null) {
            System.out.println("p does not exist");
            return;
        }
        Node node = new Node(val); // new node we want to insert
        node.next = p.next;
        p.next = node;
        node.prev = p;
        // check for null pointer
        // node.next might be null so check
        if (node.next != null) {
            node.next.prev = node; // p.next nhi ...coz p ka connection tut gya now it connected to node
                                   // so..node.next..
        }

    }

    // to display in reverse as well***
    // check if using tail instead of a random last node is ok or not
    public void display() {
        Node temp = head;
        // Node tail = null; //why not use tail

        while (temp != null) {
            System.out.print(temp.value + "->");
            tail = temp;
            temp = temp.next; // after printing the val it points to next node
        }
        System.out.println("END");

        System.out.println("print in reverse");

        while (tail != null) {
            System.out.print(tail.value + "->");
            tail = tail.prev; // after printing the val it points to next node
        }
        System.out.println("start");
    }

}