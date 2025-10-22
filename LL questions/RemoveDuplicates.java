//delete duplicates from ll ...and sort ll ....given
//1 1 2 3 3 3 - 1 2 3 
//first draw whta u want to achieve then think of soln 
//start from head...take a temp node - check if next node val is eual to temp node val ..if yes then skip it if no then temp.next points to that next node...and this node becomes temp 
//if using leetcode return the head 
public class RemoveDuplicates {
    Node head;
    Node tail;
    int size;

    public RemoveDuplicates() {
        this.size = 0;
    }

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
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
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next; // after printing the val it points to next node
        }
        System.out.println("END");
    }

    // soln***
    public void duplicate() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) { // duplicate found skip it ...and node.next should not be null
                node.next = node.next.next;// skipping that duplicate node
                size--;// size of ll decreases
            } else {
                node = node.next; // otherwise simply move forward
            }

        }
        tail = node; // at the end when we reach last node
        tail.next = null;
    }

    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicate();
        list.display();

    }

}