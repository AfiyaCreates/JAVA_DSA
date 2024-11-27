
// class which helps in applying different operations to arrays 
import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

        // int[]no = {1,2,3,4,5,6,7,8,9,10};
        // int index = Arrays.binarySearch(no,4);
        // System.out.println("the index of no = 4 is: " + index);

        // int[]no = {30,40,20,50,70,80,10};
        // Arrays.sort(no);
        // for(int i :no){
        // System.out.print(i+ " ");
        // }

        int[] no = { 30, 40, 20, 50, 70, 80, 10 };
        Arrays.fill(no, 12);
        for (int i : no) {
            System.out.print(i + " ");
        }

    }
}
