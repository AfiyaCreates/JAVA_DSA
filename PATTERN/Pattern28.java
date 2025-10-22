public class Pattern28 {
    //imp
    // understand space part
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
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
