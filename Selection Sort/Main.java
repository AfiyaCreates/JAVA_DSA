//selects an element and put it at its correct index...eg selects largest element from unsorted arr and put at last position of unsorted part
//comparisons goes like - n-1..n-2.n-3...1..0
//total = 0+1+....n-1 = n(n-1)/2=o(n sq)-worst and best case same
//not stable sort
//performs well on small lists/arr

import java.util.Arrays;
public class Main {
    static void selection(int[]arr){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);// Get the index of the max element in the unsorted portion
            swap(arr,maxIndex,last);//swap the values at the maxindex place(the max value) and value at last of unsorted part

        }

    }
     // Function to get the index of the maximum element in a given range
    static int getMaxIndex(int[]arr,int start,int end){ //we r getting the index of max no and not the max no
        int max = start;
        for(int i=start; i<=end; i++){ // consider last element too <=end
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){  //simple swap func
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        }

     public static void main(String args[]){
            int[]arr = {3,1,5,4,2};
            selection(arr);
            System.out.println(Arrays.toString(arr));
            }
}
