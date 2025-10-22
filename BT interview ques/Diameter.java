//diameter of a tree
//uses - dfs
//diameter - is the longest path **between any 2 nodes in the tree 
//since we need to go up down to calc the path we know dfs is used 
//its not necessary t pass through the root node  

//calc height for each node ...then for each node calc diameter 
//at end we return max diameter
//height - max of leftheight, rightheight + 1
//diameter - lefheight + rightheight +1

//in this ques we are taking left height then right height  then root node ..so its kinda post order traversal

public class Diameter {
    class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
    int diameter=0;
    public int diamtereOfBt(Node root){
        height(root);
        return diameter-1; //coz we ant to give length of path and our func is returning nodes
    }

    int height(Node node){
        if(node==null){
            return 0;//leaf node ..since height is max+1...for leaf node it returns 1
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int dia = leftheight + rightheight +1;
        diameter = Math.max(diameter,dia); //returns the max diameter so far 
        return Math.max(leftheight,rightheight)+1;
    }
    
}
