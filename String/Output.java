//internally println method converts the values to string using .....toString()
import java.util.Arrays;
public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("kiyo");
        System.out.println(new int[] {1,2,3,4,5}); //generates random values
        //but if obj is null so obj.toString...null.toString ...error ...creates an exception ***null pointer exception 
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5})); //returns arr..bcoz it uses function overriding ...using Arrays.toString 

        // String name =null;
        String name=null ;
        System.out.println(name);//returns null ...bcoz we have not stored any value as string in name ...by default it returns null
    }
}
