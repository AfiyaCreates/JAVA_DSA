import java.util.Scanner;
import java.util.ArrayList;
public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialisation
        for(int i = 0;i<3;i++){
            list.add(new ArrayList<>());
        }
        // add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            list.get(i).add(sc.nextInt());   // get will return list at index i and then we add elements in it
            }
        }
        System.out.println(list);

    }
}
