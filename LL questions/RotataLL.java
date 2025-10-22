// 123456
//rotate it to ....561234

//find last node
//connect it with head
//if k =2 ...skip length-k elements and the last element we get mark it as last node .....here 4 
//coz 4 becomes the new last node
//head becomes last.next (new last node ka next ....here 5)
//last node.next  = null(new last node becomes null)

// no of rotations are k%l ....coz if k = l ...no change or k = 2l still no change (eg k=16..length = 6 ....rotating once 6 elements then again 6 means lit remains same ....12%6=0..so 0 rotations)

public class RotataLL {
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

    public ListNode rotateRight(ListNode head, int k) {

        if(k<=0||head==null||head.next==null){
            return head;
        }
//to get the last node and length of list
        ListNode last = head;
        int length =1;
        while(last.next!=null){
            last = last.next ;
            length++;
        }

           last.next = head;
           int rotations =k%length;
           int skip = length-rotations;
           ListNode newLast = head;//iniially 

           for(int i = 0;i<skip-1;i++){ //why -1...coz we are starting i from 0 
           newLast=  newLast.next;
           }
           head = newLast.next; //eg 4 ka next was 5 this is our new head
           newLast.next = null;

        
       
        return head;
    }

   

    public static void main(String[] args) {

    }
}
