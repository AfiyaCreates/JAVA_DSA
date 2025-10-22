//initialisation of sttaic variables
//a static block gets executed at exactly once ...when the first obj is create for the block ...i.e. when the class is loaded for thr first time 

package com.company.staticex;

public class staticBlock {

    static int a=4;
    static int b;

    static { // static block 
        System.out.println("i am in static block");
        b = a*5;
    }
    public static void main(String[] args) {
        staticBlock obj = new staticBlock(); // runs once ...prints i am a static block and a ,b values 
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b+=3; 
        staticBlock obj2 = new staticBlock();//when second obj is created for the same block 
        System.out.println(staticBlock.a + " " + staticBlock.b); //prints a b but does not run the same lock again 

    
    }
}
