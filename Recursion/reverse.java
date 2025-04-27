//eg - 1284..4821 ***
//Reversed=(Previous Reverse×10)+Last Digit(remainder)

public class reverse {

    // static int no = 0;
    // static void reverse(int n){
    // if(n==0){
    // return;
    // }
    // int r = n%10; //remainder
    // n = n/10; //to remove the remainder
    // no = no*10 + r; // to get reverse no
    // reverse(n); // to again reverse the no
    // }

//method 2

    // with pure recursion
    // eg - 1234
    // 4*10^3 + 123...but we pass (123,3)...for next call so..
    // f(n, arg) = remainder * 10 ^ arg-1 + f(n/10 , arg-1)..that is (remaininig no)

    // from this func u get the arg
    static int reverse2(int n) {
        // sometimes u may need some additional variables in the argument in that case
        // make another function (helper function)
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n; // if 1 digit no
        }
        int r = n % 10; // remainder
        return r * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);


    }

    public static void main(String[] args) {
        // int ans = reverse(1284);
        int ans = reverse2(1234);
        System.out.println(ans);
    }
}
