// given n=5...print 1 2 3 4 5
//so first the func calls sub functionand then prints
//eg- fun(5)..calls fun(4)..and then prints 5 when fun(4) is completed
//but fun(4)..calls fun(3)..and then prints 4. when fun(3) is completed..continues 

public class print_1ton {
    static void fun(int n){
        if(n==0){ //base condition
            return;
        }  
        fun(n-1); //no need to return this subfunc call since already printing ans
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
