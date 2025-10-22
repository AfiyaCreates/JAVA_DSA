public class Pattern3{
    public static void printPattern(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+" ");

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
