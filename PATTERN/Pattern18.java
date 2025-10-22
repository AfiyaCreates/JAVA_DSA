public class Pattern18 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
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
