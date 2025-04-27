import java.util.Arrays;

public class bubble_sort {

    // static void sort(int[]arr,int n){
    // if(n==1){
    // return;
    // }
    // for(int i=1;i<n;i++){ //code for 1 pass
    // if(arr[i]<arr[i-1]){
    // int temp = arr[i];
    // arr[i]=arr[i-1];
    // arr[i-1]=temp;
    // }
    // }
    // sort(arr,n-1);
    // }

    static void sort(int[] arr, int n, int i) {

        if (n == 1) {
            return;
        }

        if (i < n-1) { // code for 1 pass  ...<n-1 to avoid arrya index out of bound
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            sort(arr, n, i+1); //continue sorting in same pass
        }

        else {
            sort(arr, n - 1, 0); //for next pass....when i>=n-1..that is out of loop
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sort(arr, 4, 0);
        System.out.println(Arrays.toString(arr));
    }
}
