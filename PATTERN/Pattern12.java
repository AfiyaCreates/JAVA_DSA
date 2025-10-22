public class Pattern12 {
    public static void printPattern(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
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
// for approach see row me print kya ho rha h and kisse ho rha h j or i
// for this print 54321 then 4321 ..
// j is printing bcoz value is repeating column wise .so initial value is changing..last value is 1 only that means it goes from i-1
// acc to it we decide value of i 