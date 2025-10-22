//object class- class in the Lang package ..already imported
// it is the top most class in the hierrachy 
//every class extends object class by default
//class b extends class a (but internally it extends object class too)...so multiple inheritance exists internally
//object methods - hashCode(),equals(),clone(),tostring()..getclass().etc

//instance of operator ...to check if an obj is an instance of  a particular class or not 

public class object{

    int num;
    float gpa;


    public object(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }


    @Override
    public int hashCode(){ // it gives a no represemttion of an obj...unique representation of an obj through a no
        return super.hashCode(); // use super to access overriden method from parent class
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString();
    }



    public static void main(String[] args) {
        object obj = new object (12,54.2f);
        object obj2 = new object (12,86.3f);

        // System.out.println(obj.hashCode());
        // if(obj<obj2){  // this is not possible it gets confused which no to compare num or gpa 
        //     System.out.println(" obj is less than obj 2" );
        // }

        if(obj==obj2){   // thisis not suitable  ...this checks if two var points to sam eobj or not 
            System.out.println(" obj is less than obj 2" );
        }
        if(obj.equals(obj2)){   // can be done in above or this way ...this way checks the content and compare it 
            System.out.println(" obj is less than obj 2" );
        }

        System.out.println(obj instanceof object);

        System.out.println(obj.getClass()); // gives class info
        
    }


}