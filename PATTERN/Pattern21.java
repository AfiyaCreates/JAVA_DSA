public class Pattern21 {
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--)
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
