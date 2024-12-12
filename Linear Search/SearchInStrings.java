// we use charAt() to traverse string characters
// to get str length - str.length()   in strings its function so we use brackets
// use - str.toCharArray() - to convert string to array of chars
public class SearchInStrings {

    static boolean search(String str, char target ){
        if(str.length() == 0){
            return false;
        }
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
//                    OR
//    static boolean search(String str, char target ){
//        if(str.length() == 0){
//            return false;
//        }
//        for(char c : str.toCharArray()){
//            if(c == target) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        String name = "Hello World";
        char ch = 'b';
        boolean ans = search(name,ch);
        System.out.println(ans);

    }
}
