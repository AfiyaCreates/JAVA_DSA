// find no of digits in base b
// eg - 6 in base 2(binary) has 3 digits ....6 = 110 (3 digits)

// one method is keep ding right shift until u get no = 0 
//other method is formula - int(logb^n) + 1 (base is b no is n) = no of digits in base b of no n
public class Q10{
    public static void main(String[] args) {
        int n = 34567;
        int b = 10; //(want to know no in decimal)

        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }

}