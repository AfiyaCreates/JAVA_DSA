//class extends Exception 
//see its working in Main class

public class MyExc extends Exception {
    public MyExc(String message){
        super(message); //calls the parent class method message ...(exception is paent class)
    }
    public static void main(String[] args) {
        
    }
}
