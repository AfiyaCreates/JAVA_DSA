import java.util.Set;
import java.util.HashSet;

public class CustomSet {
    public static void main(String[] args) {

        Set<student> s = new HashSet<>(); // student custom class in student.java file

        s.add(new student("afiya",13));   //creating student obj from class 
        s.add(new student("astha",40));
        s.add(new student("adeeb",13)); // roll no of adeeb and afiya is same but set considers it as different obj 
        s.add(new student("zenab",67));

        System.out.println(s);

        //in order to overcom the above prob we use equals method from hashcode....after those methods it will treat same roll no as same obj and add it once


        
    }
}
