// outer loop - no of rows
//inner loop - no of cols for each row ....and type of element in col
//what u need to print
//n is mostly  the largest no in the pattern 

public class basic{

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);


      
    }
}