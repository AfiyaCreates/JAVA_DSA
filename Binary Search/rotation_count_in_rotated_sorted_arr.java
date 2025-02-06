// rotation count = pivot(index) + 1

public class rotation_count_in_rotated_sorted_arr {

      static int findPivot(int[]arr){  // this is for non duplicates . we can use other func for duplicates
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
    static int countRotations(int[]arr){
          int pivot = findPivot(arr)  ;
          return pivot+1;
    }


    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(countRotations(nums));

    }
}
