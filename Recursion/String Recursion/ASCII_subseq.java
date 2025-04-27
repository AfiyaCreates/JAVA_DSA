// ch+0 also gives the ascii value ...or    int ascii = (int)ch;

public class ASCII_subseq{

    static void seq(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        // int ascii = (int)ch;
        seq(str.substring(1),ans+ch); //considering the char
        seq(str.substring(1),ans+(ch+0)); //considering the char ASCII value
        seq(str.substring(1),ans); // not considering the char


    }
    public static void main(String[] args) {
        String str = "abc";
        seq(str, "");

    }
}