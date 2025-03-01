//aaabbbccaaaadde  //count the no of characters and write beside each but for single occurence dont write 1
//a3b3c2a4d2e
// if (count > 1) ...ans += count;...tp make sure it wont add 1 when only single occurence of char

public class StringCompression {

    static void compress(String str) {
        String ans = "" + str.charAt(0); // cant add a char directly to string so + ""
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (current == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                }
                count = 1; // set count 1 for next character
                ans += current; // to add first occurence of next char
            }
        }
        if (count > 1) {
            ans += count; // for last charcater ..since no character after last one the above check wont
                          // be made so we add count at last
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {

        String str = "aaabbbccaaaadde";
        compress(str);
    }
}
