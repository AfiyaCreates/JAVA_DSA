//comparisons of strings
//==.....checks if reference var points to same obj...if variables point to same obj=true 
//.equals()...when u only need to check values not obj 
//how to create diff obj of same value..use new keyword...creates values outside pool but in same heap
public class Comparison {
    public static void main(String[] args) {
        //var points to same obj
        String a= "afiya";
        String b= "afiya";
        String c= a;
        System.out.println(a==b);//true bcoz both reference to same obj in pool
        System.out.println(c==a);//true bcoz both reference to same obj in pool

        //var points to diff obj
        String x = new String("khan");
        String y = new String("khan");
        System.out.println(x==y);//false bcoz both reference to diff obj ...creates values outside pool but in heap
        System.out.println(x.equals(y));//true

       
      


     
    }
}
