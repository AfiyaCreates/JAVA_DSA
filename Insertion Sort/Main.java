//sort by part....01..012..0123..
//puts an element at its correct index on lhs
//i - 0 to n-2(i<n-1 ..or..i<=n-2)....and j - i+1 to j>0
// if j>j-1 break frm inner loop
//i<=n-2...to avoid array index out of bond ...coz if i=n then j=n+1
//time complexity...worst - O(n sq)..arr sorted in reverse order (1.....n-1)comparisons
//best case - O(n) already soted..n-1 comparisons
// adaptive- no of steps gets reduced if arr is sorted ...no of swaps reduced as compared to bubble sort
//stable
//used for smaller values of n...used when arr is partially sorted it takes part in hybrid sorting algo
import java.util.Arrays;
public class Main{

    static void insertion(int[]arr){
        int n = arr.length;
        for(int i =0;i<=n-2;i++){  //or i<n-1...same thing
            for(int j = i+1;j>0;j--){ // j starts from i+1 and moves left
                if(arr[j]<arr[j-1]){  //j--. ..i moves right ..j moves left
                    swap(arr,j,j-1);  // Swap if the current element is smaller than the previous one
                }
                else{  // If arr[j] is already in correct position, break early
                    break;  //if arr[j]>=arr[j-1]...we break from inner loop
                }
            }
        }
    } 
    
    // swap method
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int [] arr = {4,7,8,5,2,3,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}