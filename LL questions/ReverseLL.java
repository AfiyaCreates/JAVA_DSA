//reversing a ll using recursion ***

//reversing means making head tail and tail hed and reversing the directions of arrow
//start from head keep moving forward till u reache tail..once u reach tail make it head 
//now to reverse the ll move right to left using tail 
//at each step once u come out of recursion call ...make 
//tail.next = node(just prev node)
//tail = node
//tail.next = null
//see diagram in vid and understand 
// so we see when we are coming outr of the recursion call thats when we are reversing the 

//reversing a ll using iteration ***
//no tail if only head is provided
//use 2 pointr ...while moving forward keep on reversing the ll 
//see diagram its easy will get it 
//prev present next 
//present.next = prev
//present and prev and next  move ahead.....so prev = present ...present = next ...next = next.next(this can lead to null pointer exception)
//again present.next = prev
// remeber we are reversing so here next imagine we are moving left  

//in the end present becomes null....so lopp till while(present!=null)..prev becomes the last node
//so make prev as head...coz last element on right will be head after reversing



public class ReverseLL {

    Node head;
    Node tail;
    int size;

    public ReverseLL(){
        this.size=0;
    }

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
         Node(int val, Node next ){
            this.val = val;
            this.next = next;
        }
    }

    //reversing ll using recursion
    private void reverse(Node node){
        if(node==tail){ //base condition
            head=tail;
            return; //while it returns thats when the reversing takes place
        }
        reverse(node.next); //this recursive call kep calling next node till it reaches the last node(tail)..then base condition is reached
        tail.next = node;
        tail = node;
        tail.next = null;
        
    }

    //reversing ll using iteration
    private void reverse2(Node node){
        if(size<2){
            return;
        }
        //for leet code
        // if(head==null){
        //     return head;
        // }
        
        Node prev = null;
        Node pres = head;
        Node nxt = pres.next;
        while(pres!=null){
            pres.next = prev;
            //moving forward
            prev=pres;
            pres=nxt;
            if(nxt!=null){  //null pointer exception
            nxt = nxt.next;
            }

        }
        head = prev;
        //for leet code return head which is prev 
        //return prev

    }
    
}


