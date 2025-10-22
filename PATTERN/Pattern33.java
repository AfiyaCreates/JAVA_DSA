public class Pattern33 {
    //imp
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int k=5; k>=i ;k--)
            {
                System.out.print(k);
            }
            for(int k=i+1;k<=5;k++){
                System.out.print(k);
            }

           System.out.println();
        }
    }
    public static void main(String[]arg)
    {
        int n=5;
        printPattern(n);
    }       
}
