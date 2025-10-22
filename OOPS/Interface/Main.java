//interfaces - contain abstract functions
//variables are static and final by default 
//methods are public and abstract by default ....but while implementing specify them as public only
// just like abstract classes it tells us what to do but now how to do ...but it implements multiple inheritance
// abstract class vs interface do it 
//abstract can implement interface ...but interface cannot implement abstract class
//inrtface are implemented using implements keyword
//car is a class that can implement interfaces - engine and brake for eg

//we see in example - car implements brake and engine ...brake and engine may have same abstract method start ...but it has only its own implementation (single)...which is there in car class ..so it doesnt matter ..
//in this way it implements multiple inheritance

//variable of interface typw - having ref type as interface while creating obj 
//eg - engine car = new car 
// we know what we access depends on parent (it mmust be present in parent) ...what version we access depends on child 
// eg engine does not have var a but car has ..we cannot access it (since engine does not have it )

//separate classes in same interface- see the nicecar class , cdplayer and powerengine classes (and its interfaces)..to understnd 
//cdplayer - implements media
//powerengine - implements engine
//nicecar class - uses t 

//extending interfaces- A and B



public class Main{
    public static void main(String[] args) {
        // Car car = new Car();
        // car.start();
        // car.accelerate();
        // car.stop();

        // Media carMed = new Car();
        // carMed.stop(); // we dont to stop engine we want to stop media so we might need diff body fo this ethod ...for this we have separate classes in same interace


        niceCar obj = new niceCar();
        obj.start(); //this starts the power engine(default engine we set was power engine )
        obj.startMusic(); //this starts music

        obj.upgrade(); // now it switches to electric engine
        obj.start();
        // so without creating new obj we are able to chng the part of car 
    }
}