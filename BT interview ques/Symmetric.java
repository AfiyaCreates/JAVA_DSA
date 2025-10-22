//symmetric tree
//bfs used ...we goleve by level each level should be mirror image of itself
//if we divifde the tree from the root node vertically

//see diagram and understand to check the matching nodes from left and rigyt 
//in queue we store nodes as ...left.left  then right.right...then left.right and right.left
//while popping compare them if they are equal move forward to nxt level 

import java.util.*;

public class Symmetric {
    Node root;

    public Symmetric() {
        // Default constructor
    }

    // Binary Tree Node definition
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }


    public boolean isSymmetric(Node root){
        Queue<Node> q = new LinkedList<>(); //its type node
        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            //remove and store in node to compare
            Node left = q.poll();
            Node right = q.poll();
            if(left==null && right==null){
                continue; //to check next level 
            }
            if(left==null || right==null){
                return false; //only if one is null and other not ...so no mirror image
            }
            if(left.value != right.value){
                return false;
            }

            q.add(left.left);
            q.add(right.right);

            q.add(left.right);
            q.add(right.left);

        }
        return true;

    }
    
}
