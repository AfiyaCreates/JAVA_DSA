import java.util.Arrays;
// strings are immutable in java but arrays are mutable in java

public class Arrays_inFunctions {
    public static void change(int[]arr){
        arr[0]=99;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
}
