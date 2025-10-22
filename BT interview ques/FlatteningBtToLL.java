//convert the binary tree to linked list ...in preorder traversal 
//root left right...sice preordr traversal so dfs used
//normal preorder trcversal ..as u traverse store node sin queue
//in the end remove from queue one by one and make ll
//space and time complexity - o(n)

//optimal soln -
//start with one root node ..we have to add things to right of node so remove the items at right and place it on the left side of root node where there isno right child
//so add 5 and 6 to right of 4
// connect the root node to next node as its right child not left 
//repea same thing with 3 all items at right of 2 move it to left of 2 as its 3 right child
//put 3 and its childern at right of 2

//the node u r at check if it has left child ..if yes find the right most elemnt for it
//right node elemnest becomes current node.right
//convert left child to right child ..for the curr node

import java.util.TreeMap;

public class FlatteningBtToLL {
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

    public void Flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right; // keep going right till u reach node which doesnt have right child
                }
                temp.right = curr.right; // curr ke right emenets becomes temp right
                // left children of curr becomes its right children
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;//repeat this for next right node ..until whole tree becomes ll...we reach null last node

        }
    }
}
