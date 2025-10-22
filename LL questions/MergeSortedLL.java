//similar to merging two sorted arrays ...use pointer

public class MergeSortedLL {
     Node head;
    Node tail;
    int size;

    public MergeSortedLL() {
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

    //soln***
    //for ll use class as type 
    public static MergeSortedLL merge(MergeSortedLL first, MergeSortedLL second){
        Node f = first.head;
        Node s = second.head;
        MergeSortedLL ans = new MergeSortedLL();
        while(f!=null & s!=null){
            if(f.val<s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else{
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.val);
            s=s.next;
        }

        return ans;

    }


    public static void main(String[] args) {
        MergeSortedLL first = new MergeSortedLL();
        MergeSortedLL second = new MergeSortedLL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(9);
        second.display();

        MergeSortedLL ans = merge(first,second);
        ans.display();
        
    }
}
