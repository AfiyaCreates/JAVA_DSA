//see ss
//String- is class...everything that starts with a capital letter is a class in java
//every string that we create is an obj of type string
//string a = "afiya khan".....string b = "afiya khan"...then both a and b in stack will point to a pool in heap which contains the name afiya khan
//the pool is used to create a separate portin in heap which store similar elements ... interning is the prob bcoz of which we use immutability

// a special part of memory that is set aside to hold String literals.
//strings are immutable ..its obj value cannot change...renaming creates a new obj
// strings are not mutable bcoz of security reasons

//immutability of strings ...can change the reference but cannot hng the exact string itself
//str.charAt(2)='a'   wrong...cannot be changed

import java.util.*;
public class Main{

 public static void main(String[] args) {
    // int[]arr={2,3,5,4,18};
    // int b=10;
    // String name = "afiya khan";
    // System.out.println(name);

    // String a = "kiyo";
    // System.out.println(a);
    // a = "cookie";
    // System.out.println(a);
    // }

    Scanner sc = new Scanner (System.in);
    System.out.println("enter name");
        String a = sc.next(); //to take string as input....print hello
        System.out.println(a);
        String b = sc.nextLine();//print hello world
        System.out.println(b);   

}
}

