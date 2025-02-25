public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.12564f;
        System.out.printf("formatted no is %.2f",a); //uses printf....returns no till 2 decimal point...and also rounds
        System.out.println();  
        System.out.printf("pi value is: %.2f",Math.PI);
        System.out.println();
        System.out.printf("hello my name is %s and i am %s","afiya khan","an artist");//order of placeholders should be maintained
    }
}
