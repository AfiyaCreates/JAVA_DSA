
package polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        triangle triangle= new triangle();
        square sq = new square();

        shape.area();// will call shape method
        circle.area();//will call circle method..means it has overriden the same metho of parrent class

        shapes sq2 = new square(); // (***)
        sq2.area(); // will call method of  sq...check why this it must depend on referencing class parent na ...coz of runtime polymorphism ...
        //Even though the reference type is shapes, the object at runtime is square, so the overridden area() method of the square class will be called.

    }
    
}
