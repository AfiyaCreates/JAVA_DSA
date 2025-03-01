
//abcdcba
//take 2 pointers ...can also do by reversing and then comapring string 
// go through half of array to check 
import java.util.*;

public class Palindrome {

    // method 1

    // static boolean isPalindrome (String str){
    // str = str.toLowerCase();
    // if(str == null || str.length()==0){
    // return true;
    // }
    // for (int i=0;i<=str.length()/2;i++){
    // char s = str.charAt(i);
    // char e = str.charAt(str.length()-1-i);
    // if(s!=e){
    // return false;
    // }
    // }
    // return true;
    // }

    // method 2

    // static void isPalindrome (String str){
    // str = str.toLowerCase();
    // int i =0;
    // int j = str.length()-1;
    // boolean flag = true;
    // while(i<j){
    // if(str.charAt(i)!=str.charAt(j)){
    // flag=false;
    // break;
    // }
    // i++;
    // j--;
    // }
    // if(flag==true){
    // System.out.println("is palindrome");
    // }
    // else{
    // System.out.println("not palindrome");
    // }
    // }

    // method 3
    
    // static void isPalindrome (String str){
    // StringBuilder gtr = new StringBuilder("abcdcba");
    // gtr.reverse();
    // String s = gtr +""; // bcoz cant compare string and sb directly
    // if(str.equals(s)){
    // System.out.println("true");
    // }
    // else{
    // System.out.println("false");
    // }
    // }

    // static void isPalindrome (String str){
    // StringBuilder str = new StringBuilder("abcdc");
    // String s = str.toString(); //convert str to string
    // String g = str.reverse().toString(); //reverse str and convert to string
    // if(s.equals(g)){ //compares 2 strings
    // System.out.println("palindrome");
    // }else{
    // System.out.println("not palindrome");
    // }
    // }

    public static void main(String[] args) {
        String str = "abcdcba";
        // System.out.println(isPalindrome(str));
        // isPalindrome(str);

    }
}
