//for making custom queue we can use 2 pointers one for front and one for last
//but for interview purpose we must know how to do it with single pointer
//removing an item means ..removing first element...means shifting rest to left by 1 like item at index1 comes at index0
//so adding - o(1)....removing - o(n)...can solve this problem using circular queue
//see video to see diagramatic representation

public class CustomQueue {

    private int[] data;
    private static final int default_size = 10;
    int end = 0; // here we are starting at index

    public CustomQueue() {
        this(default_size); // if no size is passed...calls the constructor with default size
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return end == data.length; // will return true if arr is full
    }

    private boolean isEmpty() {
        return end == 0; // will return true if arr is fempty
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty!");
        }
        int temp = data[0];
        // shift elements left
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        end--;// since one item is removed
        return temp;

    }

    // to display the first item
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty!");
        }
        return data[0];
    }

    // to dispaly queue
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);

        q.display();
        System.out.println(q.remove());
        q.display();

    }
}
