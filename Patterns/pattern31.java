//up = row or i
//down = n- row
//left = col or j
//right = n-col
//min of all of these is the ans

public class pattern31 {
    static void pattern31(int n){

        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int ans = Math.min(Math.min(i, j),Math.min(n-i,n-j));
                System.out.print(ans + " ");
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern31(4);
    }
}
