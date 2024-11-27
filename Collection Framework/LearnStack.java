// LIFO - last in first out
// push - add element  pop - remove element
import java.util.Stack;

public class LearnStack{
    public static void main (String[]args){
        Stack <String> animals = new Stack <>();

        //to add element - push()
        animals.push("lion");
        animals.push("tiger");
        animals.push("zebra");
        animals.push("cat");
        System.out.println("stack: " + animals);

        // to see top element - peek()
        System.out.println(animals.peek()); // return cat 
        
        // to remove top element - pop()
        System.out.println(animals.pop());
        System.out.println(animals);





    }
}

