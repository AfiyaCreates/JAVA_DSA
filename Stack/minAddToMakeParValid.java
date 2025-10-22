//minimum no of insertions we have to make to make the parentheses valid
//its the no of elemnts left in stack ...without closing or opening bracket
//the size of the stack

import java.util.Stack;

public class minAddToMakeParValid {

    public int minAdd(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if ( !stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{stack.push(ch);}

        }

        return stack.size();
    }

    public static void main(String[] args) {

    }
}
