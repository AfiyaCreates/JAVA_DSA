//given a no find the no of set bits in it 
//1 are set bits 
//eg - 9 = 1001 - set bits = 2

//one method is to take a counter and keep doing right shift until it becomes 0 
//while(n>0) - if (n&1==1) - c++ - n = n>>1

//or

//n & -n = gives us right most set bit ....so do n - [n&-n]...until n=0
//eg - n = 1001....n&-n = 0001
//if we do n - [n&-n] = 1000...count =1
//again n - [n&-n] = 0 ...count =2

//or

//do n & n-1
//eg - n = 1001....n-1 = 1000.....n&n-1 = 1000...count = 1
//n becomes = 1000...n-1 = 111....n&n-1 = 0 ...count = 2
//no of set bits = no of iterations

public class Q14 {

    static int setBits(int n) {
    //    int count = 0;
    //     while (n > 0) {
    //         count++;
    //         n = n - (n & -n);
    //     }
    //     return count;

        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n)); //gives us the binary
        // representation of a no n
        System.out.println(setBits(n));

    }

}
