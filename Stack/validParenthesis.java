//valid parentheses

import java.util.Stack;

public class validParenthesis {

    public boolean isValid(String s){
        Stack<Character>stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='('){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) return false; // Check before peek

                 if(ch=='}'&& stack.peek()=='{' ) stack.pop();
                else if(ch==']'&& stack.peek()=='[') stack.pop();
                else if(ch==')'&& stack.peek()=='(') stack.pop();
                else return false; // Mismatch case
            }

        }
        return stack.isEmpty();
    }

    //  if (!st.empty() && 
    //                 ((st.peek() == '(' && s.charAt(i) == ')') ||
    //                  (st.peek() == '{' && s.charAt(i) == '}') ||
    //                  (st.peek() == '[' && s.charAt(i) == ']'))) {
    //                 st.pop(); 
    //             }
    //             else {
                  
    //                 // Unmatched closing bracket
    //                 return false; 
    //             }
    public static void main(String[] args) {
        
    }
}
