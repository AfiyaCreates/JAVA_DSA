public class Pattern30 {
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int k=2*n-1; k>=2*i-1 ;k--)
            {
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
