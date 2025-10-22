//reversing a part of ll
//name the nodes correctly 
//see vid understand carefully
//eg - 1 2 3 4 5......//let l = 2 r = 4
//1 4 3 2 5 
//we require the prev element of the sublist..last = l-1...which is 1 here 
//2 - new end ...coz after reversing it becomes the new end of our sublist
//take 2 pointers prev and current ...prev is null and current is last ...move them ahead one by one 

//after reversing prev reaches lat second node(4) and current becomes present (5)

//if last = null ...head = prev

// newend.next = prev....after recursion


//see some other video of this if not getting 
//the reversal of sublist is normal like how we did in normal reversal ...but choosing the points and nodes is tricky 



public class ReversePart{
    ListNode head;
    ListNode tail;
    int size;

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
         ListNode(int val, ListNode next ){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left , int right){ //left right not defined here coz its leetcode ques
        if(left == right){
            return head;
        }

        //skip the first left-1 node
        ListNode current = head;
        ListNode prev = null;
        for(int i=0; current!= null && i <left -1 ; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newend = current;

        //reverse between left and right
        ListNode nxt = current.next;
        for(int i =0; current!=null && i<right-left+1;i++){ //< right-left+1...gives the length of the sublist
            //copied the code from normal ll reversal just changed present to current 
             current.next = prev;
            //moving forward
            prev=current;
           current=nxt;
            if(nxt!=null){  //null pointer exception
            nxt = nxt.next;
            }

        }

        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }

        newend.next = current;
        return head; // for leetcode


    }
    
}
