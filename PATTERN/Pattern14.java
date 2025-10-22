public class Pattern14 {
    // right staircase problem (using if else)
    //solve using nested for loops too
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<n-i-1){
                 System.out.print(" ");
                }else{
                    System.out.print("*");
                }

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
