public interface Engine {

    // static final int price = 75000; // its by default final and static no need to specify
    int price = 75000;


    // methodsa are abstract buy default
    void start();
    void stop();
    void accelerate();

    
} 
