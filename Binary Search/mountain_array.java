// to search an element in the mountain array
// first find peak element - we get one asc part and one desc part
// apply BS in asc part and if element not found apply it in desc part
// using order agnostic arr function to apply bs but mention start and end index in function itself
public class mountain_array {
    // finding peak element index
    static int searchPeak(int [] arr){
        int l = 0;
        int u = arr.length - 1;
        while(l<u){
            int mid = l+(u-l)/2;
            if(arr[mid]<arr[mid+1]){ // ascending part
                l=mid+1;
            }
            else { // (arr[mid]>arr[mid+1]) descending part
                u=mid;
            }
        }
        return l;  // return l or u as both are pointing to same value
    }

    //applying BS in asc or desc part
    static int orderAgnosticBS(int[]arr,int target,int l,int u){
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

    // setting l and u for asc part and desc part
    // first try finding in asc ...then desc
    static int ApplySearch(int[]arr,int target){
        int peak = searchPeak(arr);
        int asc = orderAgnosticBS(arr,target,0,peak);
        if(asc!=-1){
            return asc;  // if target found in asc part return it 
        }else{
            return orderAgnosticBS(arr,target,peak+1,arr.length-1); // if not check in desc part 
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(ApplySearch(nums,target));
    }



}
