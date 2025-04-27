
public class sum_of_n {

    static int sum(int n){   //since func is returning an int 
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);  //we hv to return the func call as well
    }
    public static void main(String[] args) {
       System.out.println(sum(4)); 
    }
}
