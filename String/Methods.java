// strings internally work like a char array
//.length()
//.charAt()
//.charArray()
//.toString()
//.indexOf()  returns the index of first occerence of a char 
//compareTo()..if str1==str2 ..returns 0   if str1>str2..returns positive no   if str1<str2..returns negative no
//the no it returns is not random but the no ...the difference between the letters ..eg:  a=hello b=kdllo....while comparing h i j k ..difference between h and k is 3 so it returns -3
//.contains()
//.startsWith()
//.endsWith()
//.toLowerCase()
//.toUpperCase()
//.concat()
//.strip()
//.split()


//substring(i,j)   or substring(i)

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String a = "Kiyo is my pet";

        // System.out.println(a.length());

        // System.out.println(Arrays.toString((a.toCharArray())));
        // System.out.println(a.charAt(3));
  
        // System.out.println(a.indexOf('y'));

        // String str1 = "stella";
        // String str2 = "stella";
        // System.out.println(str1.compareTo(str2));

        // System.out.println(("      Kiyo   ").strip());

        System.out.println(Arrays.toString(a.split(" " )));  

        String k = "kolkata";
        // System.out.println(k.contains("kata")); //true

        // System.out.println(a.toLowerCase());

        // System.out.println(str1.concat(a));

        System.out.println(k.substring(5)); //starts from  5 to string length
        System.out.println(k.substring(0,3));//does not include end index element 



        


    }
}
