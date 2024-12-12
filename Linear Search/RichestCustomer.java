public class RichestCustomer {
    static int MaxWealth(int[][]arr){
        int max=0;
        for(int i =0;i<arr.length;i++){
            int wealth=0;
            for(int j=0;j<arr[i].length;j++){
                wealth=wealth+arr[i][j];
            }
            if(wealth>max){
                max=wealth;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][]nums = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(MaxWealth(nums));
    }
}
