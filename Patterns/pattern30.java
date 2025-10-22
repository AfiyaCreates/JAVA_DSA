//pattern30***
public class pattern30 {
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            for(int k =0;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern30(5);
    }
}
