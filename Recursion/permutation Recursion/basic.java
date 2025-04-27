//eg - str = abc = {abc,bac,cab,bca,acb.....}
//use subset method taking one ignoring one ..actually we are not ignoring element but deciding its possible positions 
// we are maintaining 2 str ..processed (ans)..and unprocessed(str given)
//when the unprocessed str becomes empty we found the ans ...see the screenshots
//in other prob each func call made 2 calls ...that is same no of calls 
//but in this prob the no of calls each func makes depends on size of processed (ans string)
// no of calls = size of ans(processed str ) + 1
//use simple for loop..with i<=size+1...see the screen shots to see how loop works using substring we add the char 
// first = substr(0,i)...i excluded....last = substr(i,len)...i included
//ans = first + ch + last

import java.util.ArrayList;

public class basic {

    // static void perm(String str, String ans){
    // if(str.isEmpty()){ // when unprocessed str becomes empty we get the ans
    // System.out.println(ans);
    // return;
    // }
    // char ch = str.charAt(0);
    // int n = ans.length() ;
    // for(int i =0;i<=n;i++){
    // String first = ans.substring(0,i); // using ans to take substring from it to
    // get the position of the char we want to add
    // String last = ans.substring(i,n);
    // perm(str.substring(1), first + ch + last);//str.substring(1)..skip first ch
    // for next call ...first + ch + last..ans
    // }
    // }

    // returning output as an array list

    // Function to return all permutations of a given string as an ArrayList
    static ArrayList<String> perm(String str, String ans) {
        // Base case: If the input string is empty, we have found one permutation
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>(); // Create a new list to store the permutation
            list.add(ans); // Add the found permutation to the list
            return list; // Return the list so it can be used in further recursive calls
        }

        char ch = str.charAt(0); // Take the first character of the string
        int n = ans.length(); // Get the length of the current answer string
        ArrayList<String> result = new ArrayList<>(); // Create a list to store all permutations..local to this call

        // Iterate over all possible positions to insert the character `ch`
        for (int i = 0; i <= n; i++) {
            String first = ans.substring(0, i); // Take the first part of `ans` (before inserting `ch`)
            String last = ans.substring(i, n);  // Take the remaining part of `ans` (after inserting `ch`)

            // Recursively call the function with the remaining substring of `str`
            // and the newly formed `ans` after inserting `ch`
            result.addAll(perm(str.substring(1), first + ch + last));
        }

        return result; // Return the accumulated list of permutations
    }

    public static void main(String[] args) {
        String str = "abc";
        // perm(str, "");
        System.out.println(perm(str, ""));
    }
}
