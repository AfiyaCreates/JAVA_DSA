//find xor of no from 0 to a...understand ***
//xor means exclusive 0 xor 1 = 1...1 xor 0 = 1 ...baki sb is 0

//a xor(0toa)
//0 0
//1 1 (0 xor 1)
//2 3(0 xor 1 xor 2)...(1 xor 2(10) = 11 = 3)
//3 0(0 xor 1 xor 2 xor 3)...(3 xor 3 =0)
//4 4(0 xor 4 =4)
//5 1 (4 xor 5 = 100 xor 101 = 001)
//6 7

//we see the pattern ...xor from 0 to 8 are - 0 1 3 0 4 1 7 0
//0 xor 0 =0
//4 xor 4 =4
//8 xor 8 = 8

//so ..
//if a%4=0...xor of a = a
//if a%4=1...xor of a = 1
//if a%4=2...xor of a = a+1
//if a%4=3...xor of a = 0



public class Q15 {
    public static void main(String[] args) {
        
    }
}
