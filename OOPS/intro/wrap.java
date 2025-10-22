//wrapper class 
 // final keyword - it makes the variable  unmodifiable...final variables always have to be initialised while declaring
 // in case of primitive datatype the value of final var will not change 
// there reference to the obj will never change the var will always refer to same obj but that obj value can change ...in case of non primitive data trype 
// automatic garbage collection in java
// with finalize we can specify the certain actions to occur when the obj is about to be taken away by the garbage collector but we cannt maunualize garbage  


public class wrap {

    // static void swap(int a, int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }

   

    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        // int a = 10;
        //  int b =20;
        //  Integer a = 10;
        //  Integer b =20;
        // //  swap(a,b); // it wont swap bcoz in java for primitives there is no pass by ref only pass by value
        // swap(a,b);// this will not work for Wrapper class as well.. coz internally its values are final
        //  System.out.println(a+ " " + b)

    }

}
class A{


    final int num = 10;// initialization is imp 
    String name;
    public A(String name){
        System.out.println("obj created");
        this.name = name;

    }

    @Override
    protected void finalize() throws Throwable{    // so whenwver an obj of class a destroyed this will be called auto
        System.out.println("obj is being destroyed");
    }
    public static void main(String[] args) {

    final A kunal = new A(" kunal kushwaha");

    kunal.name= "new name";// can do this 
    // kunal = new A(" new obj "); // cant do this

    A obj ; // one ref var
    for(int i =0;i<10000;i++){  // check this 
        obj = new A("random name");  // new obj is creatd everytime...but ref var cant point to multiple obj at same time so prev obj gets deleted by garbage collector when new obj is created for that var 
    }

   

    }

}
