// sorted array means apply binary search nut we don't know length of array
// we move in chunk .by doubling the size of chunk at each step ...so we will require log n steps to cover the entire array
// so keep doubling the size while target > u

public class Element_in_array_of_infinite_no {
    static int findingRange(int[]arr,int target){
        // first start with a box of size 2
        int l=0;
        int u=1;
        while(target>arr[u]){
            int newL = u+1;  // newL is basically temp var
            // double the box value
            // new u = previous u + size of box *2
            u = u+ (u-l+1)*2;  // size of box - (u-l+1)
            l = newL;
        }
        return search(arr,target,l,u);
 
    }
    static int search(int [] arr,int target,int l,int u){
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
        int[] nums ={3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(findingRange(nums,target));
    }

}
