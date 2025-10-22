//class must implement the Cloneable interface ..otherwise it will throw an exception
// cloning method is fast ..but we have to chnage a lot of syntax 
//the coneabe interface does not have any abstract  method then why are we implementing it ....coz ..its just a way of tlling jvm that we are cloning  obj of tupe class

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9};

    }

    // public Human(Human other) { // other is obj of human class...its a constructor //no need of this wth cloning 
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    @Override
    public Object clone() throws CloneNotSupportedException { // write its syntax ....its clone of obj type ...it throws an exception
         //this is shallow copy   
        Human twin = (Human)super.clone(); // why super.clone ...and not super(clone)

        //this is deep copy 
        twin.arr = new int[twin.arr.length];
        for(int i =0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}