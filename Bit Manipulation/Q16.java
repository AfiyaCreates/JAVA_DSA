// xor of all no between a and b 
//eg - a = 3 and b = 9
//find 3 xor 4 xor 5 xor 6 xor 7 xor 8 xor 9
//using the 4 conditions we saw in previous ques its easy to find -
// 0 xor 1 xor 2 xor 3 xor 4 xor 5 xor 6 xor 7 xor 8 xor 9....so the extras are 0 xor 1 xor 2 
//so if we xor above array again with 0 xor 1 xor 2 ...it will be removed (since a xor a =0)
//the xtras are 0 to a-1

//ans = xor (0 to b) xor(0 to a-1)
//xor(b) ^ xor(a-1)

public class Q16 {

    static int xor(int a){
        if(a%4==0){
            return a;
        }
         if(a%4==1){
            return 1;
        }
         if(a%4==2){
            return a+1;
        }
         if(a%4==3){
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a =3;
        int b =9;
        int ans = xor(b)^xor(a-1);  //xor is function ....while ^ is symbol of normal xor between 2 no 
        System.out.println(ans);

        
    }
    
}
