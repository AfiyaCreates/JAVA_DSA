//see vid notes
//pivot-choose any elemet as pivot
// after first pass elements<pivot will be on lhs and elements>pivot will be on rhs
// at every pass the pivot gets to its correct position 
// eg- 54321..if 4 pivot then after sorting ...321 4 5...(321<4 and 5>4)
//we have 321 pivot = 3 ...after sorting 12 3  ..... we have 5 on rhs
//we have 12 ...(already sorted)
//in merge sort it goes till single element but in quick sort it wont go to single element if arr is already sorted like above 
//sorting origignal arr
//should be: arr[i]<p and arr[j]>p....so if arr[i]>=p and arr[j]<p ...swap i and j  ...i++ and j--
//while arr[i]<p i++ and arr[j]>p j--
//we have l and j ...i and u -> i and u are main and decides which part of array we are working on ..and l and j are just for swap

//pivot- can be random element ,corner elemnts,pick the middle element
//see ss for notes...
//t(n)=t(k)+t(n-k-1)+O(n)....o(n) is the time taken to place pivot at correct position
//t(n)=t(n-1)+O(n) = o(n sq)...worst time complexity
//t(n)= 2t(n/2)+O(n) = o(n logn)...best time complexity
// write proper notes for its time complexity....go through the vid
//see merge sort ...space and time complexity video

//not stable....in place...ms is better in linkedlist ue to memory allocation is not contiguous
//hybrid sorting algo- merge sort + insertion sort (works well with partially sorted data)
//The Arrays. sort() method can be applied to arrays of primitive data types (e.g., int , char , double ) and arrays of objects (e.g., String , Integer ). The method uses a dual-pivot Quicksort algorithm for primitive types and a modified mergesort for object arrays,
import java.util.Arrays;
public class Main {

    static void sort(int[] arr, int l, int u) {
        if (l >= u) {
            return;  // Base case: If the subarray has one or no element, it's already sorted
        }
        int i = l;
        int j = u;
        // lets take pivot as mid element
        int mid = i + (j - i) / 2;
        int pivot = arr[mid];
        while (i <= j) {

            // also a reason if already sorted will not swap
            while (arr[i] < pivot) {
                i++;    
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {    // Swap elements to ensure partitioning....when arr[i]>p and arr[j]<=p...sap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

         // Recursively sort the left and right halves
        //pivot is at correct index ...now sort the 2 halves now
        //after i>j..i at right and j at left of pivot
        sort(arr,l,j);
        sort(arr,i,u);

    }
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
       
    }
}