//do sir method also and understand this too
// other method apply simple sort then search the sorted list and the no with wrong index are the duplicate values
//eg= 0 1 2 3 4 5 6 7
//    1 2 3 4 3 2 7 8 ......3 and 2 are repeated 

// import java.util.ArrayList;

// public class findAllDuplicateNumber {

//     static ArrayList<Integer> findDuplicate(int[] arr) {
//         int i = 0;
//          ArrayList<Integer> ans = new ArrayList<>();  // use array list
//         while (i < arr.length) {
//             // Check if the element is at its correct position (i.e., value should be index + 1)
//             if (arr[i] != i + 1) {
//                 int correctIndex = arr[i] - 1; // Find the correct index for arr[i]

//                 // If the value at the correct position is not the same, swap them
//                 if (arr[i] != arr[correctIndex]) {
//                     swap(arr, i, correctIndex);
//                 } else {
//                      // If the value at the correct index is the same, we found a duplicate
//                      if (!ans.contains(arr[i])) { // Avoid adding duplicate values multiple times
//                         ans.add(arr[i]);
//                     }
//                  i++;  //move next ..to add next value
//                 }          
//             } else {
//                 // Move to the next index if the value is already at the correct position
//                 i++;
//             }
//         }
//         return ans; // Return -1 if no duplicate is found 
//     }

//     // Function to swap two elements in the array
//     static void swap(int[] arr, int a, int b) {
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 3, 2, 7, 8, 2, 3, 1}; 

//         System.out.println("Duplicate numbers: " +   findDuplicate(arr)); // Print duplicate numbers

//     }
// }

import java.util.ArrayList;


public class findAllDuplicateNumber {
    static ArrayList<Integer> findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correcti = arr[i] - 1;
            if (arr[i] != arr[correcti]) {
                swap(arr, i, correcti);
            } else {
                i++;
            }
        }
        // to search duplicates-(elements with wrong index)
        ArrayList<Integer> ans = new ArrayList<>(); // use array list
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) { 
                ans.add(arr[j]);  //here we return value at j***
            }

        }
        return ans;
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> duplicates = findDuplicate(arr);
        System.out.println(duplicates); // Print all duplicate numbers

    }
}
