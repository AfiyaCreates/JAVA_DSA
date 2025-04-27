//fact(n)=n*fact(n-1)
//fact(1)=1

public class factorial {

    static int fact(int n){   //since func is returning an int 
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);  //we hv to return the func call as well
    }
    public static void main(String[] args) {
       System.out.println(fact(4)); 
    }
}
