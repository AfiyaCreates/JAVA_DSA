// same as ceiling of a no but it's not asking --no == target,just return smallest no greater than target
// note - letters wrap around means- if no character available in arr that is greater than target then,return value at 0 index

// so we know when l>u loop breaks so at this condition l=u+1 which = n (length pof array)
// return l%n - we use this bcoz while l<=u this returns l --same as ceiling prob
// and when l>u e.i. l=n -- this returns n%n=0 so returns value at 0 index  OR use if(l===n)--return 0

public class smallest_no_greater_than_target {
    static char search(char [] arr,char target){
        int n = arr.length;
        int l = 0;
        int u = n - 1;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(target>=arr[mid]){     // Changed if(target > arr[mid]) to if(target >= arr[mid]) to ensure that if the target is equal to arr[mid], we continue searching in the upper half (l = mid + 1).
                l=mid+1;
            }
            else{   //(target<arr[mid])
                u=mid-1;
            }
        }
        return arr[l%n];  // to return the smallest no just greater than target
    }

    public static void main(String[] args) {
        char[] nums ={'c','f','j'};
        char target = 'c';
//      char target = 'm';  // this will give value at index 0 - c
        System.out.println(search(nums,target));
    }

}
