//abcdcba
//take 2 pointers ...can also do by reversing and then comapring string 
// go through half of array to check 

public class Palindrome {

    static boolean isPalindrome (String str){
        str = str.toLowerCase();
        if(str == null || str.length()==0){
            return true;
        }


        for (int i=0;i<=str.length()/2;i++){
            char s = str.charAt(i);
            char e = str.charAt(str.length()-1-i);

            if(s!=e){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
      String str = "abcdcba";
      System.out.println(isPalindrome(str));
    }
}
