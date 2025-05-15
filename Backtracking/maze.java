// what we are doing ...how we are doing
//eg a person is in a maze (matrix sort of )..it can only move in right or down direction 
// can divide this prob like ...path taken upto this point + next possible paths
//eg- RD + (....)
// eg - take a 3 by 3 matrix ...see ss for tree diagram 
//can start with (3,3)...same as starting with (0,0)
//(3,3) can either go to ...(2,3) or (3,2)
//from (2,3)..can go to (1,3) or (2,2)
//after (1,3)..there is only 1 way ...so we return 1 
//that whenever either the row =1 or col =1 we get one possible ans
// left ans +right ans = parent node ans

//code for printing path ...requires permutation and combination concept...processed unprocessed method
//(ans,r,c)...ans initially empty string ''
//for down (ans + d ,,2,3)...see ss notes

import java.util.ArrayList;

public class maze{

    //counting possible paths 

    // static int count(int r,int c){
    //     if(r==1 || c==1){
    //         return 1;
    //     }
    //     int left =  count(r-1, c);
    //     int right =  count(r, c-1);
    //     return left+right;
    // }

    //printing path

    // static void path(String ans , int r,int c){
    //     if(r==1 && c==1 ){
    //         System.out.println(ans);  // last cell return path 
    //         return;
    //     }
    //     if(r>1) {
    //         path(ans + "D" ,r-1, c);
    //     }
    //     if(c>1) {
    //         path(ans + "R",r, c-1);
    //    }
    // }

    //using list

    //  static ArrayList<String> path(String ans , int r,int c){
    //     if(r==1 && c==1 ){
    //     ArrayList<String> list = new ArrayList<>();  // last cell return path 
    //         list.add(ans);
    //         return list;
    //     }
    //     ArrayList<String> list = new ArrayList<>();  // 
    //     if(r>1) {
    //         list.addAll(path(ans + "D" ,r-1, c)); // include ans from above recursion calls so addall...since we are creating new list at each call
    //     }
    //     if(c>1) {
    //         list.addAll(path(ans + "R",r, c-1));
    //    }
    //    return list;
    // }

    // if we could move diagonally too(small d for diagonal)

     static ArrayList<String> diag(String ans , int r,int c){
        if(r==1 && c==1 ){
        ArrayList<String> list = new ArrayList<>();  // last cell return path 
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();  // 
        if(r>1) {
            list.addAll(diag(ans + "D" ,r-1, c)); // include ans from above recursion calls so addall...since we are creating new list at each call
        }
        if(c>1) {
            list.addAll(diag(ans + "R",r, c-1));
        }
        if(r>1 && c>1){   // whenever r==c....we take r>1 c>1 coz if r==1 c==1 we cant go diagonal 
            list.addAll(diag(ans + "d" ,r-1, c-1)); //*** r-1 and c-1
        }
       return list;
    }



    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("", 3, 3);
        // System.out.println(path("", 3, 3));
        System.out.println(diag("", 3, 3));



    }
}