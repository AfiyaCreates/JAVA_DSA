//sort ll using merge sort
//check the code for get middle node .....and merge code

import org.w3c.dom.Node;

public class SortLL_Mergesort{
    Node head;
    Node tail;
    int size;

    public SortLL_Mergesort() {
        this.size = 0;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // we need one method to find mid (already done)(but here we used different mid
    // method coz we have to break the ll at mid)
     // Method to find the middle node and split the list
    public ListNode findMid(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null; // break the list into two halves
        }
        return slow;
    }

    // we need one method to merge 2 sorted ll(already done)(a bit changed )
    // This method merges two sorted linked lists (l1 and l2) into one new sorted
    // linked list and returns the head of the merged list.
    // A dummy node is created as a placeholder to start building the new merged list.
    // tail is used to keep track of the last node in the merged list as we build it.
    public ListNode merge(ListNode list1, ListNode list2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // While both lists have nodes remaining...
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1; // append the smaller node
                list1 = list1.next; // advance in list1
            } else {
                tail.next = list2; // append the smaller (or equal) node
                list2 = list2.next; // advance in list2
            }
            tail = tail.next; // move the tail forward
        }

        // Attach any remaining nodes (one of these will be null)
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }

        // The merged list starts at dummy.next
        return dummy.next;
    }


    // soln*********************** to sort the ll
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = sortList(head);// recursive call to sort the left list (staring from head)
        ListNode right = sortList(mid);// recursive call to sort the right list (starting from mid)
        return merge(left, right); // merge the sorted lists
    }

}
