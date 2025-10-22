//infix to prefix-
//3 steps
//reverse string...and convert opening to cloding bracket and vice versa 
//convert infix to postfix ...just some change 
// while(!stack.isEmpty() && presedence(ch) < presedence(stack.peek())){  //when precedence is less
//..instead of <= ...its <                
//reverse the ans 

import java.util.Stack;

public class infixToPrefix {

    public static String InfixToPrefix(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse(); // converts string to sb and reverses the string
        char[] chars = reversed.toString().toCharArray(); // converts sb to string and to array
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('){
                chars[i]=')';
            }else if(chars[i]==')'){
                chars[i]='(';
            }
        }
        //convert arr back to string
        String reversedStr = new String(chars);
        //convert infix topostfix 
        String postfix = InfixToPostfix(reversedStr);
        //reverse the final ans
        return new StringBuilder(postfix).reverse().toString();
    }


// to convert infix to postfix
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
                while(!stack.isEmpty() && presedence(ch)<presedence(stack.peek())){  //when precedence is less....diff than the postfix
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
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(InfixToPrefix(s));
    }


}
