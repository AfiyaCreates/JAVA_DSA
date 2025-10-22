public class CustomStack {

    protected int[] data;
    private static final int default_size = 10;// this is the default size f array(stack)
    int ptr = -1;

    public CustomStack() {
        this(default_size); // if no size is passed...calls the constructor with default size
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    // create a pointer that will point to last element in the stack or array

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;// insert the item at pointer
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("stack is empty!");
        }
        int temp = data[ptr];
        ptr--;
        return temp;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("stack is empty!");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length-1; // will return true if arr is full
    }

    private boolean isEmpty() {
        return ptr == -1; // will return true if arr is fempty
    }

    public static void main(String[] args) throws StackException { //use throws StackException with main method also
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
