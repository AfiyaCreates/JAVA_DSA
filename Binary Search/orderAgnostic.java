// check if array is in ascending or descending order

public class orderAgnostic {

    static int orderAgnosticBS(int[]arr,int target){
        int l=0;
        int u = arr.length-1;


        // check if array is in ascending or descending order
        boolean isAsc = arr[l]<arr[u];

        while(l<=u){
            int mid = l+(u-l)/2;
            if(isAsc){      // arr is in ascending order then
                if(target>arr[mid]){
                   l=mid+1;
                }
               else //(target<arr[mid])
               {
                 u=mid-1;
               }
            } else{     // arr is in descending order then
               if(target>arr[mid]){
                     u=mid-1;
               }
               else //(target<arr[mid])
               {
                     l=mid+1;
               }
            }
            if(target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {99,78,65,45,33,25,22,13,7,5,2};  // in desc order
//        int[]nums = {2,5,7,23,56,78,90,100}; // in asc order
        int target = 7;
        System.out.println(orderAgnosticBS(nums,target));
    }
}
