//with string objects + operator is used with the help of overloading  
//java does not support operator overloading ...only it allows in string but that too we cant do by our own explicitly
// note-represent char usimg single quotes
//char converts to ASCII values ...but strigs do not convert to its ASCII values
// + is only defined for primitives or any one of the value is string
import java.util.*;
public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//it convetrs char into int values and adds them ASCII 
        System.out.println("a"+ "b");//it simply concats the string 
        System.out.println('a' + 3);//returns 100..97 + 3 = 100.
        System.out.println((char)('a' + 3));//returns d...97+3-100...which is d
        System.out.println("a"+ 'a' ); //aa

        //integer will be converted to Integer ..that will call toString()
        System.out.println("a"+ 1);//returns a1...it simply concats the string
        System.out.println("afiya"+ new ArrayList<>()); // afiya[]
        System.out.println("afiya"+  new Integer(56)); // afiya56

        // + is only defined for primitives or any one of the value is string
        // System.out.println(new Integer(56) + new ArrayList<>()); // error
         System.out.println(new Integer(56) +"afiya"+ new ArrayList<>()); // this will work ...since atleast one of them is string

    
    }
}
