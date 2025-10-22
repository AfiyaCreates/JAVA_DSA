//we have i and stack 
//we iterte from back n to 0
//operand - push 
//operator - take last 2 elemnts out and put op in between and wrap ans in bracket ...push it in stack
//ans is top of stack 
   // its-  String expr = "(" + operand1 + ch + operand2 + ")";....here op1 + op2


import java.util.Stack;

public class PrefixToInfix {

     static String PrefixToInfix(String s) {
        Stack<String> stack = new Stack<>();  //we are using string stack not char 
        for (int i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                // stack.push(ch); [a, b, +, c, *]...we dont want this ...we want  [(a+b), (c*d)].
              stack.push(ch+"");
            }else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expr = "(" + operand1 + ch + operand2 + ")";
                stack.push(expr);
            }
        }
        return stack.peek();

    }

    public static void main(String[] args)
{
    String exp = "*-A/BC-/AKL";
    System.out.println("Infix : " + PrefixToInfix(exp));
}
    
}
