
//ASCII values
//A=65 a=97 0=48
//97-65=32
// to get the ascii avlue .....int ascii = (int) ch;
//for strings
// str = str.substring(0, i) + letter + str.substring(i + 1);
//for string builder
//str.setCharAt(i, letter);

//type casting int back to char
// char letter = (char) ascii;



import java.util.*;

public class toggle {
    public static void main(String[] args) {

        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);

        // using string builder

        // StringBuilder str = new StringBuilder(sc.nextLine());
        // System.out.println(str);
        // // check if letter is capital or small
        // for (int i = 0; i < str.length(); i++) {
        // boolean capt = true;
        // char ch = str.charAt(i);
        // if (ch == ' ') {
        // continue; // dont consider space
        // }
        // int ascii = (int) ch;
        // if (ascii >= 97) {
        // capt = false;
        // }

        // if (capt) {
        // ascii = ascii + 32;
        // char letter = (char) ascii;
        // str.setCharAt(i, letter);
        // } else {
        // ascii = ascii - 32;
        // char letter = (char) ascii;
        // str.setCharAt(i, letter);
        // }
        // }
        // System.out.println(str);

        // using string

        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == ' ') {
                continue; // dont consider space
            }
            boolean capt = true;
            int ascii = (int) ch;
            if (ascii >= 97) {
                capt = false;
            }

            if (capt) {
                ascii = ascii + 32;
                char letter = (char) ascii;
                str = str.substring(0, i) + letter + str.substring(i + 1);
            } else {
                ascii = ascii - 32;
                char letter = (char) ascii;
                str = str.substring(0, i) + letter + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }
}
