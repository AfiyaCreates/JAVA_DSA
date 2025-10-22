public class Pattern23 {
    //imp to build concept 
    // stars are like 1 3 5 7 9 ..
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
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
