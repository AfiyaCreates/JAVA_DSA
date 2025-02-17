// Uses recursion** → Divide and sort (Divide and Conquer technique).  
// Divide array into 2 parts** → Base condition: when 1 element is present, start merging.  
//Get both parts sorted through recursion**.  
//Merge 2 sorted parts**.  
// For merging** → Create a new array of size = `arr1 + arr2`.  
// Use 2 pointers** → `i` (arr1), `j` (arr2), `k` (new arr).  
// Compare elements** → Insert the smaller one into `new arr`.  
// If one array is completed**, copy remaining elements of the other array.  
// `Arrays.copyOfRange`** → Copies a specified range from the original array to a new array.  
// Number of levels - **of partition = log₂(n)**.  
// Comparisons at each partition = O(n)**.  
// Time complexity = O(n log n)**.
//using acrabazi formula....
import java.util.Arrays;
public class Main {
    static int[] mergeSort(int[]arr){
        if(arr.length==1){
            return arr;    //edge case if single elemnt in arr
        }
        int mid = arr.length/2;
        int []left = mergeSort(Arrays.copyOfRange(arr,0,mid));  //mid is exclusive ..includes element form 0 to mid-1)
        int []right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); 
        return merge(left,right); 
    }
    static int[] merge(int[]first,int[]second){  //this method takes 2 arrays and sorts and merges them 
        int[] ans = new int[first.length+second.length]; 
        int i=0; 
        int j=0; 
        int k=0; 
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                ans[k]=first[i]; 
                i++; 
            }
            else{
                ans[k]=second[j]; 
                j++; 
            }
           k++; 
        }
        //it may happen if one of the arr is not complete in that case
        //it copies the remaining elements

        while(i<first.length){
            ans[k]=first[i]; 
            i++; 
            k++; 
        }

        while(j<second.length){
            ans[k]=second[j]; 
            j++; 
            k++; 
        }

        return ans;  //already initialized it above

    }
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1}; 
        arr = mergeSort(arr);   //updating original arr...storing in same arr..but original arr is not sorted the copy of that arr is sorted
        System.out.println(Arrays.toString(arr)); 
    }

}