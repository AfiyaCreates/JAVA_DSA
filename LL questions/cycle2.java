//linked list cycle 2
//cycle problem ...return the point at which the cycle started
//eg - 1-2-3-4-5-6-7-8-4...8 points back to 4 in a cycle ...so 4 is the starting point in cycle
//inorder to return that nide...we WANT to have f and s both present on it 
//so for that both f and s shoyld be aequal k distanbce from theat starting node..see diagram (shyd)
//steps-
//find length of cycle
//f at head ...move s ahead by lengthof cycle times
//move f and s ahead one by one (at same speed one step at a time)until will meet at start point - 4 here

public class cycle2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // method to return length of cycle
    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calc the length
                int length = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next; // we have to run it atleast once so use do while ....see if
                                      // other method is used
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // soln************
    // mwthod to return the start node of cycle
    public ListNode getstart(ListNode head) {
        int length = 0;
        // findcycle
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) { // when u detect a cycle
                length = LengthCycle(slow);// store the cyclelength in length
                break;
            }
        }

        if(length==0){
            return null;//no cycle present
        }
        // find the start node
        // fast was at head...move slow to cycle length
        // then move both together
        //again start f and s from head
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next; // till length>0 move slow one by one ....till it reaches the length of cycle
            length--;
        }
        // keep f and s move forward until they meet at cycle start...both move one step at a time at same speed
        while (f!=s) {
            f = f.next; //not fast.next.next
            s = s.next;
        }
        return s;// can return any f or s both points to same node now
    }
}
