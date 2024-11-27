
//class helps to apply different properties/operations on collection frameworks
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<>();

        // list.add(34);
        // list.add(12);
        // list.add(9);
        // list.add(9);
        // list.add(9);
        // list.add(26);
        // list.add(29);
        // list.add(76);

        // System.out.println("min element in list is: "+ Collections.min(list));
        // System.out.println("max element in list is: "+ Collections.max(list));
        // System.out.println("frequency of 9 in list is: "+
        // Collections.frequency(list,9));

        // Collections.sort(list);
        // System.out.println(list);

        List<student> list = new ArrayList<>();

        list.add(new student("anuj", 2));
        list.add(new student("Ramesh", 4));
        list.add(new student("Shivam",3));
        list.add(new student("Rohit", 1));

        Collections.sort(list);  // on what basis the list will sort is given in student class file
        System.out.println(list);

    }
}
