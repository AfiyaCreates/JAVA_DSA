public class Pattern16 {
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
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
