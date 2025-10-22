//infix prefix postfix conversions 
//operators in presedence and associativity u should know
//give them priority no 
//eg - ^=3...* and / = 2...+ and - =1...others=-1

//we have i =0 to n
//stack
//ans string
//when operand ..add it to ans....when oerator push in stack ...
//apply rules

//infix to prefix 
//if operator is higher  than operator in stack...push it 
//else pop the stack operator until operator reached with higher or equal priority ....and add the popped item to ans
//if (..push in stcak 
//if )..pop everything..and add to ans until u get(
//whatever left in stcak pop and add to ans 

import java.util.*;
class infixPostfix{
    private static int presedence(char ch){
        return switch(ch){
            case '+','-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }

    static String InfixToPostfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
       
        for(char ch : s.toCharArray()){
            if(isOperand(ch)){
                ans.append(ch);
            }else if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){ //*** ...peek elemnt ki baat ho rhi h idhr
                    ans.append(stack.pop());
                }
            stack.pop(); // to remove'(' from stack
            }
            else{//operator
                while(!stack.isEmpty() && presedence(ch)<=presedence(stack.peek())){  //when precedence is less
                    ans.append(stack.pop());
                }
                stack.push(ch);//then push this char ...// so this pushes only when pre is higher
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());  //pops remaining elemnts one by one and add it to ans
            
        }
        return ans.toString();
        
    }

     public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String postfix = InfixToPostfix(infix);
        System.out.println("Postfix expression: " + postfix);
    }
}