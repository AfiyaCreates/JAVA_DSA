import java.util.Scanner;
import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
//         int[][] arr = new [rows][cols];
//         adding no of cols is not mandatory
//              OR
//         int[][] arr ={
//             {1,2,3},
//             {4,5},            // individual size of the array can vary
//             {7,8,9}
//         };                    // semicolon imp
//        arr.length - no of rows
//          arr[i].length - no of cols
//        System.out.println(Arrays.toString(arr[i]));
        Scanner sc = new Scanner(System.in);
        // input
         int[][] arr =new int[3][3];
        System.out.println("enter array values");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //  OR
        for(int i=0;i<arr.length;i++){
                System.out.println(Arrays.toString(arr[i]));
            }

    }

}
