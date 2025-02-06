// imp take time and understand
// short method is recursion
// not work in duplicate values
// first find the pivot in the array- no in arr from where next no are ascending- 4 cases
// we get sorted arrays(asc) in left and right of pivot
// both are sorted in  asc ... apply BS - first in first half and then in second half - 3 cases
// understand 3rd case - when a[l]>=a[mid] means that all elements after mid are smaller than a[l].so we will ignore those elements and u= mid-1
// understand 4th case - when a[l]<a[mid] means that all elements before mid are smaller than a[mid]. so we will ignore those elements and l= mid+1
public class search_in_rotated_sorted_array {
    static int findPivot(int[]arr){
        int l =0;
        int u = arr.length-1;
        while(l<=u){
            int mid = l+(u-l)/2;
            // 4 cases
            if(mid<u && arr[mid]>arr[mid+1]){  // mid<u so that it doesn't throw index out of bound
                return mid;
            }
            if(mid>l && arr[mid]<arr[mid-1]){ // same reason
                return mid-1;
            }
            if(arr[l]>=arr[mid]){
                 u = mid-1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }

    static int search(int [] arr,int target,int l,int u){
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
        return -1;
    }

    static int ApplySearch(int[]arr,int target){
        int pivot = findPivot(arr);
        // if didn't find pivot means arr is not rotated so, just do simple BS
        if(pivot==-1){
            return search(arr,target,0,arr.length-1);
        }
        // if pivot found we got two asc sorted arrays
        // we got 3 cases
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return search(arr,target,0,pivot-1);
        }
       // if(arr[target]<arr[0])
        return search(arr,target,pivot+1,arr.length-1);
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(ApplySearch(nums,target));
    }

}
