//n x n board ...place n queens on it 
// no two queens can be in same row , col , or diagonal 
// first think of recursion and then backtracking
// whatever changes u r making with a recursion call ..when thatvcall is over that changes should also be removed ...similar to what we did in maze problem 

// it has 2 parts 
// first - place n queens in n different rows
// second - place each queen in safe position 

// time complexity
// reurrence relation  t(n) =  n * t(n-1) + O(n sq)...solve it uisng akrabazzi formula 
// time complexity - o(n^3 + n !) = o(n!)

// to eliminate for loops 
// u can use conditions ..but for it u have to use another variable in argument



public class N_Queen {

    // static void nQueen(String[][] board, int row, int n) {
    // if (row == n) { // base condition when reaches the last row ...display the
    // board
    // for(int i =0;i<n;i++){
    // for(int j =0;j<n;j++){
    // System.out.print(board[i][j] + " ");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // return ;
    // }
    // for (int col = 0; col < n; col++) {
    // if (isSafe(board, row, col)) {
    // board[row][col] = "Q";
    // nQueen(board, row + 1, n); // recursion
    // board[row][col] = "x"; // when the fnction backtracks it empties the cell
    // }
    // }
    // }

    // static boolean isSafe(String[][] board, int row, int col) {
    // int n = board.length;
    // //check row
    // for(int j =0;j<n;j++){
    // if(board[row][j]=="Q") return false;
    // }
    // //check col
    // for(int i=0;i<n;i++){
    // if(board[i][col]=="Q") return false;
    // }
    // //check left diagonal
    // //take min of row and col ...(eg - 2 ..so check for 00, 11, 22)....chcek this
    // int maxLeft = Math.min(row,col);
    // for(int i=1;i<=maxLeft;i++){
    // if(board[row-i][col-i]=="Q") return false;
    // }
    // //check right diagonal
    // // take row-- and col++..(eg - see ss)
    // int maxRight = Math.min(row,n-col-1); //take n-col-1
    // for(int i=1;i<=maxRight;i++){
    // if(board[row-i][col+i]=="Q") return false;
    // }
    // return true;
    // }

    // using display board...create a boolean board
    //understand the use of count ...and the isSafe conditions 
    static int nQueen(boolean[][] board, int row, int n) {
        if (row == n) {  // base condition when reaches the last row ...display the board 
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueen(board, row + 1, n); // recursion
                board[row][col] = false;   // when the fnction backtracks it empties the cell 
            }
        }
        return count;
    }

    private static void display(boolean[][]board){
        for (boolean []row: board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }

    }
       private  static boolean isSafe(boolean[][] board, int row, int col) {
            int n = board.length;
            //check row
            for(int j =0;j<n;j++){
                if(board[row][j]) return false;
            }
            //check col
            for(int i=0;i<n;i++){
                if(board[i][col]) return false;
            }
            //check left diagonal 
            //take min of row and col ...(eg - 2 ..so check for 00, 11, 22)....chcek this
            int maxLeft = Math.min(row,col);
            for(int i=1;i<=maxLeft;i++){
                if(board[row-i][col-i]) return false;
            }
    
            //check right diagonal 
            // take row-- and col++..(eg - see ss)
            int maxRight = Math.min(row,n-col-1);   //take n-col-1
            for(int i=1;i<=maxRight;i++){
                if(board[row-i][col+i]) return false;
            }
    
            return true;    
    }

    public static void main(String[] args) {
        int n = 4;
        // String[][] board = new String[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         board[i][j] = "x";
        //     }
        // }

        boolean [][]board = new boolean [n][n];
        System.out.println(nQueen(board, 0, n));

    }
}
