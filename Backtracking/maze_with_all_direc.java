// in this maze can go right down up left 
// we already did tye condition for right and down lets see conition for left and up
//up - col will be same row will be reduced by 1 ...r>0
//left - row will be same col will reduce by 1 ....c>0

// leads to stack overflow...coz u wil reach a point wgich is same from where u started ...see recursion tree in ss
// so we dont wnt to move back to same path... so dont allow to go to cells which are visited..so mark the visited cells as false
//  for this we introduce backtracking
// imp - marking false ==1..i have that cell in my current path 
// so when that path is over ..eg u r in another recurion call so those cells should not be false
// so while u r moving back we restore the maze as it was..so while going back turn false to true
//when does going back happen ?...it happens when the function is returned...u go to above recursion call now revert the changes that were made...turn false to true

public class maze_with_all_direc {

    // static void all_path(String ans, boolean[][] maze, int r, int c) {
    // if (r == maze.length - 1 && c == maze[0].length - 1) { // dont start with 1 1
    // start with maze length
    // System.out.println(ans); // last cell return path
    // return;
    // }
    // if (maze[r][c] == false) { // cell with obstacle
    // return;
    // }
    // if (r < maze.length - 1) { // see condition for row and cols too
    // all_path(ans + "D", maze, r + 1, c); // use r+1 since we are incrementing the
    // values
    // }
    // if (c < maze[0].length - 1) {
    // all_path(ans + "R", maze, r, c + 1);
    // }
    // //up
    // if (r>0) {
    // all_path(ans + "U", maze, r-1, c);
    // }
    // //lefall
    // if (c >0) {
    // all_path(ans + "L", maze, r, c - 1);
    // }
    // }

    // with backtracking
    static void all_path(String ans, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) { // dont start with 1 1 start with 0 0
            System.out.println(ans); // last cell return path
            return;
        }
        if (maze[r][c] == false) { // cell with obstacle
            return;
        }
        // if not false then considering this cell then to mark as visited set as false
        maze[r][c] = false;

        if (r < maze.length - 1) { // see condition for row and cols too
            all_path(ans + "D", maze, r + 1, c); // use r+1 since we are incrementing the values
        }
        if (c < maze[0].length - 1) {
            all_path(ans + "R", maze, r, c + 1);
        }
        // up
        if (r > 0) {
            all_path(ans + "U", maze, r - 1, c);
        }
        // lefall
        if (c > 0) {
            all_path(ans + "L", maze, r, c - 1);
        }

        // this is line where the function will be over so reset the node 
        maze[r][c] = true;

    }

    public static void main(String[] args) {
        boolean maze[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        all_path("", maze, 0, 0);
    }

}
