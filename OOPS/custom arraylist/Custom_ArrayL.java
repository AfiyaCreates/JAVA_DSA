// we already have an arraylist class ..but we can create a custom of our own
//array list works - we keep on adding things to it and a particular time it doubles the size when it gets full...and copies the items in the new one 
// we cannot directly chnage a private array we requrire getters and setters 
//generic - custom arraylist

//prob with custom arraylist 
// by default we are adding int values ...but its not true for arrl it can be of any type
// so we use generics like <Integer> <String>etc with ur custom arrl

import java.util.ArrayList;
import java.util.Arrays;
//everything is private just the constructor is public  and removed func , and get ,size func,set

public class Custom_ArrayL {

    private int[] data; // int arra list we have to create
    private static int default_size = 10;// default size of our arraylist
    private int size = 0; // also working as index value (since starts with 0)

    public Custom_ArrayL() { // constructor
        this.data = new int[default_size]; // initially sets the default size to list
    }

    public void add(int num) {
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
        int[] temp = new int[data.length * 2]; // this creates new temp arr with double the length of data arr
        // copy the current items to temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; // data will point tp temp now
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set (int index , int value){
        data[index]=value;
    }

@Override
public String toString(){
    return "list = " + Arrays.toString(data) + " size = " + size;
}




    public static void main(String[] args) {

        // ArrayList list = new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(1,6789);

        Custom_ArrayL list = new Custom_ArrayL();
        // list.add(3);
        // list.add(5);
        // list.add(9);

        for(int i =1;i<14;i++){
            list.add(i*2);   // this will double the size and print...default was 10 it will double to 20 
        }

        System.out.println(list);  //overrde tostring method to print this 


    }
}