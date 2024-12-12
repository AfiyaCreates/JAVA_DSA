import java.util.Arrays;
//remember the main concept for swap
//   temp = a
//   a = b
//   b = temp

public class SwapQues {

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {13,14,15,16,17};
        System.out.println(Arrays.toString(arr));
        swap (arr,1,3);

    }
}
