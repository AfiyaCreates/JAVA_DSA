// o find multiple occurences of a no ..that is in arr with duplicate no .
//use arraylist and add the index to it 
// whenever u get the ans just add it to the list and dont return anything ...so void

import java.util.*;
public class linear_search_multiple_occurence {


    static  void search_multiple(int[] arr, int target) {
        helper(arr, target, 0);
    }
 
    static ArrayList<Integer> list = new ArrayList<>();  // declare it static 
    static void helper(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        helper(arr, target, i + 1); //else

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 6,6, 97, 34, 35, 1 };
        int target = 6;
        search_multiple(arr, target);
        System.out.println(list);  //return [4,5] ..index of 6
     
    }
    
}
