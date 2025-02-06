// eg - arr = [3,4,1,2]
// min value of m = 1 , 1 subarray - [3 4 1 2] maxsum= 3+4+1+2=10 -> u
// max value of m = arr.length, 4 subarrays- [3][4][1][2] maxsum=4(max value of arr) ->l
// min value of final ans - case 2 (max value in arr)      max value of final ans - case 1(sum of all values in arr)

// range - [4,10] l=4 u=10  mid = 7
// so check in how many pieces is the array returning 7 as sum - [3 4][1 2] - 2 pieces
// make pieces until the sum exceed the max-value(mid)
// eg- arr = [7 2 5 8 10] - mid = 15 - [7 2 5] [8] [10]

// reducing the size of sum , increses the no of subarray(pieces) and vice versa
// if pieces<=m - check in left part of mid(bcoz we want to reduce 7 )- u = mid
// if pieces>m - check in right part of mid(bcoz we want to increse 7)- l = mid+1
// when l=u - answer

public class split_arr_largest_sum {
    static int split(int[]arr,int m){
        int l =0;
        int u =0;
        for(int i =0;i<arr.length;i++){
            l = Math.max(l,arr[i]);  // at end of loop this contains max value of array
            u = u+arr[i]; // at the end of loop this contains sum of all elements in array
        }
        // binary search
        while(l<u){
            // try mid as potential ans
            int mid = l+(u-l)/2;
            // calc in  how many pieces we can divide arr in with this max sum(mid)
            int sum =0; // for calc pieces
            int pieces =1; // min pieces could be 1
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]>mid){
                    // we cant add new element in this subarray and have to create new one from the new element
                    sum=arr[i];
                    pieces++;
                }else{
                    sum = sum+arr[i];
                }
            }
            if(pieces>m){
                l = mid+1;
            }else{ // pieces<=m
                u = mid;
            }
        }
        return l; // return l or u (l=u)
    }

    public static void main(String[] args) {
        int[] nums ={7,2,5,10,8};
        int m = 2;
        System.out.println(split(nums,m));

    }
}

