// single line func are called lambda functions 
//see syntax
//see the use of consumer what is it ...its an interface- import it 
// use with intrerface..can be consumer ..or our created like Operation

// we can assign lambda expressions to variables that are type interface
import java.util.*;
import java.util.function.Consumer;

public class lambda {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) { // store elements in arr
            arr.add(i);
        }

        // arr.forEach((item)-> System.out.println(item*2)); //lambda func to double
        // each item of arr

        // or

        // Consumer<Integer> fun = (item)-> System.out.println(item*2); //created a
        // lambda function
        // arr.forEach(fun); // applied it to each element of arr

        //body of abstarct func task 
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        lambda obj = new lambda();
        System.out.println(obj.operate(2, 3, sum));
        System.out.println(obj.operate(2, 3, prod));
        System.out.println(obj.operate(2, 3, sub));

    }

    // call it using operate function
    private int operate(int a, int b, Operation op) {  // op has type of interface Operation 
        return op.task(a, b); // call task func of Operation interface...whixh is an abstract method ...its body is in psvm...

    }

    public interface Operation {
        int task(int a, int b); // interface with op function-for diff types of operation

    }
}