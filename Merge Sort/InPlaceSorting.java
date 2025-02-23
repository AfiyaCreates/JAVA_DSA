//use oiginal arr and modify that only ...without creating new arr
//same code just instea of using range use index to manipulate the range 
import java.util.Arrays;

public class InPlaceSorting {
    
    // Merge Sort function (recursive)
    static void mergeSort(int[] arr, int s, int e) { 
        if (e - s == 1) { // Base case: If only one element remains, return.....or if s>=e....is start index becomes greater than end index 
            return;    
        }

        int mid = (s + e) / 2;  // Find the middle index...or write as s + (e-s)/2

        // Recursively sort both halves
        mergeSort(arr, s, mid);  // Left half: from index 's' to 'mid-1'
        mergeSort(arr, mid, e);  // Right half: from index 'mid' to 'e-1'

        // Merge both sorted halves
        merge(arr, s, mid, e);
    }

    // Merge function to merge two sorted subarrays
    static void merge(int[] arr, int s, int m, int e) {  
        int[] ans = new int[e - s];  // Temporary array to store merged elements...+1 to get proper length 
        int i = s;  // Pointer for the left half
        int j = m;  // Pointer for the right half
        int k = 0;  // Pointer for the temporary array

        // Merge both halves by comparing elements
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i]; 
                i++; 
            } else {
                ans[k] = arr[j]; 
                j++; 
            }
            k++; 
        }

        // Copy remaining elements of the left half (if any)
        while (i < m) {
            ans[k] = arr[i]; 
            i++; 
            k++; 
        }

        // Copy remaining elements of the right half (if any)
        while (j < e) {
            ans[k] = arr[j]; 
            j++; 
            k++; 
        }

        // Copy sorted elements back into the original array
        for (int x = 0; x < ans.length; x++) {
            arr[s + x] = ans[x];
        }
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};  // Unsorted array
        mergeSort(arr, 0, arr.length);  // Call merge sort on the entire array
        System.out.println(Arrays.toString(arr));  // Print sorted array
    }
}
