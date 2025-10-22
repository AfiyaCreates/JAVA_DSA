//circular queue 
//front and end 2 pointers noth are at 0 initially 
//when elemnet is added end ++
//when end at last index it should not end++..index out of bound ...we want end back at 0 ...so we use 
//end%size...if 5 is size and end at 5 ...5%5=0
 // front = front%data.length;
//use a var size to maintain size of queue and prevent out of bounds
//when element is removed front++
//so its like dispaly the elements between front and end..thats are queue

//if front at index 2 and end at index 0...read fromt front to end like 
//from index 23450..after 5 back to 0 since end at 0


public class CircularQueue{
protected int[]data;
    private static final int default_size = 10;
   protected int front =0;
    protected int end = 0; //here we are starting at index  
private int size=0; // use size 
    public CircularQueue() {
        this(default_size); // if no size is passed...calls the constructor with default size
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

     protected boolean isFull() {
        return size == data.length; // will return true if arr is full...using size instead of end 
    }

    private boolean isEmpty() {
        return size== 0; // will return true if arr is fempty...using size
    }
//*** 
      public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end++;

        end = end %data.length; //imp 
        size++;// coz item is added

        return true;
    }
    //while removing no need of shifting
     public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty!");
        }
        int temp = data[front];  
        front++; 
        
        front = front%data.length;
        size--;//since element is removed

        return temp;

    }

     public void display(){  //imp
        if(isEmpty()){
            return;
        }

       int i = front;
       do{
        System.out.print(data[i] + " ");
        i++;
        i=i%data.length;  //add this too
       }while(i!=end); //its i not front
       System.out.println( );
    }


    public static void main(String[] args)throws Exception {
         CircularQueue q = new CircularQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);

        q.display();

        System.out.println(q.remove());

        q.display();
    }
}