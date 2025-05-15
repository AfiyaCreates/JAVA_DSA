//original obj gets modifiesd
//print matrix - like 1 2 3 4 5
// print the pat like - ddrr
// we see the no (count) - is the level of recursion ....when u backtrack erase the path 

// take a step variable ...update the path array...print it in base condition..backtrack
// so create  apth array and step var in argument
//step increases by 1 (increments) 

import java.util.Arrays;

public class print_matrix_path {
    static void all_pathprint(String ans, boolean[][] maze, int r, int c, int[][]path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) { // dont start with 1 1 start with 00
            path[r][c]=step; //this will also be a step
            for(int[]arr : path){
                System.out.println(Arrays.toString(arr)); // each step gets added up and is printed.....last cell return path
            }
            System.out.println(ans);
            System.out.println();
            return;
        
           
        }
        if (maze[r][c] == false) { // cell with obstacle
            return;
        }
        // if not false then considering this cell then to mark as visited set as false
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) { // see condition for row and cols too
            all_pathprint(ans + "D", maze, r + 1, c,path,step+1); // use r+1 since we are incrementing the values
        }
        if (c < maze[0].length - 1) {
            all_pathprint(ans + "R", maze, r, c + 1,path,step+1);
        }
        // up
        if (r > 0) {
            all_pathprint(ans + "U", maze, r - 1, c,path,step+1);
        }
        // lefall
        if (c > 0) {
            all_pathprint(ans + "L", maze, r, c - 1,path,step+1);
        }

        // this is line where the function will be over so reset the node 
        maze[r][c] = true;
        path[r][c] =  0; // reset it to 0 for next function call

    }

    public static void main(String[] args) {
        boolean maze[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int[maze.length][maze[0].length];
        all_pathprint("", maze, 0, 0,path,1);  // initially set step as 1
    }

}


