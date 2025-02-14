//eg-arr={1,1}...ans should be 1,2..1-duplicate and 2-missing no
//missing index-i+1
//duplicate-element at missing index


import java.util.Arrays;

public class SetMismatch {
    static int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correcti = arr[i] - 1;
            if (arr[i] != arr[correcti]) {
                swap(arr, i, correcti);
            } else {
                i++;
            }

        }

            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j+1){  //for range[1,n]...index=value-1..value=index+1...we hv to return index so we write it as ...arr[j]!=j+1

                   return new int[] {arr[j],j+1} ;
              
                }

            }
        
         return new int[]{-1,-1};
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1 };
       int[]result= mismatch(arr);
        System.out.println(Arrays.toString(result));

    }
}
