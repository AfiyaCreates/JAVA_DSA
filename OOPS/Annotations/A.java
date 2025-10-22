 public interface A {

    static void hello(){ // provide static methods with body 
        System.out.println("i am a static method");
    }

    default void fun(){  // specify default method usng default keyword
        System.out.println("i am in A"  );

    }
}
