//calculate a^b 
//eg - 3^6 = 3*3*3*3..
//nhi smj aya ...understand this once again ***
//n = 110
//n&1 = 0...now n>>1...n=11
//n&1 = 1...now n>>1..n=1
//n&1 = 1 ...now n>>1 ..n=1
//n>>1= 0

//let ans = 1(initially)
//ans = ans*base

public class Q13 {
    public static void main(String[] args) {

        int base = 3;
        int power = 6;
        int ans = 1;
        while(power>0){
            if((power & 1 )==1){
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
        
    }
}
