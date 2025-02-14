//range-[1,n]...there is only 1 repeated no in arr
public class FindDuplicateNumber {
    
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Check if the element is at its correct position (i.e., value should be index + 1)
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1; // Find the correct index for arr[i]
                
                // If the value at the correct position is not the same, swap them
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    // If the value at the correct index is the same, we found the duplicate
                    return arr[i];
                }
            } else {
                // Move to the next index if the value is already at the correct position
                i++;
            }
        }
        return -1; // Return -1 if no duplicate is found 
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1}; 
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate); 
    }
}

