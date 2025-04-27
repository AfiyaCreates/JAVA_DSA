//when u get a duplicate element only add it to newly created subset from previous step
//bcoz of this duplicates have to be together (adjacent)...so sort the arr

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subseq_with_duplicates {

    static List<List<Integer>> set(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            //if current element same as previous then start = end+1
            if(i>0 && arr[i]==arr[i-1]  ){//to avoid index out of bound i>0
                start=end+1;

            }
            end = outer.size()-1;//end will be equal to size of arr list (outer one )
            for (int j = start; j <= end; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,2};
        System.out.println(set(arr));

    }
}
