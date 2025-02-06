// eg - mat - [10 20 30 40]
//            [15 25 35 45]...
// no- [0][3] (mat[0][arr.length-1]) start from here and move acc to condition
// if target<no - col-- (elements in col of no ,are >no, so they will be >target)
// if target>no - row++ (elements in row of no ,will be <no, so they will be <target )

import java.util.Arrays;

public class twoD_array_bs {
    static int[] matSearch(int[][]arr,int target){
        int row = 0;
        int col= arr.length-1;
        while(row<arr.length && col>=0){
            int no = arr[row][col];
            if(no==target){
                return new int[]{row,col};
            }
            if(target<no){
                    col--;
                }else{  // target>no
                    row++;
                }
            }
        return new int[]{-1,-1};
        }

    public static void main(String[] args) {
        int [][] nums = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 49;
        System.out.println(Arrays.toString(matSearch(nums,target)));

    }

}
