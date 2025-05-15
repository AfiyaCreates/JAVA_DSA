// maze prob can move roght or down ...but for obstacle example river cany cross the river 
//so when u land on  anew cell check if its river or not ...if it is stop recursion for that call 
// see ss 
// this is not example of backtracking .. this is stopping recursion
// for river take a boolean as false 
// so use a boolean matrix

public class maze_with_obstacles {

    
    static void restricted_path(String ans ,boolean [][]maze, int r,int c){
        if(r==maze.length-1 && c==maze[0].length -1){   // dont start with  1 1 start with 00
            System.out.println(ans);  // last cell return path 
            return;
        }
        if(maze[r][c]==false){   // cell with obstacle
            return ;
        }
        if(r<maze.length-1) { // see condition for row and cols too
            restricted_path(ans + "D" ,maze, r+1, c);  // use r+1 since we are incrementing the values
        }
        if(c<maze[0].length-1) {
            restricted_path(ans + "R", maze, r, c+1);
       }
    }




    public static void main(String[] args) {
        boolean river [][]= {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        restricted_path("", river, 0, 0);
    }
}
