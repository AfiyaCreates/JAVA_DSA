// find the kth smallest element in bst 
//remember its a bst
//since in bst ..elements are in sorted order ...we can use mid concept like binary search 
//so first do inorder traversal to get the sorted array .then take trhe k th element
//k is the kth element and count ..will set the counter++ until count==k...then we return the kth elemnt 
//count traverses the trr inorder and count++ when count!=k...
//traversal is done from left most node
//ans can be the right child of the left most node ....mot necessary only the left child

//call left 
//if left!=null...return left(calls left node recursively) ..else ..means leftmost node reached .count++
//if count==k = return node
//call right
public class KthSmallestElementBST{
    TreeNode root;
    public  KthSmallestElementBST(){

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val ){
            this.val = val;
        }
         TreeNode(int val,TreeNode left, TreeNode right){
            this.val = val;
            this.left=left;
            this.right=right;
        }
    }

    public int kthSmallest(TreeNode root,int k){
        inorder(root, k); 
        return result;
    }

    int count =0;
    int result =0;
    private void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }
        //left call
        inorder(root.left, k);   //keeps calling left nodes until reachest the leftmost node then its left is null now strat incrementing count
        //root
        count++;
        if(count == k){
            result = root.val;
            return ;
        }
        //right call 
        inorder(root.right, k);
    
    }


    

}