package com.company.singleton;

//singleton class- a class which only contain one obj 
//whenwver we call a constructor new obj is created but we dont want to allow to use a constructor...so we make it private 
//we cannot access it in any other package or file
//understand it how it works ..see notes on github of it bybkunal kushwaha
public class singleton {

    private singleton(){ //since its private we can run t only in this class 

    }

    private static singleton instance;

    public static singleton getInstance(){
        //check whether only 1 obj is created or not 
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        
    }
}
