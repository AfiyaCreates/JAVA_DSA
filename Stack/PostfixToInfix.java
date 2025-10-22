//postfix to infix 
// we have i and stack ...no ans 
// if operand - push 
//if operator - take last 2 elements out of stack ...and put op between them...wrap it with brackets and push back in stack
//after the iteration is over the element in stack is ans 
//    String expr = "(" + operand2 + ch + operand1 + ")";.....its op2 + op1


import java.util.Stack;

public class PostfixToInfix {

    static String PostfixToInfix(String s) {
        Stack<String> stack = new Stack<>();  //we are using string stack not char 
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                // stack.push(ch); [a, b, +, c, *]...we dont want this ...we want  [(a+b), (c*d)].
              stack.push(ch+"");
            }else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expr = "(" + operand2 + ch + operand1 + ")";
                stack.push(expr);
            }
        }
        return stack.peek();

    }

    public static void main(String args[])
{
    String exp = "ab*c+";
    System.out.println(  PostfixToInfix(exp));
}
}
