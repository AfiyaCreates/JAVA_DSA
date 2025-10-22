//2 stacks are there  remove one item at each turn but sum of those removed items must not exceed 10
//answer is no of items removed....thats the max count  
//stack 1 
//stack 2
//given - stack a..stack b..sum ....max count c...
//at each step we have 2 options to remove item from a or b ...calc sum and take the one with value <10
//recursion approach 

//similar to like a sequence or subsequence ques wali approach see notes
//see vid and make diagram
//like processed an dunprocessed array
//at each stage return the count....
//at last take count -1 ...coz the last max count is the breaking condition sum>10 ...so that wont be considered

import java.util.*;

public class GameOf2Stacks {

    static int twoStacks(int x, int[] a, int[] b) { // provded method...x is allowed sum

        return game(x, a, b, 0, 0) - 1; // this will be the ans

    }

    static int game(int x, int[] a, int[] b, int sum, int count) { // method we create ..helper
        if (sum > x) {
            return count;
        }
        //if while slicing array becomes empty
        if(a.length==0||b.length==0){
            return count;
        }
        //dont use count ++..in recursive call count+1.is better
        int ans1 = game(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count+1); // taking element form arr a
        int ans2 = game(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count+1); // taking element form arr a

        return Math.max(ans1, ans2);

    }

}