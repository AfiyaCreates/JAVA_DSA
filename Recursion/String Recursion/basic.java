//dont include all methods in notes just the star ones 

// remove the a from the string ..eg- baccad to bccd
// again 2 approaches 
// pass the string in argumement
//create ans in func body
//always remember in recursion a function returns to from where it was called

public class basic {

   //using i  
    // static String remove_char(String str, int i) {
    //     if (i == str.length()) {
    //         return "";
    //     }
    //     if (str.charAt(i) == 'a') {
    //         return remove_char(str, i+1);
    //     }
    //     return str.charAt(i) + remove_char(str, i+1);
    // }

    //by returning string using argument ***
    // static void remove_char(String str,String ans) {
    //     if (str.isEmpty()) {
    //         System.out.println(ans);
    //         return ;
    //     }
    //     char ch = str.charAt(0);
    //     if (ch == 'a') {
    //        remove_char(str.substring(1),ans); // calls a new string that excludes the first character of str...for next call 
    //     }else{
    //          remove_char(str.substring(1), ans + ch); //if char wasnt a then add to ans with next call for new str with removed char at 0...substring from 1 index
    //     }
    // }


    // by returning string (add in body )****
    static String remove_char(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return remove_char(str.substring(1)); // returns a new string that excludes the first character of str...for next call 
        }else{
            return ch + remove_char(str.substring(1)); //if char wasnt a then add to new str with next call for new str with removed char at 0
        }
    }


    public static void main(String[] args) {
        String str = "baccad";
        // remove_char(str, 0);
        // System.out.println(ans);

        // System.out.println(remove_char(str, 0));

        // remove_char(str,"" );


        System.out.println(remove_char(str));


    }
}