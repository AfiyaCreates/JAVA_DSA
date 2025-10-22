//need of collection framework - provide single interface for common functions..hrlps in abstraction
//its present in java.util
//it has interface and classes 
//eg - list interface it extends collections

//vectro space - mulyiple threads can access same obj in arraylist ...but in vectors only one thread can access at a time and other has to wait 
//arraylost is faster

//Enums - 

import java.util.*;
// import java.util.Collections;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {

        // there can be similar type of methods of arraylist and linkedlist but with
        // different implementations coz both extends collections

        List<Integer> list1 = new ArrayList<>(); // list is parent ..arraylist is child
        List<Integer> list2 = new LinkedList<>(); // list is parent ..linkedlist is child

        list2.add(23);
        list2.add(45);
        list2.add(87);
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(58);
        vector.add(76);
        vector.add(98);
        System.out.println(vector);

    }
}
