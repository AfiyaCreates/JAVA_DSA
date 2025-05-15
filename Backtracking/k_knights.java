// place n knights such that they do not attack each other
// take board , r AND c , n ..for no of knights to place 
// when n==0 one  ans found...so remove the func and backtrack and remove the k from board
// when u reach at end of one col move to next row 

// check code once

public class k_knights {

    static void nknight(boolean[][]board,int r ,int c,int n){
        if(n==0){   // base condition
            display(board); 
            System.out.println();
            return;
        }
        if(c==board.length){  // when u reach at end of col move to nextr row ...understand this line 
            nknight(board, r+1, 0, n);
            return;
        }
        if(r == board.length){ // just skip to avoid out of bound
            return;
        }

        if(isSafe(board,r,c)){
            board[r][c]=true;
            nknight(board, r, c+1, n-1); //recursion(same row next col )
            board[r][c]=false; //backtrack 

        }
        //  if its not safe simply move ahead without making it true..anddont reduce yo n-1 ..since we didnt placed the k
        nknight(board, r, c+1, n); //recursion(same row next col )
        
    }
    // we use this func to avoid repeating
    static boolean  isvalid(boolean[][]board, int r,int c){
        int x = board.length;
        if(r>=0 && r<x && c<x  && c>=0) {// we are starting index with 0 SO acc to it
            return true;
        }
        return false;
        
    }
    // checking the 4 valid positions for k
     static  boolean isSafe(boolean[][]board,int r, int c){
        
        if(isvalid(board, r-2, c-1)){  // if cell is valid and is already occupied so return false 
            if(board[r-2][c-1]){
            return false;
            }
        }

        if(isvalid(board, r-1, c-2)){  // if cell is valid and is already occupied so return false 
            if(board[r-1][c-2]){
            return false;
            }
        }

        if(isvalid(board, r-2, c+1)){  // if cell is valid and is already occupied so return false 
            if(board[r-2][c+1]){
            return false;
            }
        }
        
        if(isvalid(board, r-1, c+2)){  // if cell is valid and is already occupied so return false 
            if(board[r-1][c+2]){
            return false;
            }
        }
        return true;
        
        
     }

    private static void display(boolean[][]board){
        for (boolean []row: board){
            for(boolean element : row){
                if(element){
                    System.out.print("K");
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }    

    public static void main(String[] args) {
        int n = 4;
        boolean[][]board=new boolean[n][n];
        nknight(board, 0, 0, n);
        
    }
    
}
