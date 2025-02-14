//return smallest missing positive integer
//arr=[3,4,-1,1]
//      0 1 2 3
//arr= 1,-1,3,4....after sorting and ignoring -1
//.ignore negative no...then index of no at wrong place+1..is ans ...consder the first no at wrong index
//range like [1,n]...value = index -1 ...keep ignoring -ve values like we ignored duplicates  
//start checking from value 1 and return the missing no
class firstMissingPositive{
    static int missing(int[] arr){
       int i=0;
       int n = arr.length;
       while(i<n){
           int correcti = arr[i]-1;
           if(arr[i]>0 && arr[i]<=n && arr[i]!=arr[correcti]){     // it ignores n***....arr[i]>0...ignores -ve...arr[i]<=n..to ignore no greater than n
               swap(arr,i,correcti);
           }
           else{
               i++;
           }
       }
//search for first missing no
       for(int j=0 ;j<n;j++){
           if(arr[j]!=j+1){
               return j+1;  // simply returning first missing no and not using array list 
           }
       }
// Case 2: If all numbers are at their correct index, then 'n+1' is missing***
       return n+1;  
   }
 
   static void swap(int[]arr,int a,int b){
       int temp = arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
   }
   public static void main(String[] args) {
       int[]arr = {3,4,-1,1};
        int no= missing(arr);
       System.out.println(no);
       
   }
}



