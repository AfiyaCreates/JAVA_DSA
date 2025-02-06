// check understand again
//eg- arr-[2,9,2,2,2] l=mid=u  since duplicate values present, so prev method won't work
//find pivot ignoring as many duplicate values as possible, so we shift l to l+1 and u to u-1
public class rotated_array_with_duplicates {
    static int findPivotWithDuplicates(int[]arr){
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
            // if elements at l, u and mid are equal then just skip the duplicates
            if(arr[mid]==arr[l] && arr[mid]==arr[u]){
                l = l+1;
                u = u-1;

                // what if the elements at start and end were pivot
                // if l is pivot
                if(arr[l]>arr[l+1]){ // just like we did above with mid
                    return l;
                }
                // if u-1 is pivot
                if(arr[u]<arr[u-1]){  // just like we did above with mid
                    return u-1;
                }
            }
           // if left side is sorted then pivot should be in right
            else if(arr[l]<arr[mid] || (arr[l]==arr[mid] && arr[mid]>arr[u])){
                //if arr[l]>=arr[mid] , we know elements after mid are smaller than l,so if l and mid are same so .. elments after mid will also be smaller than mid.. so u will be less than mid
                l = mid+1;
            }else{
                // if right side is sorted then pivot should be in left
                u = mid-1;
            }
        }
        return -1;
    }
}
