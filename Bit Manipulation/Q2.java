// an array every no appears twice and only one no appeaes once ..return that no- 2,3,4,1,2,1,3,6,4=6
//either we can sort and do this 
//remember bitwise opearators also follow associative property..so order doesnt matter
//we know any no xor with itself is 0 - a xor a = 0 ...while a y no xor 0 is thta no - a xor 0 = a
//xor all the no of array

//similarly Q3
//if array with a no and its negative ..identify the only no  present without its negative - -2,3,2,4,-5,5,-4
//adfd all these ..similar but do addition instead of xor

// ^ for xor

public class Q2 {

    static int FindUnique (int[]arr){
        int unique = 0;
        for(int no : arr){
            unique ^= no; //xor no 
        }
        return unique;

    }


    public static void main(String[] args) {
        int[]arr = {2,3,3,4,2,6,4};
        System.out.println(FindUnique(arr));
    }
}
