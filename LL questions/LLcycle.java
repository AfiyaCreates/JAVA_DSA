//most imp topic
//ll contains a cycle like - 3-2-0-4-2...4 moves back and connect to 2
//check if ll contains a cycle or not
//this prob ight come in arrays too so understand the concept first
//fast and slow pointer methods
//1 - cycle detection
//2 - finding a node in cycle etc
// we have 2 pointers fast f ad slow s 
//starting with head ....s moves ahead one by one and f moves ahead 2 by 2
//they meet at a node...means cycle is present ...if cycle was not present the f would have pointed to null
//so if any one of f or s points to null means cycle not present
//time complexity - O(n)
//possibilities
//fs = afer next move...(fs)meet...meet in 1 step
//f_s = fs = (fs)meet ....so they met in 2 steps

public class LLcycle {

        class ListNode {
                int val;
                ListNode next;

                ListNode(int x) {
                        val = x;
                        next = null;
                }
        }

        // code for leet code...detect cycle present or not
        public boolean detectCycle(ListNode head) {
                ListNode fast = head;
                ListNode slow = head;
                while (fast != null && fast.next != null) {
                        fast = fast.next.next;
                        slow = slow.next;
                        if (fast == slow) {
                                return true;
                        }
                }
                return false;
        }

        // to find length of the cycle ...once cycle found freeze f and keep moving s
        // and count till s=f
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

}




