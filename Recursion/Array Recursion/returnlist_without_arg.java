// this is how it should not be done
//that is returning the list without passing the argument..that is create the list in the body of the func itself
//since we create inside the body a new list will be craeted at each call
// the list created will remin to that function call only and wont be passed to next call ...but next call wwe create its own new list ..since its in the body

import java.util.ArrayList;

public class returnlist_without_arg {

    static ArrayList<Integer> search(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length - 1;
        if (i == n) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);

        }
        // each call is creating an empty list ..but we want the added elemnt to be
        // there from the previous call as well
        // Call the function recursively for the next index
        ArrayList<Integer> ansFromBelowCalls = search(arr, target, i + 1);  // see the code ..we are returnoing the list ...whivh gets added to this
        // Merge the current list with the list returned from the recursive call
        list.addAll(ansFromBelowCalls);
        // Return the updated list containing all found indices
        return list;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 8, 9 };
        int target = 8;
        System.out.println(search(arr, target, 0));
    }
}
