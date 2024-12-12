public class Main {
    // search in array- return index if item found else return -1
    // time complexity-   best O(1)    worst O(n)...n is size of array

    static int linearSearch(int[] arr,int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        // this line will be executed if none of the above return statements have been executed
        // hence target element not found
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1,45,67,98,57,4,33,-23,66,-12};
        int index = linearSearch(array,4);
        System.out.println(index);

    }
}