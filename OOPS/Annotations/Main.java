// we can provide default implementations to interface in java
//see more points on this (notes of kunal k )
// its not a part of annotation alg se topic h 

// remember in general for overriden methods the access specifier should be same or better that of in parent class (but not lower)
//eg method is protected in parent ..can be public in child (but not private)

public class Main implements A, B {

    @Override
    public void greet() {

    }

    // if we dont provide any implememtation for the method fun() of A ( default
    // implementation will gt displayed )

    public static void main(String[] args) {

        A.hello(); // static method is called using class name(interface name)

    }

}