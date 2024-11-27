//functions/operations same as that of queue
// Comparator.reverseOrder() - will make it act as a max heap and the larger element will get more priority

// import java.util.Comparator;
import java.util.PriorityQueue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>( Comparator.reverseOrder());

        // can implement it using queue too - import java.util.Queue........Queue<Integer> pq = new PriorityQueue<>()
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq); // will add elements in queue priority wise like in ascending order....first element with higher priority

        System.out.println(pq.poll()); // removes 12 - element with highest priority
        System.out.println(pq);

        System.out.println(pq.peek());//returns first element - 24

    }
}
