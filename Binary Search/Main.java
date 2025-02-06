// binary search -
// use when sorted array is given or when dealing with sequence of nos eg-sq root
// 1.works on sorted array......but we have to check if it is  sorted in asc or desc
// 2.find middle element  (l+u)/2        // int mid = l+(u-l)/2; use this for code
// 3. if target>mid - search in right(l=mid+1)
//    if target<mid- search in left(u=mid-1)
// 4. if mid=target - element found
// 5. if l>u - element not found


public class Main {
    static int search(int [] arr,int target){
        int l = 0;
        int u = arr.length - 1;
        while(l<=u){
//            int mid = (l+u)/2; // this might generate error if the sum is large value ,so it may exceed the int range
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

    public static void main(String[] args) {
	// here i am using a sorted array(ascending order)
        int[] nums ={2,4,6,7,9,23,45,67,78,89,99};
        int target = 5;
        System.out.println(search(nums,target));
    }

}
