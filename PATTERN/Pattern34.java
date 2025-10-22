public class Pattern34 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i ;k++)
            {
                System.out.print(k);
            }
            for(int k=i-1;k>=1;k--){
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
