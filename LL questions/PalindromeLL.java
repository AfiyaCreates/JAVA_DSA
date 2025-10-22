//to return if ll is palindrome or not 
//eg = 1221 is a palindrome ll while 12 is not 
//use the reverse of ll concept

//first find the mid eg - 12321...3 is mide
//reverse the part of ll from mid to end ....12123
//head at 1 and mid at next 1 now star comparing head and mid ...while keep moving forward 
//when u reach the end ...true

//if itrs even no of elements then instead of looking for mid reverse the next half of the ll 
//eg = 123321...reverse 321......now it becomes 123123...now compare mid and head while moving forward

//if before reaching th end of ll the head != mid ...return false

//after we are done checking re reverse the second half 



public class PalindromeLL {
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

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head); // this func returns the mid of ll
        ListNode secondHalf = reverseList(mid); // reverses the list from mid node to end
        ListNode reReverse = secondHalf; // storing in another temp var ..coz e want to re reverse it after checking

        // compare head and secondhalf head ...by moving froward
        while (head != null && secondHalf != null) {
            if (head.val != secondHalf.val) { // remember always we are comparing value not just node ...so wrote .val
                break;
            } // we are not returning true or false directly coz after chceking we have ti re
              // reverse the list as well
            head = head.next;
            secondHalf = secondHalf.next;
        }

        reverseList(reReverse);// re reverse the reversed list at the end of func

        // if(head == null || secondHalf == null){
        // return true; //that is when we reaches the lsit end without break means chcek
        // done
        // }
        // return false ;

        // we can simplify this as
        return head == null || secondHalf == null;

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
         // Create sample list: 1 -> 2 -> 2 -> 1 
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);
        System.out.println("Is palindrome? " + result);

    }
}
