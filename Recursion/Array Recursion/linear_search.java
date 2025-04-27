// search a target element in the arr
// recurion already handles iteration no need to use unnecessary loops

public class linear_search {

    static int search(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return helper(arr, target, i + 1); //else

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 6, 97, 34, 35, 1 };
        int target = 34;
        System.out.println(search(arr, target));
    }
}
