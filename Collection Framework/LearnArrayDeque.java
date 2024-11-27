// can add or remove elements from both the ends 
// we can use stack implementation too 
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        //offer/offerLast() -adds element at last......offerFirst() - adds element at start
        ad.offer(23);
        ad.offerFirst(15);
        ad.offerLast(45);
        ad.offer(200);
        ad.offer(100);
        System.out.println(ad);

        System.out.println(ad.peek()); // 15
        System.out.println(ad.peekFirst()); //15
        System.out.println(ad.peekLast()); //100

        System.out.println(ad.poll()); // removes element from start
        System.out.println(ad);
        System.out.println(ad.pollFirst()); // removes element from start
        System.out.println(ad);
        System.out.println(ad.pollLast()); // removes element from end
        System.out.println(ad);


        
    }
}
