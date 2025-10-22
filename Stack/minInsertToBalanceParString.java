//one opening bracket means 2 closing brackets
// A string of parentheses is valid if:
// Every '(' must be closed by exactly two consecutive ) — that is, '(' must be matched with "))".
// The "()))" pattern is valid, but "())(" is not.
// 👉 You must return the minimum number of insertions needed to make the string valid.

//check this and understand ...see if other simple method available 

public class minInsertToBalanceParString {

    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++; // we expect two ')' later
                i++; // chcek next char
            } else {
                // current is ')'
                // Check if next is also ')'
                if (i + 1 < s.length() && s.charAt(i + 1) != ')') { // one ) not 2{
                    if (open > 0) {
                        open--;
                    }else{
                        insertions++;
                    }
                    i += 2; // Skip both ')'
                }else{
                     if (open > 0) {
                        open--;     // Match with a '('
                        insertions++;     // But we need one more ')' to make a pair
                    }else {
                        insertions += 2;  // Insert a '(' and a ')' to make it valid
                    }
                    i++;
                }
            }

        }
        
        // Every unmatched '(' still needs two ')'
        insertions += open * 2;

        return insertions;
    }
}
