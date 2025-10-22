//similar to how we created dynamic stack 

public class DynamicQueue  extends CircularQueue{
     public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }


    //understand this 
    @Override
    public  boolean insert(int item ){
           if (this.isFull()) {
            // doublethe array size
            int[] temp = new int[data.length * 2];
            // copy all previous items in new arr
            for (int i = 0; i <data.length; i++) {
                temp[i] = data[(front+i)%data.length];      //changed this ***
            }
            front =0;
            end = data.length;
            data = temp;

        }

        return super.insert(item);
    }
    
}
