//a path is given form top to bottom calc the sum f that path nodes
//dfs used 

//sum will be given ...we have to give the path that displays that sum 
//we chcek current node then left and right ...so pre order used
//first root node now next we want ..sum-root ...go to left and see if it has that no 
//eg - at leaf we have 7 but we needed 2...return s false ...we now search on left
public class PathSum {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        // if at leaf node and its val = sum ...return true
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        // Recursive case:
        // Subtract the current node's value from targetSum
        // and check if the updated targetSum can be achieved in either:
        // - the left subtree, OR
        // - the right subtree
        // If either side returns true, then a valid path exists.

        // returns true if either found path on left or on right side
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

}
