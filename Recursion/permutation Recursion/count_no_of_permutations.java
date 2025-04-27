// count = count + count(str.substring(1), first + ch + last);
//The function keeps calling itself until str becomes empty (base case).....it calls the base condition which return 1 whenever a permutation is found 
// Every base case returns 1, meaning a valid permutation is found.
// These 1s add up, giving the total number of permutations.

import java.util.*;

public class count_no_of_permutations {

    // Function to count the number of permutations possible for a given string
    static int count(String str, String ans) {
        // Base case: If the unprocessed string is empty, we have found one valid permutation
        if (str.isEmpty()) {
            return 1; // Return 1 as a valid permutation is found
        }
        
        int count = 0; // Variable to store the total count of permutations
        char ch = str.charAt(0); // Take the first character of the string
        int n = ans.length(); // Get the current length of the answer string
        
        // Loop through each possible position to insert the character
        for (int i = 0; i <= n; i++) {
            String first = ans.substring(0, i); // Substring before insertion point
            String last = ans.substring(i, n); // Substring after insertion point
            
            // Recursively call the function with the remaining characters of str
            // and update the count by adding the result of the recursive call
            count = count + count(str.substring(1), first + ch + last);
        }
        
        return count; // Return the total count of permutations
    }

    public static void main(String[] args) {
        String str = "abc"; // Example input string
        System.out.println("Total number of permutations: " + count(str, "")); // Print total number of permutations
    }
}



