// knights means horses in chess... ek do dhai
//knight piece can move in 8 different directions 
// consider it is initially at (r,c) ...for each move see its position 
// like 1 - (r-2,c+1)... 2- (r-1,c+2) .. so on see notes ss
// the immediate cells of knight gets blocked ..it can move to other cells only ac  to its no ....if it cant then we return false
// we hacve grid , r and c give us position of knight, expectedval - will be current position val + 1...can store it in expected vau so 
//expvalue=expvalue+1
// if grid[r][c] != expvalue ..return false (base condition...since it cant go to that cell though it is valid not blocked but its not in sequence )
// coz knight move like from expvalue 1 2 3 4 5 6 7 8
// also check it doesnt go out of grid true
// so base condition be like  if (r<0 c<0 r>=n c>=n grid[r][c] != expvalue )
// if expvalue = n sq-1 ....means u reached to end value so ...return  
// at return at end of func retrun all recurive func ans in or || even if one of them is true it moves next with that value 


// knights tour prob
public class knights_tour{

    static boolean knight(int[][]grid,int r , int c,int n, int expVal){
        if(r<0 || c<0 || r>=n ||c>=n || grid[r][c]!=expVal){
            return false;
        }
        if(expVal==n*n-1){
            return true;
        }
        // 8 possible moves
        boolean ans1 = knight(grid, r-2, c+1, n, expVal+1); 
        boolean ans2 = knight(grid, r-1, c+2, n, expVal+1); 
        boolean ans3 = knight(grid, r+1, c+2, n, expVal+1); 
        boolean ans4 = knight(grid, r+2, c+1, n, expVal+1); 
        boolean ans5 = knight(grid, r+2, c-1, n, expVal+1); 
        boolean ans6 = knight(grid, r+1, c-2, n, expVal+1); 
        boolean ans7 = knight(grid, r-1, c-2, n, expVal+1); 
        boolean ans8 = knight(grid, r-2, c-1, n, expVal+1); 

        return ans1||ans2||ans3||ans4||ans5||ans6||ans7||ans8;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0, 3, 6},
            {5, 8, 1},
            {2, 7, 4}
        };
        int n = grid.length;

        boolean result = knight(grid, 0, 0, n, 0);
        System.out.println(result);
    }

}
