//queue - fifo
//see all most commonly used methods
//.add()
//.peek()...just gets the first item but does not remove it 
//.remove()..removes the first item and prints it
//no class as Queue...only interface ...so to implement queue we use linkedlist class

// Queue<Integer> queue = new LinkedList<>();


//dequeue - insert and delete from both the sides 
 // Deque<Integer> deque = new ArrayDeque<>();


//uses - in bfs
import java.util.*
;class Main{
        public static void main(String[] args) {
        // Queue<Integer> queue = new Queue<>();...wrong 
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());

        System.out.println( queue.remove());
        System.out.println( queue.remove());
        System.out.println( queue.remove());
        System.out.println( queue.remove());     
        System.out.println( queue.remove());

        //dequeue

        Deque<Integer> deque = new ArrayDeque<>(); //it has a resizable array
        //it is faster than ll and stack
        //used in trees
        deque.add(1);
        deque.addLast(2);
        deque.removeFirst();
    }
} 