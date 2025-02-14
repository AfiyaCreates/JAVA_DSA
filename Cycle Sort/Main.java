//when distinct no are given from range 1 to n - use cycle sort
//after sortig index=value-1
//so start by checking if index=value-1....if not swap element with correct index value
//then keep checking element at first index until it is at its correct position ...if it is then move to next index 
//worst case - (N-1)+n swaps...=2n-1...=o(n)
//if range=[1,n] elements at index=value-1...missing no = j+1...arr[j]!=j+1
//if range=[0,n]... elements at index=value...missing no=j....arr[j]!=j

// learn to find missing and duplicates in both type of range

//in ques first identify range ..decide type of cycle sort ...then how to return search elements 

// missing element in 1,n
//  ArrayList<Integer> ans = new ArrayList<>();  // use array list
// for(int j=0;j<arr.length;j++){
//     if(arr[j]!=j+1){  //for range[1,n]...index=value-1..value=index+1...we hv to return index so we write it as ...arr[j]!=j+1
//         ans.add(j+1);
// return ans;

// missing element in 0,n
// for(int j=0 ;j<n;j++){
//     if(arr[j]!=j){
//         return j;
//     }
// }
import java.util.Arrays;
class Main{
    static void cycle(int[]arr){
        int i=0;
        while(i<arr.length){
            int correcti = arr[i]-1;
            if(arr[i]!=arr[correcti]){
                swap(arr,i,correcti);
            }else{
                i++;
            }

        }
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[]arr = {3,5,2,1,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}