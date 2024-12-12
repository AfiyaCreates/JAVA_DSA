import java.util.Arrays;

// in 2D arrays there is semicolon aftre the block
// imp understand return type for 2d array
// used Arrays.toString()
// eg- int[][]nums = {
//                    {,,,},
//                    {,,,},
//                    {,,,}
//                          };
public class In2DArray {
    static int[] search(int[][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};    // Return row and column indices

                }
            }
        }
        return new int[]{-1,-1};   // or return null
    }

    public static void main(String[] args) {
        int [][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
        int[] ans = search(nums,target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }
}
