//see cwh notes which i made no need to make new notes from scratch for oops 
//class is a named  group of properties and functions 
//class is template  and obj is instance of a class...like a car is template used by maruti tesla etc
//class is logical construct while obj is physical reality....occupies space in memory
// obj has state identity and behaviour 
//. operator to access ...links the obj to class instance variable ...eg - student.rollno 
// Student student1; //declaring obj name ...just stores the refname (student1) in stack
// new  - to create an obj (by dynamically allocating the memory at runtime ...and returns a ref var to it)...means memory is allocated when the program is running
// Student s1 = new Student(); ...left part compile time and right part at run time 

//constructor - speacial type of function in class...runs when u create an obj and allocats some variables
// understand whats the diffrenece between using this and without it 
// this helps to spwcify whta obj we r referring to 

// why we dont us new keyword for creating primitive datatypes like char int etc ...coz in javaprimitive datatypes are not implemented as objects
//primitives are stored in stack ..to make it faster 

// wrapper classes 


import java.util.*;

//create a class 
class Student {
    int roll;
    String name;
    float marks;

    // we need a way to add values of the above properties obj by obj
    // we need one word to access these obj so we use this. ....instead of
    // (afiya.roll,afiya.name,afiya.marks)
    // internally this gets replaced with the obj ...so it becomes afiya.roll ,
    // afiya.name etc
    Student() {
        // this.roll = 2;
        // this.name = "laddoo";
        // this.marks=90f;

        this(13, "munni", 68.9f); // calling a constructor from another constructor...this will cal parameterized
                                  // constructor
        // internally its like Student(.....)
    }

    Student(int rollno, String nameString, float score) { // constructor overloading // parameterized constructor
        this.roll = rollno;
        this.name = nameString;
        this.marks = score;
    }

    Student(Student other) { // so whatever new obj we create it takes the properties of the other obj ...eg
                             // take afiya as other
        this.roll = other.roll;// copy constructor
        this.name = other.name;
        this.marks = other.marks;

    }

    // void chngname(String name){
    // name = name ; // it getconfused whivh name the parametr or the instance one
    // }
    void chngname(String naam) {
        this.name = naam;
    }

}

public class Main {
    public static void main(String[] args) {

        // why oops
        // store data of 5 students
        // int[]roll = new int[5];
        // String[]name = new String[5];
        // float[]marks = new float[5];
        // but we want to add these in single structure not in 3 diff obj
        // so we use class and obj ....so class can combine these properties into single
        // entity
        // Student []students = new Student[5];

        // System.out.println(Arrays.toString(students)); // its default datatype will
        // be null

        // Student s1 = new Student();//Student is a constructor
        // System.out.println(s1); // will give some garbage value
        // System.out.println(s1.roll);
        // System.out.println(s1.name);
        // s1.roll = 2;
        // s1.name = "laddoo";
        // s1.marks=90f;
        // System.out.println(s1.roll);
        // System.out.println(s1.name);
        // System.out.println(s1.marks);

        // Student afiya = new Student();
        // System.out.println(afiya.roll); // internally this.roll becomes afiya.roll
        // and returns its value 2
        // System.out.println(afiya.name);
        // System.out.println(afiya.marks);

        // Student newStudent = new Student(afiya); // we are passing an obj as
        // parameter so it considers the copy constructor where other gets replaced with
        // afiya
        // System.out.println(newStudent.roll); // values will be same as that of afiya
        // System.out.println(newStudent.name);
        // System.out.println(newStudent.marks);

        // calling a constructor from another constructor
        // Student zee = new Student();
        // System.out.println(zee.roll); // will return 13

        Student one = new Student();
        Student two = one;
        one.name = "something..";
        System.out.println(two.name); // both point to same obj in heap

    }
}
