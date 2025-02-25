//since strings are immutable at each itearstion its creating a new obj for  series and so it has poor performance
//a,ab,abc,abcd,abcde,.....all these does nothave a refrene var so memory wastage
//time complexity = o(n sq)
// so we need a datatype with the help of which we can make changes in same obj instead of creating new ...we use string builder

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);
    }
}
