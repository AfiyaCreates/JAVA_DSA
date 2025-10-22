//convert soretd array to bst
//since sorted array ...binary search (divide and conquer strategy )...using mid
// for sorted arr
    
public class SortedArrayToBST {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode sorted(int[]nums){
        return sortedhelp(nums, 0, nums.length);
    }
     public TreeNode sortedhelp(int[] nums, int start, int end) {
        if (start >= end) {
            return null; // base condition
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]); //each time it calc mid of sorted arr and craete a root ode for it
        root.left =   sortedhelp(nums, start, mid); //call recursilevly for left and right side
        root.right = sortedhelp(nums, mid + 1, end);
        return root; //returns that root node
    } 
    
}
