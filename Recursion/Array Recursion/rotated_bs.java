//using recursion 
//solve without pivot
//rotated arr= [5,6,7,8,1,2,3]
//write the 3 cases 

public class rotated_bs {

    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s]&& target<=arr[mid]){
                return search(arr, target, s, mid-1);
            }
            else{
                return search(arr, target, mid+1, e);
            }
        }
        // else when first part is not sorted 
        if( target>=arr[mid]&& target<=arr[e]){
            return search(arr, target,  mid+1, e);
        }
        //else search in left
        return search(arr, target, s, mid-1);

    }


    public static void main(String[] args) {
        int[]arr={5,6,7,8,1,2,3};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    
}
