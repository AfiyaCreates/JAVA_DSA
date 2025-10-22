//this class wants all the properties of box class along with weight of the box....
// if child wants to call the properties of the parent in its constructor it can use super keyword..even can use in multi level inheritance 
// child cannot acces the private data from parent class
// all the classes that we create has object class as its super class
// super lets u access the properties if clss directly above the current class
// super() ...calls above class

public class boxWt extends box {
    double weight;

    public boxWt(){
        this.weight = -1;
    }

    //anothr use of super keyword works same as the below case 
    public boxWt(boxWt other){
        super(other);//does not give error  ...boxwt type ha saccess to all box type obj so calls***...same as down concept understand this
        this.weight = other.weight;
    }

    boxWt(double side , double weight){
        super(side);
        this.weight = weight;
    }

    public boxWt(double l , double b, double h, double weight){
        // to get l , b , h from parent class in this constructor use super
        super(l, b, h); // this calls the parent class constructor ...if such constructor does not exist it gives error
        this.weight= weight; // from this class
    }
}
