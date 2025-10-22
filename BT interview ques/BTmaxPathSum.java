//binary tree max path sum ***understand a bit ricky ques
//eg = -10
//   9      20
//        15   7
//max path - 15+20+7 ...sum = 42
//we now dfs is used 
// one way = find all paths sum the take max - not efficient 

//set a global max =0;
// for each node compute max path sum on left and on right ...left+right+curr ...this gives ans....using this sum update global max
//also compute .this will tell us which path gives ans ....max(left,right) + curr
//no includeing the current node in thta path sum = curr+left+right
//eg - for root node = 9 -10 20 15
//if a path has negative no ignore it 
//understand like the diamter ques 
//
public class BTmaxPathSum {
     class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }

    }

    int ans =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        helper(root);
        return ans;
    }
    private int helper(TreeNode node){
       // Base case: if node is null, no contribution to path sum
        if (node == null) {
            return 0;
        }

        // Recursively get the max path sum from the left subtree
        int left = helper(node.left);

        // Recursively get the max path sum from the right subtree
        int right = helper(node.right);

        // If the path sum from left/right is negative, ignore it (treat as 0)
        // This is because a negative path would reduce the total sum
        left = Math.max(0, left);
        right = Math.max(0, right);

        // Case 1: Path passing through the current node (can include both left and right)
        // This is a candidate for the global maximum
        int pathSumThroughNode = left + right + node.val;

        // Update global maximum if this path is better
        ans = Math.max(ans, pathSumThroughNode);
 /**
         * Case 2: Return value for recursion
         * We cannot return both left and right to the parent — 
         * because a path in the tree cannot branch upwards in both directions.
         * Instead, we choose the larger side (max of left or right) and
         * add the current node's value.
         * 
         * This value is the maximum path sum starting at 'node'
         * and going upwards in one direction.
         */
        return Math.max(left, right) + node.val;
    }
    
}
