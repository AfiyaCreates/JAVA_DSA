//eg tree is - 4 
//        9        0
//     5     1

//the paths we got - 495 , 491, 40
//its sum = 495 + 491 + 40 = 1026 ans 
//we know its dfs
//to trace the no we use - 10*prev + current 
//eg - 10*0+4 = 4 ....10*4+9 = 49....10*49+5 =495..
//when we reach leaf node ..ans found return it...s0 we return 495
//while returning for other nodes other than leaf  we add left + right leaf nodes ans 

//since we use recursion make use of helper methods keep in mind

public class SumRootToLeafNo {

      class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val = val;
        }

    }

    public int sumNumbers(TreeNode root){
        return helper(root,0);
    }
    private int helper(TreeNode node , int sum){
          // Base case: If the node is null, it contributes 0 to the sum
        if(node==null){
            return 0;
        }
        //changes sum 
        sum = 10*sum+node.val;  //**** */

        if(node.left==null && node.right==null){
            return sum;
        }
 // Step 3: If not a leaf, keep building numbers in both subtrees
    // Add results from left and right because we need total sum of all paths
        //other nodes 
        return helper(node.left, sum) + helper(node.right, sum);
    }
    
}
