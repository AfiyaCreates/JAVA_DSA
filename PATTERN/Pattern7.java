public class Pattern7 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j +" ");

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
// in order to print in decreasing order interchange initialisation and condition part and decrement the variable--