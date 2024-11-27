import java.util.ArrayList;
import java.util.Iterator;

public class  LearnArrayList{
    public static void main (String[] args){

        //intro
        ArrayList<String> studentName = new ArrayList<>();
        // initially it cerates an empty array
        //when we insert 1 element it creates array of n size(10)
        // furtrher if we try to add n+1 element ....it creates an array of size - n + n/2 + 1...
        // so size = n
        //           n + n/2  + 1 

        // time complexity - big O (n) .....bcoz elements shift left /right when we add or remove elements 
        studentName.add("Afiya");

        //how to add elements/ entire list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);  // adds 4 to the end of list
        System.out.println(list);
        list.add(1,50); // adds 50 at 1 index
        System.out.println(list);

        ArrayList<Integer> NewList = new ArrayList<>();
        NewList.add(100);
        NewList.add(200);
        System.out.println(NewList);

        list.addAll(NewList); // adds the whole list to another list (adds new list to list)
        System.out.println(list);


        // other operations - get remove ...

         System.out.println(list.get(1));// to get an element from a particular index 
         
        list.remove(3);// removes an element from a particular index
        System.out.println(list);

        list.remove(Integer.valueOf(50));// removes the element by name instead of index
        System.out.println(list);

        list.clear();//removes all elements from the list 
        System.out.println(list);

        list.set(1,13); // updates the value at a particular index
        System.out.println(list);

        System.out.println(list.contains(100)); // returns true or false
        
        // to traverse an array list

        for(int i =0; i<list.size(); i++){ 
            System.out.println("the element at " + i + " is " + list.get(i));
        }
        for(Integer element: list){
            System.out.println(element);
        }
        //  with the help of iterator 
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator " + it.next());
        }



    }
}