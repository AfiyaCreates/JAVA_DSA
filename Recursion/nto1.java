//print no n to 1

public class nto1 {
    static void fun(int n){
        if(n==0){ //base condition
            return;
        }
        System.out.println(n);
        fun(n-1); //no need to return this subfunc call since already printing ans
    }
    public static void main(String[] args) {
        fun(5);
    }
}
