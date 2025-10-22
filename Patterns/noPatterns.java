public class noPatterns {

    static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // pattern 5

    //using 2 loops

    // *** eg - n=5...lines total = 9
    // static void pattern5(int n) {
    //     // upper part
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     // lower part
    //     for (int i = n - 1; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    //using 1 loop and formula

    static void pattern5(int n) {
      
        for (int i = 1; i <= 2*n-1 ; i++) { //consider 2n-1  rows eg- n=5...rows=9 
            int cols= i>n ? 2*n-i:i; //checks if i>n 3 eg when lower part starts...then col will be 2*n-i....eg for i=6..j=4
            for (int j = 1; j <=cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // pattern4(5);
        pattern5(5);

    }
}
