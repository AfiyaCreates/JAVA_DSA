public class pattern17 {
    static void pattern17(int n){

        for(int i=1;i<=2*n-1;i++){ //since both upper and lower part loop goes 2n-
            
            int cols =i>n?2*n-i:i; //otherwise cols =i

            for(int k =0;k<=n-cols;k++){  //space 
                System.out.print(" ");
            }
            for(int j=cols;j>=1;j--){
                System.out.print(j); //left ...customize coz start acc to col 
            }
            for(int j=2;j<=cols;j++){
                System.out.print(j);  //right...go to that col
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern17(4);
    }
}
