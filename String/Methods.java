// strings internally work like a char array
//.charAt()
//.toString()

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String a = "Kiyo is my pet ";
        System.out.println(Arrays.toString((a.toCharArray())));
        System.out.println(a.charAt(3));
        System.out.println(a.toLowerCase());
        System.out.println(a.indexOf('y'));
        System.out.println(("      Kiyo   ").strip());
        System.out.println(Arrays.toString(a.split(" " )));  
    }
}
