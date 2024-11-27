// map stores info in form of key value pair 
//put()- to add 
//containsKey()...containsValue()..isempty()....remove()
//keys should be unique ...else it over writes the values

import java.util.Map;
// import java.util.HashMap;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Map<String, Integer> no = new HashMap<>();
        Map<String, Integer> no = new TreeMap<>();  // creates a tree map with keys in sorted order...eg-in string sorted acc to alphabetical order

        no.put("one", 1);
        no.put("two", 2);
        no.put("three", 3);
        no.put("four", 4);

        System.out.println(no);

        no.remove("two");
        System.out.println(no);

        // no.put("two", 50);
        // or
        // if (!no.containsKey("two")) {
        //     System.out.println(no);
        // }
        //or
        // no.putIfAbsent("two" , 50); // if two key is not already present then only it puts this value

        // System.out.println(no);



        // for ( Map.Entry<String,Integer> e: no.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // for(String key: no.keySet()){
        //     System.out.println(key);
        // }
        // for(Integer value: no.values()){
        //     System.out.println(value);
        // }


    }
}
