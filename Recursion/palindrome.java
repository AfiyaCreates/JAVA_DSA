public class palindrome {

    // to check for palindrome
    static boolean palindrome(int n) {
        return n == rev(n);
    }

    // just to get the digits
    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    // to actually reverse the no..called recursively
    // helper(n / 10, digits - 1)....to call the same for the remaining no 
    private static int helper(int n, int digits) {
        if (n % 10 == 0) {
            return n;
        }
        int r = n % 10;
        return r * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }
}
