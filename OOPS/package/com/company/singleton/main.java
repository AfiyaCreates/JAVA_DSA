package com.company.singleton;

public class main {
    public static void main(String[] args) {

        // singleton obj = new singleton(); // it wont work since we declared it as static 

        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        
        // all 3 ref variable point to just one same obj 


    }
}
