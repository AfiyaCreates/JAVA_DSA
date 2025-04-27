//subsets amay or may not be  adjacent collections
//permutations and combinations
//eg - 359...3 35 39 359 5 59 9  
//this pattern of taking some elements and removing some is known as this subset pattern
// subset methods says take it or ignore it ..start with an empty ans string and the given string 
//see ss

import java.util.ArrayList;

public class subseq {

    // static void seq(String str,String ans){
    //     if(str.isEmpty()){
    //         System.out.println(ans);
    //         return;
    //     }
    //     char ch = str.charAt(0);
    //     seq( str.substring(1), ans + ch); //taking the char..so ans + ch
    //     seq(str.substring(1), ans);//not taking the char..so ans
    // }

    // to add it to an array list*** understand this again
     static ArrayList<String> seq(String str,String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);//left right is acc to tree diagram 
        ArrayList<String> left = seq( str.substring(1), ans + ch); //taking the char..so ans + ch
        ArrayList<String> right = seq(str.substring(1), ans);//not taking the char..so ans

        left.addAll(right); // concatenates both the array lists 
        return left;
    }
   

    public static void main(String[] args) {
        String str = "abc";
        // seq(str, "");

        System.out.println(seq(str,""));
        
    }
}
