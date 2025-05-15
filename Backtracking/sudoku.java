// when a choice can affect future answers use backtrack 
// sudoku - 9 x 9 grid ..has 3 x 3 ...9 sub-grids..can only add no from 1 to 9 ..
//each digit must occur exactly once in each row.. in each col and in each sub-boxes
// use for loop for 1-9 and for each value chcek if it can be in cell or not if the move to next empty cell and repeat 
// backtrack and remove previous elements
// to check for safe condition ...checking rows and col is easy but how we gonna check box 

//time complexity - 9 no and for each no possibility  to be in a cell is is n sq... = O(9^n sq)
// do kunal kushwaha soln also 

public class sudoku {
    static boolean sudoku(int[][] board, int r, int c) {

        // if no empty element found return true (base condition)
        if (r == 9) {
            printBoard(board);
            return true;
        }
        if(c==9){
          return sudoku(board, r + 1, 0);  // if lst col ..move to next row
        }

        // if cell is not empty
        if(board[r][c]!=0){
           return  sudoku(board, r, c + 1); // if not last colmove to next col  
        }

        // if cell is empty
        if (board[r][c] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, r, c, i)) {
                    board[r][c] = i;
                    if (sudoku(board, r, c + 1)) {
                        return true;
                    }
                }
                board[r][c] = 0;  //backtrack
            }
        } 
       

        return false; // if cant be solved

    }

    static boolean isSafe(int[][] board, int r, int c, int no) {
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[r][j] == no)
                return false;
        }
        // check col
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == no)
                return false;
        }
        // check box(grid) ***
        // get starting row and col and then check each cell in grid
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i <= sr + 2; i++) {
            for (int j = sc; j <= sc + 2; j++) {
                if (board[i][j] == no) {
                    return false;
                }
            }
        }

        return true;

    }

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 8, 5, 0, 0, 0, 0, 0, 0 },
                { 9, 2, 1, 0, 0, 0, 0, 0, 0 },
                { 6, 4, 7, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 2, 3, 0, 0, 0 },
                { 0, 0, 0, 7, 8, 4, 0, 0, 0 },
                { 0, 0, 0, 6, 9, 5, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 8, 7, 3 },
                { 0, 0, 0, 0, 0, 0, 9, 6, 2 },
                { 0, 0, 0, 0, 0, 0, 1, 4, 5 }
        };
        sudoku(board, 0, 0);

    }

}
