public class pattern28 {

    static void pattern28(int n){
        for (int i = 1; i <= 2*n-1 ; i++) { //consider 2n-1  rows eg- n=5...rows=9 
            int cols= i>n ? 2*n-i:i; //checks if i>n 3 eg when lower part starts...then col will be 2*n-i....eg for i=6..j=4

            int spaces = n-cols; //n-i fo upper part ...n- 2*n-i for lower part
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }

            for (int j = 1; j <=cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern28(5);
    }
}
