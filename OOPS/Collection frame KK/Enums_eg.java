//Enums(enumeration) - special class with a group of constants..it is similar to classes
//ensures variable can only hold one of these predefined values of enum..saves time and makes code more readable 
//eg - showing order stats on product websites
// see enum notes on kk notes
//every enum extenbds java.lang.enum class  enum cannot extend anything coz multiple inheritance not allowed ..but can implement interface

public class Enums_eg {

    enum Week{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        //these are called enum constants
        //these are public static and final...since static can access throught its enum name - week
        //since its final we cannot create child enums
        // type is week

        //constructor 
        //this is not public or protected ..only private or default 
        //why? ...we dont want to create new objects 
        //this is not the enums concept thats why 
        //internally its like - public static final Week monday = new Week();
        Week(){ 
            System.out.println("constructor called for " + this);
        }

    }
    public static void main(String[] args) {
        Week w;
        w= Week.monday; // but the constructo will be calles for each constant var


        // System.out.println(w); //return monday
        System.out.println(w.valueOf("monday"));//returns monday 
        // System.out.println(w.ordinal());//returns position of enum declaration...0 for monday

        // for(Week day:Week.values()){
        //     System.out.println(day);
        // }
       
    }
}

