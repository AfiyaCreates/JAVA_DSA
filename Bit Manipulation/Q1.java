//given a no find if its odd or even 
//every no is calculated in binary form internlly
//eg - 12+7 = 1100 + 0111 (internally) = 10011 = 19 .....we write it as 2^4*1 + 2^3*0 + 2^2*0 + 2^1*1 +2^0*1  = 16+2+1
// we know - 10011 ...1001 will always be even since its in the power of 2..while 1 is 2^0
//so , if 2^0 place = 1 - odd....if 2^0 place = 0 - even
// we know when we add a no with 1 the digitd remain same ...so 
//100101 + 000001 = if 1 then odd else even 
//n&1==1 odd...else even 

//the last bit ...is known as lsb (least significant bit)



public class Q1 {

    static boolean isOdd(int n){
        return (n&1)==1; //returns true if odd

    }
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));

    }
    
}
