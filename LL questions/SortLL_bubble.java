//sort a ll using bubble sort
//take 2 pointer i and j ...flip
//after each iteration largest element comes at the end of the list
//case1 - when first is head...so during swapping 
//head = second
//first.next = second.next
//second.next = first

//case2- when second lies on tail...prev first second
//prev.next = second
//first.next = null 
//tail = first
//second.next = tail (coz tail is first now)

//case3 - first and second are in middle somewhere
//using get method get prev of first 
//prev.next = second
//first.next = second.next
//second.next=first

//here bubble sort code used - using rows abd cols(pattern recursion vid  notes) (done in recursion vid)(there we used n and i )
//see vid again in what terms he used
//write in notes with star remember this method 

//understand the row col concept 

public class SortLL_bubble {

    ListNode head;
    ListNode tail;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //to get the node(prev node)
     public ListNode get(int index) {

        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void bubbleSort(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            ListNode first = get(c); // use a get node method
            ListNode second = get(c + 1);
            if (first.val > second.val) {
                // swap
                // 3 cases
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;

                } else if (second == tail) {
                    // get a prev node
                    ListNode prev = get(c - 1); // col-1
                    prev.next = second;
                    first.next = null;
                    tail = first;
                    second.next = tail;
                } else {
                    ListNode prev = get(c - 1); // col-1
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;

                }

            }
            
                bubbleSort(r,c+1); //increment 
                
            }
            else{
                bubbleSort(r-1, 0); //next iteration

        }

    }

}
