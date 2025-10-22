//when new ll is created head = node
//if tail==null...make tail = head
//for notes write each method separately eg for insertion ,display creation etc to understand clearly

//to display the ll- why we use temp ?- coz head always ha sto be starting node and we cant change the structure of ll something like that
//so we take a var temp which points to same node (head is pointing)..since temp is not a part of structure of linked list it wont affect 
//see gfg notes 

//common doubts
//head is a part of the structure of linked list node = head ...we do not change head instead we are changing node ....eg- node = node.next

//insert using recursion- at a particular index
//eg - want to insert val at index 3 - (3,val)
//we start with head move forward while decreasing theindex value by one and whe its 0 we reaches the target node 
//so index-0 becomes base condition at this point we start insertion
//but we reached at node at index..to access the previous node for insertion process we have to go to ans of previous recursion call ..so fro that we use parameteer...
//(index,val,currnode) ..pass the current node we are at coz once we reach base condition and return from it we get the previous node

public class LL {

    private Node head; // head and tail of linke list mentioned here itself
    private Node tail;

    private int size; // of linkedlist

    public LL() { // so whenever new likedlist is created (when default constructor is called a
                  // new linkedlist with size 0 is created)
        this.size = 0;
    }

    // details of node
    private class Node { // for new node create a class
        private int value; // it stores value
        private Node next; // and a next node

        // constructors can use any constructor acc to need

        public Node(int value) {
            this.value = value; // to store the value of the node with no next node
        }

        public Node(int value, Node next) { // to store the value of node with its next node
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) { // to insert the first node(as head)
        Node node = new Node(val); // creates a node with value
        node.next = head;
        head = node;
        if (tail == null) { // means first item is added
            tail = head;
        }
        size++; // increase size of list by 1
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node; // adds node to the next pos of tail
        tail = node; // tail becomes node(last)
        size++;
    }

    // to insert val at particular index
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head; // use this to trace the ll to get correct posiion
        for (int i = 1; i < index; i++) {
            temp = temp.next; // temp keeps moving forward until we get to index-1
        }

        Node newNode = new Node(val, temp.next); // creates new node that points to temp.next(node that was at
                                                 // index..becomes next node of our new node)
        // make node at index-1 points to newnode
        temp.next = newNode; // temp node now points to new node (at index)
        size++;

    }

    // insert using recursion...see diagram in video 
    public void insertRec(int val ,int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) { // base condition
            Node temp = new Node(val, node); // curr node becomes the next node for newly created node temp
            size++;
            return temp; // returns newly added node

        }
       node.next = insertRec(val, index-1, node.next);//we have to return the next after the adddition of new node...store in next of our new node
       return node; //returns curr node
    
    }

    // deletion in singly linkedlist
    public int deleteFirst() {
        int val = head.value; // stores the val tht is to be deleted
        head = head.next;
        if (head == null) { // if head and tail was poinying to one single node in listr so when we del head
                            // node ..set tail also null ...since the ll is empty now
            tail = null;
        }
        size--; // reduce the size of ll
        return val; // return the val that is deletd
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        int val = tail.value;
        Node secondLast = getNode(size - 2); // gives the last second node
        tail = secondLast;
        tail.next = null; // why not this secondLast.next=null;
        return val;
    }

    // to del node at a particular index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next; // to skip the node at index
        return val;

    }

    // to get node at a particular index...can use in insertion at an index or
    // deletion purposes as well
    public Node getNode(int index) {

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
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

    // see to take temp or node
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next; // after printing the val it points to next node
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

    }

}
