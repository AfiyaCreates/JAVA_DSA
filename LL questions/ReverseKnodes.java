//reverse nodes in k groups 
//eg - 2 - 2 ke group me reverse kro 
//similar to reversing a part of list ....prob
//eg - 12345  k=2
//reverse 12 - 21.....34-43...5 (since 5<2which is k)it remains as it is ...
//list becomes = 12345 to 21435

// Modification : Check whether there are enough elements (atleast `k`) after each loop.

//we start with prev = null current = head next 
//run a for loop k times (to reverse k groups)...until current = null
//reverse how we do 

public class ReverseKnodes {

    ListNode head;
    ListNode tail;
    int size;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) { // base
            return head;
        }

        // copy pasted from reverse part ll ....made some chnages

        // skip the first left-1 node
        ListNode current = head;
        ListNode prev = null;

        int remaininglength = listLength(head);

        while (remaininglength >= k) {
            ListNode last = prev;
            ListNode newend = current;

            // reverse between left and right
            ListNode nxt = current.next;
            for (int i = 0; current != null && i < k; i++) { // while i<k
                // copied the code from normal ll reversal just changed present to current
                current.next = prev;
                // moving forward
                prev = current;
                current = nxt;
                if (nxt != null) { // null pointer exception
                    nxt = nxt.next;
                }

            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newend.next = current;
            prev = newend; // for next part thats is for connecting one reversed part to next part

            remaininglength = remaininglength - k;

        }

        return head; // for leetcode

    }

    // finding the length of the List
    public int listLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;
    }

    // method 2
    // create a dummy node ...to handle head reversal
    // Improvement Benefit
    // Uses getKthNode() per group No need to calculate full length repeatedly.

    // public ListNode reverseKGroup(ListNode head, int k) {
    // if (head == null || k <= 1) return head;

    // // Dummy node to simplify head reversal
    // ListNode dummy = new ListNode(0);
    // dummy.next = head;

    // ListNode groupPrev = dummy;

    // while (true) {
    // // Get the kth node from groupPrev
    // ListNode kth = getKthNode(groupPrev, k);
    // if (kth == null) break; // Not enough nodes to reverse

    // ListNode groupNext = kth.next;

    // // Reverse the group
    // ListNode prev = groupNext;
    // ListNode curr = groupPrev.next;

    // while (curr != groupNext) {
    // ListNode tmp = curr.next;
    // curr.next = prev;
    // prev = curr;
    // curr = tmp;
    // }

    // // Reconnect reversed group to the previous part
    // ListNode temp = groupPrev.next; // This becomes the end of the reversed group
    // groupPrev.next = kth;
    // groupPrev = temp;
    // }

    // return dummy.next;
    // }
    // // Utility to get the kth node from the current node
    // private ListNode getKthNode(ListNode start, int k) {
    // while (start != null && k > 0) {
    // start = start.next;
    // k--;
    // }
    // return start;
    // }

    public static void main(String[] args) {

    }

}
