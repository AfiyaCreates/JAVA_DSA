public class Son extends Parent {

    public Son(int age){
       super(age);  // using super to access parent class constructor
    }
    
    @Override
    void career(){
        System.out.println( "i am going to be a Doctor"  );
    }
    @Override
    void partner(){
    System.out.println( "i love tinker bell" );

    }
}
