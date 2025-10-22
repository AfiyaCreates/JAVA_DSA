public class Pattern26 {
    // imp concept 
    // uses 3 for loops inside one for loop 
    // j for space .first k for printing no  from 1 .second k for printing no from i-1 
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
                System.out.print(k);
            }
            for(int k =i-1; k>=1;k--)
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
