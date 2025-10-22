//try - code in which exception might occur
//catch - to catch and handle that exceotion
//finally - no matter what happens(exception is thrown or not)..its code runs..its optional ..can be single finally
//throw - when we want to  explicitly throw an exception...mention like throws ArithmeticException...see below
//throw - means we are throwing an exception ...throws - it is just to declare an exception
//can add multiple catch with single try block..for different types of exception
//Exception includes everything-all types

public class Main {

  static int divide(int a, int b) throws ArithmeticException{
    if (b == 0) {
      throw new ArithmeticException("pls do not divide by zero"); // throws exception with this msg
    }
    return a / b;
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 0;

    try {
      // int c = a / b; //prints msg /by zero
      // divide(a, b);   //  plrints pls do not divde by zero
      // throw new Exception("just for fun"); //prints normal exception

      String name = "kunal";
      if(name.equals("kunal")){
        throw new MyExc("name is kunal exception");
      }
    }catch(MyExc e){
      System.out.println( e.getMessage());  // for custom exception myexc..which calls main Exception class message func internally...see myexc file
    }
     catch (ArithmeticException e) {
      System.out.println(e.getMessage()); //gives arithmetic exception(runtime)... it just prints the meassage ..but does not throw exc...coz of catch
    } catch (Exception e) {
      System.out.println("normal exception"); //for any other exception
    } finally {
      System.out.println("hello");
    }

    System.out.println("i am afiya");

  }
}
