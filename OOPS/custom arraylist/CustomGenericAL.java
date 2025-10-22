//public class CustomGenericAL<T>   ...add<T> ...for template class(generic)
// same code ...but in place of type use T
// but it might give error coz we cannot simply instantiate of generuc type ..it will give error..so we use this with the help of object class 
//use T to specify type object

import java.util.Arrays;

public class CustomGenericAL<T> {

    private Object[] data; // int arra list we have to create
    private static int default_size = 10;// default size of our arraylist
    private int size = 0; // also working as index value (since starts with 0)

    public CustomGenericAL() { // constructor
        this.data = new Object[default_size]; // initially sets the default size to list
    }

    public void add(T num) {
        if (isFull()) { // if its full
            resize();
        }
        data[size++] = num; // increases the size of list by 1 (since its 0 initially ...we are increasing
                            // the index by 1)and add the no
    }

    private boolean isFull() {
        return size == data.length; // returns true if size becomes equal to length of array ...means its full
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; // this creates new temp arr with double the length of data arr
        // copy the current items to temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; // data will point tp temp now
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {

        return "list = " + Arrays.toString(data) + " size = " + size;
    }

    public static void main(String[] args) {

        CustomGenericAL<Integer> list = new CustomGenericAL<>();
         for(int i =1;i<14;i++){
            list.add(i*2);   // this will double the size and print...default was 10 it will double to 20 
        }

        System.out.println(list);  //overrde tostring method to print this 



    }
}
