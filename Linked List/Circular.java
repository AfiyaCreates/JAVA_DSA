//circular linked list - last node points to first node 
//circular-singulr ll
//circular-double ll
//

public class Circular {

    private Node head;
    private Node tail;

    // can create constructor for this class
    public Circular() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value; // to store the value of the node with no next node
        }

        public Node(int value, Node next) { // to store the value of node with its next node
            this.value = value;
            this.next = next;
        }

    }

    // insert node after tail before head (circular ll)
    public void insertAftertail(int val) {
        Node node = new Node(val);
        // if head or tail = null no item in list
        // so node is first node
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head; // tail.next is head ..so node.next=tail.next...node.next = head
        tail.next = node;
        tail = node;
    }

    // to display ccl
    public void display() {
        // start from head print till we reach head again
        Node node = head;
        if (head != null) { // if head is present then only
            do {
                System.out.print(node.value + "->");
                node = node.next;// toincrement to next node
            } while (node != head); // it will run atleast once ...which we want it to run once only so we use do
                                    // while
        }

    }

    // deletion
    // to delet a particular value
    // start from head ...check for null head ...treach node with particular val and
    // del it
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.value == val) {
            // if head is the node with that value
            head = head.next;
            tail.next = head;
            return;
        }
        //otherwise chcek for next items
        do{
            Node n = node.next; //store next val of node as n
            if(n.value==val){
                node.next = n.next ;  //we have to del n 
                break; //since do while loop
            }
            node = node.next;//otherwise keep moving forward
        }while(node!=head); //we dtart from head reach head 

    }

}
