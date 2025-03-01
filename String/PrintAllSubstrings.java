// Iteration 1 (i = 0)
// j = 0 → k.substring(0, 1) → "a"
// j = 1 → k.substring(0, 2) → "ab"
// j = 2 → k.substring(0, 3) → "abc"
// j = 3 → k.substring(0, 4) → "abcd"
//it goes <k.length ...o avoid indexout of bound
// (i,j+1)...this avoids taking empty strings

public class PrintAllSubstrings {
    public static void main(String[] args) {
          String k = "abcd";
          for(int i=0;i<k.length();i++){
            for(int j=i;j<k.length();j++)
            System.out.println(k.substring(i,j+1));
          }     
    }
}
