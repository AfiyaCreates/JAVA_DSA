//strings -> interning  -> immutability -> poor performance ...due to this we use string builder
//string builder ...it is mutable
// see its imp methods
//setCharAt(index,chr)...in strings it was not possible to chng the char at an index using char at but it is allowed in string builder (mutability)
//delcharat()
//append()
//insert(index,chr)..can insert a char at the given position..eg - afiya to afiyya
//reverse()  ***
//delete(i,j)
public class SB {
    public static void main(String[] args) {
        // StringBuilder builder = new StringBuilder();
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char) ('a' + i);
        //     System.out.println(ch);
        //     builder.append(ch);
        // }
        // System.out.println(builder);
        // builder.deleteCharAt(0);
        // System.out.println(builder);
        // builder.setCharAt(0,'m' );
        // System.out.println(builder);

        StringBuilder str = new StringBuilder("afiya");
        str.reverse();
        System.out.println(str);
        str.delete(2,5);
        System.out.println(str);
    }

}
