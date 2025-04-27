//working with variables in recursion..in
//argument...what we put in argumnt will go in next func call
//return type
//body of func

//recursion in bs -
//2 steps ..comparing o(1)..dividing in half o(n/2) 
//recurrence relation = o(1) + f(n/2)

//types of recurrence relation - 
//linear - fibonacci (there are repeated function calls so inefficient)
//divide and conquer(search space is divided by a factor) - BS (divide and conquer is more efficient)
//make sure to return the result of a function call of the return type

public class BinarySearch {

    static int bs(int[]arr,int target,int l,int u)   // size of division partition is determined by l and u so added it in argument
    {
        if(l>u){
            return -1;
        }
    //    while(l<=u) ...this loop not needed
        int mid = l+(u-l)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            // l=mid+1;
           return bs(arr,target,mid+1,u);  //return the sub func cLLS
        }
        else{
            // u=mid-1;
           return bs(arr,target,l,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78,80};
        int target = 78;
        System.out.println(bs(arr,target,0,arr.length-1));
    }
}
