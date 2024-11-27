//FIFO- first in first out
// front end - deletion  and rear end - addition 
// implemented - using array or linkedlist
import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue{
    public static void main (String[]args){

        Queue<Integer> queue = new LinkedList<>();
        // to add elements in a queue - offer() ... can use add()- but might throw an exception
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        // to remove and return element from queue - poll()....can use remove()- might throw an exception when queue is empty
        System.out.println(queue.poll()); // removes and returns 12
        System.out.println(queue);

        // tells which element is at starting to be removed next- peek()....returns null when queue is empty...can use element()-might throw an exception when queue is empty
        System.out.println(queue.peek()); // returns 24

    }
}
