//from all these prob we got to know thta concept of fastr and slow pointer and reverse of ll are very imp concepts 

//given a ll we have to reorder it in a particular form 
//eg - 12345....15243
//first element then last element thne second element then second last element 
// understand like we have 2 pointers one moving right from head and one moving left from tail...one by one and adding the element to new list 
//2 pointers can be start and end 

//but the prb is we cannot move backward ...we can only go forward like start ......
//so we can find the mid of list and reverse the second half ...like we did in palindrome prob 
//then move start and end pointrs ahead by one 

//we have to use a temp var to store the start bcoz if we dont it will point to current next in th lst we are making but to copare the start and end we want it to point to the previous next element before the list is sorted 
//see vid at 33.02
//so...temp = start ...start.next = end .....start = temp ....end.next = start...end = temp ...see the vid part example u will get it 
public class ReorderLL {

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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid); // instead of end we are using hs ...means head second....coz its the head of
                                        // secondhalf reversed lst
        ListNode hf = head;

        while (hs != null || hf != null) { // understand why this condition
            ListNode temp = hf;
            hf.next = hs;
            hf = temp;
            hs.next = hf;
            hs = temp;

        }
        // next of tail to null

        if (hf != null) {
            hf.next = null; // understand this
        }

    }

    // to find middle of ll
    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // to reverse ll
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev; // new head of reversed list
    }

    public static void main(String[] args) {

    }

}
