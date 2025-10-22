//use inorder traversal - when to find the smallest elements...like bst is given traverse and store elemnts in order then take the kth element

//dfs uses - inorder preorder postorder 
//we can use recursion to solve its easy 
//can use iteration using stacks 

//in ques use recursion easy short and optimized

import java.util.Stack;


public class Dfs {
      class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val = val;
        }

    }
    void dfsStack(TreeNode node){
        if(node == null){
            return ;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        //we add right node foirst then left coz in stca its lifo and we remove the left node first then right 
        while(!stack.isEmpty()){
            TreeNode removed = stack.pop();
            System.out.println(removed.val);

            if(removed.right!=null){
                stack.push(removed.right);
            }
               if(removed.left!=null){
                stack.push(removed.left);
            }


        }
    }
    

}
