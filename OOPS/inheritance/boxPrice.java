//types of inheritance 
//single 
//multilevel
// above class have no idea of bottom class but every bottom class has idea of above classes
//multiple inheritance- when 1 class is extending more than one clss...a has a child c and b also has a child c 
// eg if a has var n=5 and b has var n = 10 ..if c wants to access n whivh n value will it get ..so due to this prob java does not support multiple inherutance
// but this can be implemented using interfaces
//hierarchical inheritance - one class is inherited by mny classes...a is parent to b c d
//hybrid inheritance - combination of single and multiple inheritance ...not supported in java (coz bo multiple inheritance)

public class boxPrice extends boxWt {

    double cost;

    boxPrice(){
        super(); // this calls the above class boxwt...boxwt calls box
        this.cost = -1;
    }

    boxPrice(boxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public boxPrice(double l , double b, double h, double weight , double cost ){
        super(l,b,h,weight);
        this.cost = cost ;
    }

    public boxPrice(double side, double weight , double cost){
        super(side, weight); // a constructor like this needs to exist in boxwt to use this
        this.cost= cost; 

    }
    public static void main(String[] args) {
        
    }
}
