//use 2 stacks to implement the queue
//use 2 arrays for 2 stacks (fifo operation can only be performed)
//first stcak and  second stack (its a helper)

//insertion is same in stack and queue ...so normal push....so indert in first stack 
//now if we use pop in first it will remove the top item but we want to remove the first ...so pop the top items and push it in second stack 
//once all the elements are pushe in second stack pop the top ...that was the first element in first stack
//then push the rest items back in first stack
//this method is not efficient coz to remove the first element we have to traverse through all the rest elemnets
//time complexity will be - o(n)
//so its known as insert  efficient queue...coz only insertion operation is efficient

//other method is remove efficient ..in this inserion is o(n)..and removal is o(1)..constant
//push elkemnts in first in reverse order ..eg - 4321...pop 1 ....so the firstelement of queue is removed ..but now 
//for insertion pop elements from first and push in second..if u want to add a new item push it in first and then pop the element from second and push then in first ...we got the final queue

//dont go deep in this just see the diagrams make them in notes and u will get it 

import java.util.Stack;

//insert efficient

public class ImplementQueueUsingStacks {
//     private Stack<Integer> first;
//     private Stack<Integer> second;

//     public ImplementQueueUsingStacks() {
//         first = new Stack<>();
//         first = new Stack<>();
//     }

//     public void add(int item) {
//         first.push(item);
//     }

//     public int remove() throws Exception{ // it returns the pop item .. so
//         while (first.isEmpty()) {
//             second.push(first.pop());// first me se pop krte jayenge and second me push item ko jo pop hua h
//         }

//         int removed = second.pop(); // second me jo top pr h pop it

//         //no push back the items in first
//         while(!second.isEmpty()){
//             first.push(second.pop());
//         }

//         return removed;
//     }

//     public boolean isEmpty(){
//         return first.isEmpty();
//     }

//     public int peek(){
//          while (first.isEmpty()) {
//             second.push(first.pop());// first me se pop krte jayenge and second me push item ko jo pop hua h
//         }

//         int peeked = second.peek(); // second me jo top pr h pop it

//         //no push back the items in first
//         while(!second.isEmpty()){
//             first.push(second.pop());
//         }
//         return peeked; 
// }


// remove efficient 
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStacks() {
        first = new Stack<>();
        first = new Stack<>();
    }

    public void add(int item) throws Exception {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove() throws Exception{ // it returns the pop item .. so
       return first.pop();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek(){
        return first.peek();
}


    public static void main(String[] args) {

    }

}
