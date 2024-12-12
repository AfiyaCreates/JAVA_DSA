public class FindMin {
    // return min value in the array
    // assume that the array is not empty
    static int min(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums ={16,76,45,89,56,9,33,87};
        int minNo = min(nums);
        System.out.println(minNo);

    }
}
