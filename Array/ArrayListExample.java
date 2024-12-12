import java.util.ArrayList;      // import arraylist
import java.util.Scanner;
public class ArrayListExample {
    // when u want to create an array of unknown size
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);   // in <> add wrapper class of data type
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        // can add any no of values does not depend on initial capacity given
        // list size is fixed internally...like initial size is 10 
        //if arraylist fills by a certain amount ...it will create a new array list of ...can say double the size
        //the old list elements are copied in new list ...and old list is deleted
        System.out.println(list);
        System.out.println(list.contains(13));
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        // input with loop
        ArrayList<Integer> list2 = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr elements:");
        for(int i=0;i<5;i++){
            list2.add(sc.nextInt());
        }
        System.out.println(list2);
        // output with loop
        for(int i=0;i<5;i++){
            System.out.print(list2.get(i)+" "); // pass index in get
        }

    }
}
