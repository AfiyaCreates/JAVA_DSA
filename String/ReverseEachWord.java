// s.trim().split("\\s+"); // Split on one or more spaces
import java.util.*;

public class ReverseEachWord {

    static void reverse(String str) {

        String [] words = str.split(" "); //store the splitted string in string array
        StringBuilder result = new StringBuilder();
        for (String s : words) {
        StringBuilder sb = new StringBuilder(s);  //will create string builder sb for every s in words 
          result.append(sb.reverse().append(" ")); //will reverse each word and add to new  result string builder....add space after each word 
        }
        // str.reverse();
        System.out.println(result.toString().trim()); //convert sb to string and trim to remove trailing spaces 

    }

    public static void main(String[] args) {
        String str = "afiya is a good girl";
        reverse(str);
    }
}
