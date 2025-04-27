//selection sort - selects the max or min element from unsorted par and places it at correct position
//we want the max_index and want to pass it to future calls ass well to check fo rthe max ...so we put it in arguments

import java.util.Arrays;

public class selection_sort {

    // static void sort(int[] arr, int n, int i, int max_i) {
    // if (n == 1) {
    // return;
    // }
    // if (i < n) { // for first pass
    // if (arr[i] > arr[max_i]) {
    // max_i = i; // update max index
    // }
    // sort(arr, n, i + 1, max_i); // continue searcxh for largest element..from i+1
    // } else { //put it in else condition bcoz swap should only happen at finish of
    // loop that is when it finds the max element..after finishing that pass
    // // once we get the max index swap it with last position element
    // swap(arr, max_i, n - 1);
    // sort(arr, n - 1, 0, 0); // reduce the array size to n-1
    // }
    // }

    // static void swap(int[] arr, int a, int b) {
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }

    // using row column concept

    // r - number of remaining elements to sort (reduces each pass)
    // c - current index in the row (iterates through elements in each pass)
    // max - index of the maximum element found in the current pass
    static void sort(int[] arr, int r, int c, int max) {
        // Base case: If only one element remains, sorting is complete
        if (r == 1) {
            return;
        }
        // Finding the maximum element in the current range (0 to r-1)
        if (c < r) {  
            if (arr[c] > arr[max]) {  
                // If current element is greater than max, update max index
                sort(arr, r, c + 1, c);  
            } else {  
                // Otherwise, continue searching with the same max index
                sort(arr, r, c + 1, max);
            }
        } 
        else {  
            // When the full pass is completed (c == r), swap max element with last element of the current range
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // Reduce the size of the array and repeat sorting for the remaining elements
            sort(arr, r - 1, 0, 0);
        }
    }

    

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 8, 1 };
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
};