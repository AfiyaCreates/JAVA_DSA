public class Pattern19 {
    //imp
    //understand the concept of space loop that is j
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
// in left patterns only 2 loops enough
//but in right side patterns 3 loops one for space