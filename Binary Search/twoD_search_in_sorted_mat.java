// take middle col and apply bs - find the mid
// if target == mid - ans
//if target<mid - ignore rows after mid
// if target>mid- ignore rows above mid
// in the end we are left with 2 rows- check if mid col contain ans ,else we hv 4 parts on its sides
// check in which part the target may lie and then apply BS -as its sorted
// we need simple BS as well (for last step & for 1D mat)(but its modified)
// in this method we are eliminating rows, but we can eliminate cols as well

import java.util.Arrays;

public class twoD_search_in_sorted_mat {
    // to search in provided rows and cols
    static int[] BS(int[][]mat,int row,int cStart,int cEnd,int target){
        int l = cStart;
        int u = cEnd;
        while(l<=u){
            int mid = l+(u-l)/2;
            if(target>mat[row][mid]){
                l=mid+1;
            }
            else if(target<mat[row][mid]){
                u=mid-1;
            }
            else{     // target == arr[row][mid]
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][]mat,int target){
        int rows=mat.length;
        int cols= mat[0].length;
        if(rows==1){
            return BS(mat,0,0,cols-1,target);
        }
        // run loop until only 2 rows left
        int rStart=0;
        int rEnd = rows-1;
        int cMid = cols/2;
        while(rStart<(rEnd-1)){// while this is true it will have more than 2 rows
            int mid = rStart+(rEnd-rStart)/2;
            if(mat[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(mat[mid][cMid]<target){
                rStart=mid;  // ignore rows above mid
            }else { //(mat[mid][cMid]>target)  ignore rows after mid
                rEnd = mid;
            }
        }
        // now we hv 2 rows
        // check if ans is in mid col
        if(mat[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(mat[rStart+1][cMid]==target){    // rStart+1 is basically rEnd for this condition when 2 rows left
            return new int[]{rStart+1,cMid};
        }

        // search in 1 half
        if(target<=mat[rStart][cMid-1]){
        return BS(mat,rStart,0,cMid-1,target);
        }
        // search in 2 half
        if(target>=mat[rStart][cMid+1] && target<=mat[rStart][cols-1]) {
            return BS(mat, rStart, cMid + 1, cols - 1, target);
        }
        // search in  3 half
        if(target<=mat[rStart+1][cMid-1]){
        return BS(mat,rStart+1,0,cMid-1,target);
        }
        // search in 4 half
        if(target>=mat[rStart+1][cMid+1] && target<=mat[rStart+1][cols-1]){   // can write in else also
        return BS(mat,rStart+1,cMid+1,cols-1,target);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][]nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target =6 ;
        System.out.println(Arrays.toString(search(nums,target)));

    }
}