
//if somethig that throws an exception is placed inside the method we must specify it with method ...throws ...exception
//like we did in this main method
//shallow copy - for primitives it creates a new copy ..but for non primitives/obj(like string , arr) it makes  ref var to point to  same(original) obj 
// so when changes are made in copy..it changes the original obj as well(one obj pointed by both original and clone)...see ss
//deep copy- for both primitives and nonprimitives it creates a new obj
//the original obj doesnt change if we chnage the twin obj 

import java.util.Arrays;

public class Main{
public static void main(String[]args) throws CloneNotSupportedException{

    //this type of copying takes a lot of processing time 
    // Human person = new Human(23,"Afiya"); //calls frist constructor
    // Human twin = new Human(person);//calls second constructor

    //instead we can use obj cloning which creates an exact copy of an obj
    //in java there is an interface for cloning we must implement that in ou class to use it 
    Human person = new Human(23,"Afiya"); //calls frist constructor
    Human twin = (Human)person.clone();  // clone obj person ...of human type
    System.out.println(twin.age + " " + twin.name);
    System.out.println(Arrays.toString(twin.arr));

    twin.arr[0]=900; //shallow copying ...if we update the arr both the original and copy changes..if we implement deep copy also original person obj arr wont chnage
    System.out.println(Arrays.toString(twin.arr));
    System.out.println(Arrays.toString(person.arr));



}
}