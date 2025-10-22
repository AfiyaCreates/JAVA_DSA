//construct a bt from preorder and in order traversal
//pre - 3 8 9 20 15 7    3 is root
//in -  8 9 3 15 20 7    left of 3 is left 3 is root thne right of 3 is right

//we know root in pre order ..use for loop to find te root in inorder
//recursively call the new pre and inorder arr for both lefta nd right of root

//eg - root = 3 (pre)(in)
//using indexing and slicing we understand the position of left and right elemnts 
//use indexing from 0 
//eg - inorder - 3 at index 2...at left we have 2 items 
//so to get left items from pre ...slice (1,3(index+1))..here is exclusive 
//right elements ...(index+1, end)
//left - [8 9][8 9]
//right - [20 15 7][ 15 20 7]

//left = (1,index+1)
//right = (index+1 , end)

//Arrays.copyOfRange()..used

//for better time complexity - instaed of using copyofrange ...can use hashmap 

import java.util.*;

public class BTfromPreAndIn{
    TreeNode root;
    public  BTfromPreAndIn(){

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


    public TreeNode buildTree(int[]preorder, int[]inorder){
        if(preorder.length==0){
            return null;
        }

        int r = preorder[0]; //root node
        int index =0;
        //find index of root in inorder
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==r){
                index = i; //got inex of root
            }
        }
        //create a node with root 
        TreeNode root = new TreeNode(r);
        root.left = buildTree(Arrays.copyOfRange(preorder,1,index+1), Arrays.copyOfRange(inorder,0,index));
        root.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length), Arrays.copyOfRange(inorder,index+1,inorder.length));


        return root;

    }
    
}
