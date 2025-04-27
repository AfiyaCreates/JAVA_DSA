//similar to basic wala ques ...but in this skip a string instead of char
//similar logic

public class skipStr {

    static String Skip(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return Skip(str.substring(5)); // skip chars as the size of apple
        }
        else{
            return str.charAt(0) + Skip(str.substring(1));//since apple not found just add the char and skip that for next call ...and not of size = 5
        }
    }
    public static void main(String[] args) {

        String str = "bdapplefg";
        System.out.println(Skip(str));
        
    }
}
