//when u want to print a code meany times but dont want to change the function
// we can create a function that calls anther funcion ..eith other name but performs the same task eg-below

public class basic{
    static void message(){
        System.out.println("hello world");
        message1();
    }
    static void message1(){
        System.out.println("hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
        message3();
    }
    static void message3(){
        System.out.println("hello world");
        message4();
    }
    static void message4(){
        System.out.println("hello world");
    }


    public static void main(String[] args) {
        message(); //it calls message1,message2,message3...etc..therefore printing it 5 times
        
    }
}