//find middle of ll
// popular question
// method 1 - calc the length of ll and move the item half of the length and get the middle node 
//method 2 - (to do it on a single pass)
//if we take 2 var one is having  the speed  twice of other ...by the time faster one reaches the end ...the slower one reaches the middle 
//in case of even length ...return any of the middle no 

public class MiddleOfLL{
    
        class ListNode {
                int val;
                ListNode next;
                ListNode(int x) {
                        val = x;
                        next = null;
                }
        }

        public ListNode findMid(ListNode head){
            ListNode fast = head;
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            //out of loop when fast.ext=null...last node ....slow reaches mid node
            return slow;
        }
}