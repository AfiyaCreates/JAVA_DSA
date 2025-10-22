//outside classes cannot be stacked ...eg we cannot stack class named innerclass...only inner classes can be static so test can be  static 
// we can simply use n oter class (non static) with its obj 
// but for inner class it has to be static to use its obj 

package com.company.staticex;

public class innerClass{


    static class test{
        String name ;
        public test(String name){ //constructor
            this.name = name ;
        }

    }

    public static void main(String[] args) {
        test a = new test ("afiya");  //error coz we cannot have non stati in a static (since class is non static so its constructor wont work )
        test b = new test ("zarah");  // bcoz the class test is itself dependent on outer class and no obj ...so make it staic 
       System.out.println(a.name);
       System.out.println(b.name);
        // this prints afiya zarah....bcoz this static class is not dependent on obj of outer class ..(but it can hv its own obj so it behaves dependent on its obj ) ...but if we use test as outide class (static)  it prints zarah zarah  

    }
}