//polymorphism ...poly - many ...morphism - forms (ways to represent)
//types - static(compile time) - method overloading 
// same name but type ,arg ,return type,order...can be diff...eg - multiple constructors
// complite time - coz hen it determines which consructor or method to call
//   dynamic(runtime)- method overriding...when parent class and child clas have same method but body is diff
//inheritance is required in over riding

//in overriding for the case...parent obj = new child()...which method will b called depends on child...this is known as upcasting
// but how java determines this ?...using dynamic method dispatch
//when a overriden func is called through a super class ref variable..java determines which version of that method to call based on the type of the obj..at runtime
//but its ref depends on parent class so parent class muat have that similar func (with diff body)

// final - we can use final keyword to avoid overriding...if we put final to a method we cannot override it
//we can also use it to prevent inheritance
// when we put' a class as final ...implicitly it decalrs its methods as final
// do early binding and late binding concept too...see kk notes

// can we override static methods?- no 
// static methods are independent of obj and depends on class ...so the method in parent class will always run 
//it can be inherited ..but cannot be overriden 
package polymorphism;

public class shapes {

//    final public void area( ){
//         System.out.println("i am in shapes");
//     }

     public void area( ){
        System.out.println("i am in shapes");
    }
    
}