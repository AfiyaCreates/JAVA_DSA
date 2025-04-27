//n-- and --n are different 
//n-- will first pass the valueof n and then subtract it n--
//--n subtract first and then pass

public class concept {

    static void fun (int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(n--);  // will keep on printing 5....
        fun(--n);
    } 
    public static void main(String[] args) {
        fun(5);
    }
}
