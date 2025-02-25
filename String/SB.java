//string builder ...it is mutable
// see its imp methods
public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
    }

}
