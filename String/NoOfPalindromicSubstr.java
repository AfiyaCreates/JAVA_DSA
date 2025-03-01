//str and gtr = str.reverse()
//str.equals(gtr)...palindromic
// eg - abc...substrings are .a ab abc b bc c
//palindromes are - a b c...total 3
//to avoid repetition we can use hashmap

import java.util.*;

public class NoOfPalindromicSubstr {

    static boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int subString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                if (palindrome(str.substring(i, j + 1))) {
                    System.out.println(str.substring(i, j + 1));
                    count++; // if palindrome==true increments the count var
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = "abbd";
        System.out.println(subString(str));

    }

}
