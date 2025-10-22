//given a no find if its power of 2 or not 
//onlly one 1 should be there rest everything must be zero 
//eg- 10000
//we know we can represent = 10000000 =  1111111+1
//so if we take 10000000 and 01111111=0 (means power of 2)...else false 
//eg- 10010 & 01111 =00010..not 0 so nor in powwer of 2 
//so , if n & (n-1) = 0 ...it is power of 2 


public class Q12 {
    public static void main(String[] args) {
        //note - fix for n ==0
        int n = 32;
        boolean ans = (n & (n-1)) ==0;
        System.out.println(ans);
        
    }
}
