//arr= 4,3,2,7,8,2,3,1
//arr after sort = 1,2,3,4,3,2,7,8

import java.util.ArrayList;
import java.util.Arrays;
public class findAllNoDisappearedInArr {
  
        static ArrayList<Integer> findNo(int[]arr){
            int i=0;
            while(i<arr.length){
                int correcti = arr[i]-1;
                if(arr[i]!=arr[correcti]){  // auto handle duplicates
                    swap(arr,i,correcti);
                }else{
                    i++;
                }
    
            }
            //search return elements
            ArrayList<Integer> ans = new ArrayList<>();  // use array list
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j+1){  //for range[1,n]...index=value-1..value=index+1...we hv to return index so we write it as ...arr[j]!=j+1
                    ans.add(j+1);
                }

            }
        
         return ans;
     
        }
        static void swap(int[]arr,int a,int b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        public static void main(String[] args) {
            int[]arr = {4,3,2,7,8,2,3,1};
            findNo(arr);
            System.out.println(Arrays.toString(arr));
            
        }
    
}
