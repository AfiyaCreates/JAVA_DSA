// floor - greatest element in the array that is smaller than or equal to the target
//  but if the target is smaller than the smallest no in arr...return -1
// simple binary search just return statement is changed at last

public class floorNo {
    static int search(int [] arr,int target){
        int l = 0;
        int u = arr.length - 1;
        if(target<arr[l]){
            return -1;
        }
        while(l<=u){
            int mid = l+(u-l)/2;
            if(target>arr[mid]){
                l=mid+1;
            }
            else if(target<arr[mid]){
                u=mid-1;
            }
            else{     // target == arr[mid]
                return mid;
            }
        }
        return u;  // to return index of the greatest no just smaller than target
    }

    public static void main(String[] args) {
        int[] nums ={2,4,6,7,9,23,45,67,78,89,99};
        int target = 10;
//        int target = 1;  // will return -1
        System.out.println(search(nums,target));
    }

}
