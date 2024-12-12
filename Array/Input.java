import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        array of primitives
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=67;
        arr[3]=298;
        arr[4]=90;
        System.out.println(arr[3]);
//      taking input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        giving output using for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println(arr[5]); // index out of bound
        System.out.println();
//        imp method of printing array
        System.out.println(Arrays.toString(arr));

//        array of obj
        String[] arr2= new String[4];
        for(int i = 0;i<arr2.length;i++){
            arr2[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr2));

//     modify arr
        arr2[2]= "papa";
        System.out.println(Arrays.toString(arr2));





    }
}
