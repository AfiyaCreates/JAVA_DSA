// type of data in array should be same
// array obj are in heap and  obj in heap are not continuous
// dynamic memory alocation
// hence arrays in java may not be continuous- depends on jvm
// new is used to create an obj
// by default empty int arr stores 0 and empty string arr stores null
// each element of arr is a ref var and will be pointing to objects stored in separate memories

public class Main {

    public static void main(String[] args){
//        datatype[] name = new datatype[size];
        int[] rno1 = new int[5];  // the left part is executed at compile time while right part at run time(dynamic memory allocation)
        //        or directly
        int[] rno2 = {1,2,3,4,5};
        int[] ros;  // declaration of array. ros is getting defined in stack
        ros = new int[5]; // initialisation. here object is being created in heap memory

    }
}
