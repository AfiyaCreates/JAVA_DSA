// for searching in a particular range use start and end variables

public class SearchInRange {

    static int search(int[] arr, int target,int start,int end ){
        if(arr.length == 0){
            return -1;
        }
        for(int i =start;i<=end;i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,7,5,7,8,5,4,2,9};
        int target = 8;
        int ans = search(nums,target,1,4);
        System.out.println(ans);

    }
}
