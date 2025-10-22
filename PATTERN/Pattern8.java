public class Pattern8 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");

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
// imp question understand concept