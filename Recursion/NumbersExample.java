//write a function that takes a umber and prints it 
//print first 5 numbers : 1 2 3 4 5
// see ss
// how function call works in java 
//while the function is not finished executing it remains in stack
//when a function is finished executing it is removed frm the stack and the flow of program is restored to where that function was called
//main function will be the last function that will be removed from the stack and program will end

//recursive function
//but instead of calling multiple funcions with same body .. let a function call itself ...with different value of argument each time ..
// we need a base condition to stop the function ...it is a condition where recursion stop making new calls
//if u r calling a function again and again u can create it as a separate call in stack 
//every time u call a function it will take space in memor separately 
// if no base condion - func calls will keep happening..stack will be filled again and again ...memoery of comp exceed the limit ...stcak overflow error
//why recursion - heps in solving bigger/complex prob in simple way
//can convert recursion soln into iterations anad vice versa
//space complexity is not constant bcoz of the calls
//helps in breaking down bigger problems into smaller problems
//visualizing recursion - using recursive tree

public class NumbersExample {

    // static void print1(int n){
    //     System.out.println(n);
    //     print2(2); // calls function print2()..with n=2
    // }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3); // calls function print3()..with n=3

    // }
    // static void print3(int n){
    //     System.out.println(n); // calls function print4()..with n=4
    //     print4(4);

    // }
    // static void print4(int n){
    //     System.out.println(n); // calls function print5()..with n=5
    //     print5(5);

    // }
    // static void print5(int n){
    //     System.out.println(n);
    // }


// we dont want to print anything after 5 ...so the function body changes at that point 
// we need a base condition to stop the function ...it is a condition where recursion stop making new calls

    static void print(int n){
        if(n==5){
        System.out.println(5); // base condition 
            return ;
        }
        System.out.println(n);

        //last func call..it is called tail recursion 
        print(n+1); // calls itself for n=n+1 each time 
    }
    

    public static void main(String[] args) {
        // print1(1);

        print(1);
    }
}
