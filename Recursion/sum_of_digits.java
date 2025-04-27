//eg - n = 3245 = 3+2+4+5
// sum = remainder + f(no remaining)....= n%10 + f(n/10)
//r = n%10;
//n = n/10;

//similarly we can do for product ..but in base case..it will be 
//if(n%10==n)..return n ....that is when only 1 digit remaining

public class sum_of_digits {

    static int sum(int n){
        if(n==0){
            return 0;
        }
        int r= n%10;
        n = n/10;
        return r + sum(n);
    }
    public static void main(String[] args) {
        int ans = sum(3412);
        System.out.println(ans);
    }
}
