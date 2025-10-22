package com.company.staticex;

public class Main {
    public static void main(String[] args) {
        //  Person obj1 = new Person (13,"afiya",50000,true);   //creates obj for other class which is in same package 
        //  Person  obj2 = new Person (23,"alisha",90000,false);   //creates obj for other class which is in same package 
        // System.out.println(obj1.name);
        // System.out.println(obj2.salary);

        // // System.out.println(obj1.population); //2 ...if u dont use static it gives 1
        // // System.out.println(obj2.population); //2

        // System.out.println(Person.population); //2 ... it works same but better to access using class name 
        // System.out.println(Person.population); //2

       // hello(); // cannot access non static data ..so declare the method hello as static 


    }

    //something which is non static belongs to an obj
    void hello(){
        System.out.println("hello good morning ");
        fun();
    }
    static void fun(){
       // hello(); //cannot use bcoz this requires an instance 
    }
    
}
