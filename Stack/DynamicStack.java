//its the stack with growing size ..wont throw exception ...stack wont be full

public class DynamicStack extends CustomStack {

    public DynamicStack() { // calls public CustomStack()
        super();
    }

    public DynamicStack(int size) { // calls public CustomStack(int size)
        super(size); // check the error
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // doublethe array size
            int[] temp = new int[data.length * 2];
            // copy all previous items in new arr
            for (int i = 0; i <data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;

        }
  data[++ptr] = item;
        return true;
    }

    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack(4);
        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.push(6);
        ds.push(7);

    }
}
