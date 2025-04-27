// This program counts the number of steps required to reduce a given number 
// n to zero using the following rules:
// If  n is even, divide it by 2.
// If  n is odd, subtract 1 from it.
// Repeat until  n becomes 0 while keeping track of the steps.

public class steps {

    static int step_count(int n ){
        return helper(n,0);
    }
   private  static int helper(int n , int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2, steps+1); // if no is even
        }
        return helper((n-1), steps+1); // if no is odd
    }
    public static void main(String[] args) {
        System.out.println(step_count(14));
    }
}
