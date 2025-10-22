//implement stack using 2 queues
//if stack has elements like 123....stored in queue like 321

//q2-[1]..q1-[]....swap ...q1-[1]..q2-[]
//q2-[2]..q1-[1]..remove from q1 and add to q2...q2-[2,1]..q1-[]...swap q1 nd q2....q1-[2,1]..q2-[]
//q2-[3]......
// in this way its order is reversed
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x); // Push to q2 first...inserting at the end of q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove()); // Move all from q1 to q2...this reverses the order
        }

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove(); // Top element is always at front of q1
    }

    public int top() {
        return q1.peek(); // Peek the front
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
