//static - the properties like populaion which are not logically related to the obj (human - obj1 or 2)..are set as static 
// a static member can be accessed before any of the obj of the class is created ...we can access it without obj just by class name...they are independent of obj 
// we can create static methods and variables both
// why psvm (main func) is declared as static?....it means we can use main method without creating obj of that class
// in order to run anything inside a class we hv to create an obj nut main func is first thing to run so no need to create its obj if we declare it static
//inside a static method we cannot use  anything that is non static ...thats why in a class whenever we create a method we declare it static so that we can use it inside main 
// staic is independent of obj ...non static depends on object (requires an instance var)
//so we cannot use non static in static.....without any obj referene
//but can use a static member inside a non-static one
// we cannot use this keyword inside a  static method ...bcoz this represents an obj and static does not depend on obj 
package com.company.staticex;

public class Person {
    int age;
    String name;
    int salary;
    boolean married;
   static  long population;  // it does not exist in obj but it exists in class as it is common to all

   static void message(){
    System.out.println("hello i am afiya");
   // System.out.println(this.age); // cannot use this 
   }

    public Person(int age,String name , int salary ,boolean married){
        this.age = age;
        this.name = name;
        this.salary=salary;
        this.married=married;

        Person.population+=1;  // since it does not depend on obj n need to use this..so we use class name .coz its class sepecific
    }
    
}
