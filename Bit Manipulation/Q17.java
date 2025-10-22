//flipping an image...flip every image horizontally  and then invert it
// flip horizontally means - reversed
//eg- 1,1,0 becomes 0,1,1
//invert means - replace each 1 by 0 and each 0 by 1
//eg - 0,1,1 to 1,0,0

//first normally reverse the array like how we do by swapping till half(mid) and 
//we know if we xor by 1 ...we get reverse of that no 0 to 1 and 1 to 0
//we can do xor with reverse itself 
//see ss

import java.util.Arrays;

public class Q17 {

    static int[][] revertImg(int[][] arr) {

        for (int[] row : arr) {
            int n = (arr[0].length + 1) / 2;
            for (int i = 0; i < n; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[n - 1] ^ 1;
                row[n - 1] = temp;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 } };
        System.out.println(Arrays.deepToString(revertImg(arr)));  //gives cotrrect ans but the sequence is improper 

    }
}
