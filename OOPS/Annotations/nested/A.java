//nested interfaces
//interface inside a class
//to implementwrite as class_name.interface_name

// the difference is 
// nested interface can be public private or protected
//but top lever interface has to be declared public or default
package nested;

public class A {

    // nested interface
    public interface nestedInterface {

        boolean isOdd(int num);

    }

}

class B implements A.nestedInterface {
    @Override
    public boolean isOdd(int num){
        return (num & 1)==1;
    }

}


