public class EvenNoOfDigits {
//    static  int EvenDigits(int[]arr){
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            String str = Integer.toString(arr[i]);
//            if(str.length()%2==0){
//                count++;
//            }
//
//        }
//        return count;
//    }
//         OR
//    static int EvenDigits(int[]arr){
//        int ans=0;
//        for(int i=0;i<arr.length;i++){
//            int count =0;
//            int num = arr[i];
//            // we use a temp var to store the value so that the original array is not modified
//            if(num==0){
//                count = 1;
//            }
//            if(num<0){
//                num = num*-1;
//            }
//            while(num>0){    // return (int)(Math.logo10(num)) + 1  returns no of digits in no simply
//                count++;
//                num=num/10;
//            }
//            if(count%2==0){
//                ans++;
//            }
//        }
//        return ans;
//    }
//
    // OR
    static int EvenDigits(int[]arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            if (num == 0) {
                count = 1;
            }
            if (num < 0) {
                num = -num;
            }
            count = (int)(Math.log10(num))+1;

            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {12,0,345,2,6,-7896,-67};
        System.out.println(EvenDigits(nums));

    }
}
