// mountain array is an array where elements first increases and then decreases
// eg - [0,2,1,0] - peak value = 2 (so this is max no in array)
// sorted array first half in asc and second half in desc - so BS
// if a[mid]<a[mid+1] - element in asc part - l(start) = mid+1
// if a[mid]>a[mid+1]- element in desc part - u(end) = mid
// when l=u - answer found

public class peak_in_mountain_array {
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
            // in the end l==u and will be pointing to the largest no bcoz of above 2 checks
            // l and u are trying to find the max no in each case
        }
        return l;  // return l or u as both are pointing to same value
    }

    public static void main(String[] args) {

        int[] nums ={2,4,6,7,9,5,3,0};
        System.out.println(searchPeak(nums));
    }

}
