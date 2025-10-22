// if the obj is of child it can access parents and its properties 
// but if the obj is of parent class it cannot access child properties
// if the ref is of parent class but the obj is of child class then...in that case waht members can be accessed depends on type of reference var not on type of obj  
// eg - parent obj = new child(...) ....in this case what can be accessed depends upon parent class..see example below
// remember a child cannot reference a parent class...coz if the obj is of parent class how will t be able to call the constructor of child class to access child based ref variables 

public class Main {
    public static void main(String[] args) {

        // box obj1 = new box(); // the default constructor with no arg ...
        // System.out.println("length " + obj1.l + " breadth " + obj1.b + " height " + obj1.h);

        // box obj2 = new box(4); // the constructor with arg ...
        // System.out.println("length " + obj2.l + " breadth " + obj2.b + " height " + obj2.h);

        // box obj3 = new box(obj2); // the copy constructor
        // System.out.println("length " + obj3.l + " breadth " + obj3.b + " height " + obj3.h);

        // boxWt newobj = new boxWt();
        // System.out.println(newobj.h + "  " + newobj.weight); // this can access the properties of both parent and child

        // // System.out.println("length " + obj3.l+ " breadth " +obj3.b + " height "
        // // +obj3.h + " weight " + obj3.weight);// will give error

        // // if the ref is of parent class but the obj is of child class then
        // box obj = new boxWt(2,3,4,8);  // the constructor is of child (obj is of child)
        // System.out.println(obj.l);//can be accessed
        // // System.out.println(obj.weight);//cannot  be accessed


        boxPrice box = new boxPrice(5,8,200);



    }
}
