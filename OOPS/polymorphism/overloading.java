package polymorphism;
 public class overloading{

    int sum (int a, int b){
        return a+b;
    }

    int sum (int a, int b,int c){
        return a+b+c;
    }
   
    public static void main(String[] args) {
        overloading obj = new overloading();
        System.out.println();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,3,4));
        
    }

 }