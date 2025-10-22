//child class has all the properties of pearent class..using extend keyword...child will hve its own extra properties 
//class child extends parent {}
//child obj = new child ...obj.l()..obj.b()..etc ....l and b are properties of parent class...must be initialized ..so that child can use
// if we have same varaible in both parent and child class ..eg volume ...then we can use super.volume()...to access of the patent class and this.volume to access taht of child class


public class box{

    double l;
    double b;
    double h;


    box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    //cube
    box(double side){
        // super();//object class
        this.l = side;
        this.b = side;
        this.h = side;
    }

    //cuboid
    box(double l,double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    //copy constructor ..with old as obj 
    box(box old){
        this.l = old.l ;
        this.b = old.b;
        this.h = old.h;

    }

    void display(){
        System.out.println("running the box");
    }

}