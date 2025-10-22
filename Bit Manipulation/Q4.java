//find i th bit of a no 
//and (add) that position no with 1 ...u get that digit 
//10110110 ..and with 00010000 (mask)..to find digit at 5 position (fron right starting with 1)
//this no which we are doing  and with is known as mask 

//how to get mask bit - for n length no ... mask bit has n-1 zeroes
//1<<(n-1) ...left shift 
//eg - for 00010000..10000....1<<4 = 10000...can be written as 00010000

//ans = n & (1<<(n-1))
//check whats n here

//Q5- set the i th bit .. 0 to 1 ..or if 1 to 1
//if 0 - when we or any no with 1 ...gives 1....1010110 or 0001000...see vid notes


//Q6- reset the i th bit ...1 to 0 ...or 0 to 0
//if we and any no with 1 - same no ...if we and any no with 0 - opp of that no 
//so , add every no with 1 but the i th bit with 0 
//eg - 1010110 + 1101111  (to reset 5 th bit)  = 1000110
//to get this mask take.... complement of (1<<(n-1)) 

public class Q4 {
    public static void main(String[] args) {
        
    }
}
