//adds element in random order
//wont add duplicate values

// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        // Set<Integer> set = new HashSet<>() ; // time complexity - O(1)
        // Set<Integer> set = new LinkedHashSet<>() ;  //linked hashset - hashset with linkedlist priority...elements are in order oe after the other
        Set<Integer> set = new TreeSet<>() ; // set with BS tree property ...sorted ...elements are added in sorted order....time complexity- big O(log n)
        


        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(65);//will add 65 only once

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(100)); //returns true or false
        System.out.println(set.isEmpty());//returns true or false
        System.out.println(set.size());//returns no of elelments in set
        set.clear();
        System.out.println(set);
        
        

            
        
    }
}
