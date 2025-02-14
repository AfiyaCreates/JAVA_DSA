// Cyclic Sort Approach:
//range will be 0-n ...total n+1 nos
//if no from 0 and index from 0... index=value 
// We place each number at its correct index (arr[i] should be at index arr[i]).
// If arr[i] is within range (0 to n-1) and is not at the correct index, we swap it.
// If it's already in the right place or arr[i] == n, we move to the next index.
// Finding the Missing Number:
// After sorting, we traverse the array to find the first index where arr[j] != j, which is the missing number.
// If all numbers are correctly placed (0 to n-1), the missing number is n.
//case 2 ...if n not present .eg arr=1,0,3,2...4 not present

//if index =n ignore and follow normal steps of swapping ..eg arr= 4,0,2,1...when i=4 ignore ..do swapping for rest

class missingNo{
     static int missing(int[] arr){
        int i=0;
        int n = arr.length;
        while(i<n){
            int correcti = arr[i];
            if(arr[i]<n &&arr[i]!=arr[correcti]){     // it ignores n***
                swap(arr,i,correcti);
            }
            else{
                i++;
            }
        }
//search for first missing no
        for(int j=0 ;j<n;j++){
            if(arr[j]!=j){
                return j;
            }
        }
 // Case 2: If all numbers are at their correct index, then 'n' is missing
        return n;
    }
  
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[]arr = {3,1,0,4};
         int no= missing(arr);
        System.out.println(no);
        
    }
}

