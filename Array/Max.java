import java.util.Arrays;

public class Max {
    static int max(int[] arr){
        int max = arr[0];

        if ( arr.length==0) {
            return -1;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // also work on edge cases like what if arr is null
    // when u want to find the max value within a range
    static int max_range(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int max = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {12,13,14,15};
        System.out.println("the array is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is:  "+ max(arr));
        System.out.println("tne max value within the given range is: "+ max_range(arr,0,2));
    }
}
