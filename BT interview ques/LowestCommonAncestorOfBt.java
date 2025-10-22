//find the lowest common ancestor between 2 givwn nodes p and q....the lowest most recent common parent 
// a node can be an ancestor of itslef ...eg - 5 is parent of 4 ...so ancestor of 5 and 4 will be 5
//we are going bottom to up ..dfs used

//move top to down first root then left and right
//if node == p or q = return that node ...end your call here
//othwerwise go left ...go right
//at end ..if left and right != null ....current node will be ans 
//see diag in vid 
//if we find ans inleft or right we are returning it ...but if we get ans for both ...let and right none of them is null then the cutrent node we are at is the lca
//also - if left ==null ans = right....means q is child of p
//if right ==null...ans = left....means p is child of q


public class LowestCommonAncestorOfBt {
    TreeNode root;

    class TreeNode {
        TreeNode left;
        TreeNode right;   
    }

    public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root==p || root ==q){
            return root;
        }

        TreeNode left = LowestCommonAncestor( root.left, p,  q);
        TreeNode right = LowestCommonAncestor(root.right,  p,  q);

        if(left!=null && right!= null){
            return root;
        }

        return left==null?right:left;
    }
    
}
