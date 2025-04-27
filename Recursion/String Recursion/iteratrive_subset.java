
// iterative approach
// Outer List: This is a list of lists that will store all the subsets generated. It starts with a single empty subset.
// Inner List: For each number in the array, new subsets are created from the existing ones in the outer list.
// If the input is {1, 2, 3}, the process builds subsets like this:
// Start with {} (the empty subset).
// Add 1 → {}, {1}
// Add 2 → {}, {1}, {2}, {1, 2}
// Add 3 → {}, {1}, {2}, {1, 2}, {3}, {1, 3}, {2, 3}, {1, 2, 3}
// we are either accepting a char or rejecting it ....start with empty ans str 
//eg string - 123...start with 1  reject it()...accept(1)
//2  reject  () (1)...accept  (2)(1,2)
// 3 reject ()(1)(1,2)(2)..accept (3)(1,3)(1,2,3)(2,3)
//initially the outer list will have an empty array list 

//time complexity - it will be total levels * time taken by each level
//O(n * 2^n)...2^n is total subsets
//space complexity - no of subsets ..and time taken by each 
//o(2^n * n )

// create a copy of previous outer list  subsets  and add the no(of arr) in its substes ..then add this list(inner) to outer list 

import java.util.*;

public class iteratrive_subset {
    // Function to generate all subsets of a given integer array
    static List<List<Integer>> set(int[] arr) {
        // List to hold all subsets (the outer list)
        List<List<Integer>> outer = new ArrayList<>();
        // Start with an empty subset
        outer.add(new ArrayList<>());

        // Loop through each number in the input array
        for (int num : arr) {
            // Get the current size of the outer list...initially 1  since above we added a list
            int n = outer.size();
            // For each existing subset in the outer list
            for (int i = 0; i < n; i++) {
                // Create a new inner list by copying the i-th subset
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                // Add the current number to the new inner list
                inner.add(num);
                // Add the new inner list (which now includes the current number) to the outer
                // list
                outer.add(inner);
            }
        }

        // Return the list of all subsets
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // Example input array
        List<List<Integer>> subsets = set(arr); // Calling the set function to get subsets

        // Printing subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

}