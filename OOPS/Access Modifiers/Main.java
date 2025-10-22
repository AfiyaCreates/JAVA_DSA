// its not a good practice to be able to access the data mmbers and functions and make it public 
// like for the arraylist in built its datamembers cannot be accessd by us we can only use the functions of arraylist and its method which are available to us
// the default case - we can access it anywhere within the package ...but cannot access it outside the package or in subclass or anywhere outside its own package
// protected - can be accessed everyhere even in subclass of a different package (parent class in same package but hild of different package )......but cannot be accessed  in different package
//when tonuse which modifier
// private - is for sensitive data for which we do not wan direct access but can access theough getter and setter
// default - when we dont want data outside package
// protected - can only allow the use in outside package if its in the subclass
// its bcoz if the parent class outside the package could access it then all will know (the child about the parentr calss) ...so it will be used by everyone which we dont want so its child class will only be able to access it and not the parent classes

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "afiya");
        // we want to access the data members and modify the data members

        // int n = obj.num;// we cant access it its private
        // but we can access it using getters and setters
        // getter gets the value (access)
        // setter sets the value
        obj.getNum(); // now we can access it 
        //nu is pruvate it can only be accessed within its class ...but the method getnum in the class is public we can access it so ...indirectly we access the num 

    }

}
