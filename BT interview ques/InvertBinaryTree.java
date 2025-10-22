//inverting a binary tree - means swapping left and right nodes...their child also moves
//we go top to bottom so dfs is used
//thi is also post order ...we swap left then right then root
//we go bottom yo up 
//it will return left node and right node only ...but after swapping

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
        this.val = val;
    }
    }
    
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.left=right;
        root.right=left;

        return root;

    }
}
