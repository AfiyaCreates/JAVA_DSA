//whenever subsets substring type of question comes ...use the processed and unprocessed method which we learnt before
// in this we have to return the possible letter combinations of a phone no ....
//eg - press 2 once u get a twice u get b thrice u get c 
// similarly if u press 3 once u get d twice u get e thrice u get f
// possible combinations for  "23" will be - ad ae af bd be bf cd ce cf 
//understand how these combinations are taking and leaving something
// now how to convert to ascii value ...we know "a"+ 1 = b...etc
//eg - for 2 range of alphabets no goes like ...def..are 345...this range can be written as 
//[(digit-1)*3 , digit*3)...so for digit 2(def)...its like 345 ..(here digit*3 is not included its exclusive )
//a + index = char
// int a = ch - '0' to convert a charto int remember 
// can use loops in recursion function

import java.util.*;

public class letter_combinations {

    // static void letter(String str, String ans) {
    //     if (str.isEmpty()) {
    //         System.out.print(ans + " ");
    //         return;
    //     }
    //     int digit = str.charAt(0) - '0';// this will convert '2' to 2
    //     for (int i = ((digit - 1) * 3); i < digit * 3; i++) {
    //         char ch =  (char)('a'+ i);
    //         letter(str.substring(1),ans+ch); //since we write this inside loop so before i++..it moves to next digit ...then comes back to this digit and prints for i++
    //     }
    // }

    // to return an array list

     static ArrayList<String> pad(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String>list = new ArrayList<>();
            list.add(ans);
            return list; //this returns subset answers
        }
        ArrayList<String> letter = new ArrayList<>();
        int digit = str.charAt(0) - '0';// this will convert '2' to 2
        for (int i = ((digit - 1) * 3); i < digit * 3; i++) {
            char ch =  (char)('a'+ i);
            letter.addAll(pad(str.substring(1),ans+ch));//since we write this inside loop so before i++..it moves to next digit ...then comes back to this digit and prints for i++
        }
        return letter ; //this returns final answer

    }

    public static void main(String[] args) {
        String str = "12";
    //   letter(str, "");
    System.out.println(pad(str, ""));

    }
}
