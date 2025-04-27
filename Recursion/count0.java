//method 1 - passing count in the argument ..initily (n,0)
// after each call if 0 found then -> (n/10,c+1)...else(n/10,c)
//eg - n=30204 c=0...(n,c)..(30204,0)..(3020,0)..(302,1)...(30,1)...(3,2)..(0,2)...ans = 2

public class count0 {

    static int count_zero(int n){
        return helper(n,0);  // initially sets  c=0
    }

    static int helper(int n, int c) {
        int r = n % 10;
        if (n == 0) {
            return (c == 0) ? 1 : c; // If input n was 0, count it as one zero...otherwise return the c
        }

        if (r == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }

    }

    public static void main(String[] args) {
        System.out.println(count_zero(30204));

    }
}
