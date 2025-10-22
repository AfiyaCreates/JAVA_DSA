public class Pattern25 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=9;k>=2*i-1;k--)
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
