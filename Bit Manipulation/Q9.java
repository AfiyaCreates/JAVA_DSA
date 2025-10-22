//find the n th magic no 
//   5^3  5^2  5^1 =  magic no
//1 - 0    0    1 = 5
//2 - 0    1    0 = 25
//3 - 0    1    1 = 30 (5+25)
//4 - 1    0    0 = 125
//5 - 1    0    1 = 130 (125+5)

//to find the n th magic no - eg for 6
//convert in binary = 110
// n&1 = this will give the last bit
//ignore it - so take right shift 
//n>>1 
// so take - n&1 and n>>1 in loop
//n&1 - gives 0 ...do 0*5^1..right shift 
//n&1 - gives 1...do 1*5^2 ...right shift
//n&1 - gives 1...do 1*5^3 ...right shift
//0



public class Q9 {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while(n>0){
          int last = n&1;
          n= n>>1;
          ans+=last*base;
          base= base*5; //this increases the power of 5 ...5^0 5^1 5^2
        }

        System.out.println(ans); //150 for 6 
    }
    
}
