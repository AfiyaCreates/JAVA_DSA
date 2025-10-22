//max depth is height of root node...returns max path from root to leaf 
//dfs - post order traversal used 
//depth of a node is - max (left,right) + 1

public class MaxDepth {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val = val;
        }

    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;
    }

   
    
}
