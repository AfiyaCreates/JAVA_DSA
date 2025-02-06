// simple binary search - when u find the mid same as target - we find the occurrence of the target element
// but to find first occurrence apply BS in left of mid and similarly for last occurrence apply BS in right of mid

import java.util.Arrays;

public class first_and_last_position_of_element_in_sorted_array {
    static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};
         ans[0] = search2(arr,target,true);
         if(ans[0]!=-1) {
             ans[1] = search2(arr, target, false);
         }
        return ans;
    }
    static int search2(int[]arr,int target,boolean findStartIndex){
        int ans =-1;
        int l = 0;
        int u = arr.length - 1;
        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (target > arr[mid]) {
                l = mid + 1;
            } else if (target < arr[mid]) {
                u = mid - 1;
            } else {     // target == arr[mid]
                ans = mid;
                if(findStartIndex){   // BS in left of mid
                    u=mid-1;
                }else{                // BS in right of mid
                    l=mid+1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        // here i am using a sorted array(ascending order)
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(nums, target)));
    }
}

