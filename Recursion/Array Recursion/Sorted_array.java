// to check if array is sorted or not
//arr will be same ...we dont modify the arr
// eg - 12345....(12345,0)
// it checks for 1<2 and check(2345,1)
//it checks for 2<3 and check(345,2)...and so on 
// when i==n that means the array was sorted so return true...else false
public class Sorted_array {

    // static boolean check(int[]arr){ // declare it as boolean since it returns
    // helper function ...which is boolean
    // return helper(arr,0);
    // }
    // private static boolean helper(int[]arr , int i){
    // int n = arr.length-1;
    // if(i==n){
    // return true;
    // }
    // if(arr[i]<=arr[i+1]){ //>= to allow duplicates
    // return helper(arr,i+1);
    // }
    // return false;

    // can write this as
    private static boolean sorted(int[] arr, int i) {
        int n = arr.length - 1;
        if (i == n) {
            return true;
        }
        return arr[i] <= arr[i + 1] && sorted(arr, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 ,4};
        // System.out.println(check(arr));
        System.out.println(sorted(arr, 0));

    }

}