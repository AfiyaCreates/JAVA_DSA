// Abstract class - sometimes we want a parent class that tells us what to do but not how to do..the parent class will jyst give a generalized form and not the body 
// Abstract methods - the method it uses withjust the name and not the body 
// so we want to ensuree that the child class overrides all  these  abstract methods to provide its own body
// use abstract keyword 
// the class that contains one or more abstract methods must be declareed as an abstract class
// we cannot create an object of the abstract class 
// we can create a constructor , a variable in abstract class like how we normally do 
// so since we cannot create obj of abstract class we use its constructor to be used in its childer by super()...but we cannot access its constructor uing its obj 
// only abstract class and methods ...no abstrcat constructors ..no abstract static methods ..coz static methods cannot be overriden so no sense..etc
// but we can create static methods in abstract classes..since no obj we can call it using class name (what we donin static usually)- parent.greeting()
// parent class can contain normal methods ...which can be overriden by the child classes
// no object but we can use parent as ref - parent obj = new child()...like how we do normally
// we cannot have a final abstract class bcoz it prevents it from being inherited
// we can have static and final variables though

// multiple inheritance suing anstract classes - still not possible...so we have interfaces
public class Main{
    public static void main(String[] args) {
        Son son = new Son(5);
        son.career();
        son.partner();

       Daughter daughter = new Daughter(15);
       daughter.career();
       daughter.partner();

       Parent.greeting();

    }
}