//check if tree is bst or not
//for each node set low and high element ..eg 4 is left of 6...its low=null high=6...the node should contain something below 6
//in node.left....low is not changing..high becomes node.val
//in node.right....high is not changing ...low becomes node.val

//uses recursion
//o(n)

public class ValidateBST {

    TreeNode root;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = right = null; // initially
        }

    }

    public boolean isValid(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if ( node == null) {
            return true;// node with 0 node is also bst
        }
        if (low!= null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }
        boolean leftTree = helper(node.left,low,node.val);
        boolean rightTree = helper(node.right,node.val,high);


        //since both should be true for a nde then only it should return true 
        return leftTree && rightTree;
    }

}
