import java.util.Arrays;

//comparison sort method
// also known as sinking sort or exchange sort
// at every pass the largest element comes to the end
// dont hv to compare the sorted part again and again
// i - counter the steps in a pass continues till i =n-1 coz no need to compare when single element in unsorted list
//j-internal loop   j starts from 1 index - till <length-i (will end at part of arr not sorted as it wont compare the sorted elements)
// if a[j]<a[j-1] - swap (that is if second element is less than prev element)
//otherwise increment j
// space complexity - O(1) constant - in place sorting algo
// time complexity - best case O(n) when arr is sorted ,  worst case-O(nsq) when arr is sorted in opp order
// as the size of the arr increases the no of comparisons increases
// best case n-1 comparisons over 1 pass and it ends .. we ignore constant so - n
// worst case n-1 comp in 1pass n-2 in 2pass n-3 in 3pass ....
// it is stable sorting algo - means order should be same when value is same
// we create boolean swapped so that we do not have to check for all values ...if no swapping takes place for a particular value of i (not j)means array is already sorted
public class Main {
    static void bubble(int[]arr){
        //run the steps n-1 times
        boolean swapped;
        int n = arr.length;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];   //swap
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swapped = true;
                }
            }
            if(!swapped){   // means !false=true that means sorted
                break;
            }
        }
    }

    public static void main(String[] args) {
	 int[] arr={-5,4,-3,2,1};
     bubble(arr);
     System.out.println(Arrays.toString(arr));
    }
}
