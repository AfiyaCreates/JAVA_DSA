// ceiling - smallest element in the array that is greater than or equal to the target
// but if the target is greater than the greatest no in arr...return -1
// simple binary search just return statement is changed at last (ei at the breaking of the loop when  l>u ....l is the ceiling no )
// l target u .....becomes  u target l ......when loop breaks ....l is the ans 


public class ceilingNo {
    static int search(int [] arr,int target){
        int l = 0;
        int u = arr.length - 1;
        if(target>arr[u]){
            return -1;             //target is greater than the greatest no in arr
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
        return l;  // to return index of the smallest no just greater than or equal to  target
    }

    public static void main(String[] args) {
        int[] nums ={2,4,6,7,9,23,45,67,78,89,99};
        int target = 10;
//        int target = 100;  // this will give -1
        System.out.println(search(nums,target));
    }

}

