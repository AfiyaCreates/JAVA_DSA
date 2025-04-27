// this is how ot should be done 
// things we add in parameters goes to future recursive calls 
// things we add in body only remains fot that function call 
// same linear search prob with multiple occurences but return the array list 
// new list is not getting created ..its adding elements to the same list
// System.out.println(search(arr, target, 0, new ArrayList<>()));


import java.util.ArrayList;

public class returning_Arraylist {
    
    static ArrayList<Integer> search(int[]arr,int target,int i,  ArrayList<Integer> list){
        int n = arr.length -1 ;
        if(i==n){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return search(arr, target, i+1,list); //writing return bcoz ..its returning array list ...which we are using recusively to add the elements 
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8,8,9};
        int target=8;
        System.out.println(search(arr, target, 0, new ArrayList<>()));
    }
}
