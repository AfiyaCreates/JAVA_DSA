//when heaps are used 
//whenever we have to store items based on certain criteria 
//eg- storing 10 no criterion is ot get the smallest no 

//we can use array and perform linear search ...but what if we want the ans in shortest time possible 
//so we require ans in constant time without searching or anything

//idea is every time u insert an elemnt sort the array
// no the smallest no will be elemnt at 0 index ...so ans xan be found in constant time //but inserting an elemnt is taking nlogn time to insrt one item
//so to improve this insertion time ..we use heap ..using heap insertion will take logn time

//internally it will be stored as an array but represented as a tree ...heap tree

//heap tree- a complete bt
//types - max heap , min heap 
//each node >= children = max heap 
//each node<= children = min heap 
//tree might not be sorted ...but max item at root node ...in max heap
//elents stored in array bit represented as tree - every elemnt at index i has its parent at i/2
//no pointers required
//height of  bt = logn

//insertion in heap tree 
//we insert elemnt in left to right order but at each insertion chcek for min or max condition 
//eg - to construct min heap 
//root -8 ...insert 7 we insert it at left of 8 ...but for min heap condition 
//so we swap 8 and 7 

//removing items from a heap ..o(log n)..time 
//swap root node and last node...delete the last node 
//check the heap condition 

//left of anode = 2*i +1
//right of node = 2*i + 2

//implementation ...used comparable

import java.lang.reflect.Array;
import java.util.ArrayList;

class Heap <T extends Comparable<T>>{

    private ArrayList<T> list;

    public Heap(){
      list = new ArrayList<>();
    }

    //swap method 
    private void swap(int a , int b){
        T temp = list.get(a);  //temp is of T type 
        // list.get(a)=list.get(b); //wrong ...this is not how we swap in arraylist 
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    //to get the parent for a node 
    private int parent(int index){
        return (index-1)/2; //it returns int not decimal .
        //..taking i-1 coz = for i=1..parent will be 1-1/2=0..0 will  be the root node
    }
    //to get left 
    private int left(int index){
        return (2*index)+1;
    }
    //to get right 
    private int right(int index){
        return (2*index)+2;
    }

    //inserting ..then check if its correct if not swap 
    public void insert(T value){ //why t
        list.add(value);
        upheap(list.size()-1); //from that node to above check then sort 
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index); //return the index of parent 
        if(list.get(index).compareTo(list.get(p))<0){ // for min heap ..if curr node is smaller than the parent swap them
            swap(index,p); //swaps the elements at this index
            //now for parent node ...in this keeps checking upwards
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removig from an empty heap");
        }
        T removed = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return removed;
    }
    //downheAP
    private void downheap(int index){
       int min = index;
       int left = left(index);
       int right = right(index);

       //finding min from left right and curr
       if(left< list.size() &&  list.get(min).compareTo(list.get(left))>0){
        min = left;
       }
       if(right< list.size() &&  list.get(min).compareTo(list.get(right))>0){
        min = right;
       }
       //swapping with min so that min comes up 
       if(index!=min){
        swap(index,min);
        downheap(min);
       }


    }

    //heap sort...understand this 
     public ArrayList<T>heapSort()throws Exception{
    ArrayList<T> data = new ArrayList<>();
    while(!list.isEmpty()){
        data.add(this.remove()); //keep removing elemnts from list one by one add it to list ...we get sorted list
    }
    return data;
}




    public static void main(String[] args)  throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        System.out.println(heap.remove()); //returns min item...since min heap

        ArrayList list = heap.heapSort(); //whats this way of writing 
        System.out.println(list);

    }
}
