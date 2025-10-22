//it simple level order traversal bfs
//and print the right lastnode of each level 

//same code as bfs just some change ..add this in for loop 
//use List<Integer>..not list of list 
// if(i==levelSize-1){
//                     //if last node of the level add it to ans
//                     result.add(curr.value);
//                 }

import java.util.*;

public class BT_RightSideView {

    private Node root;

    public BT_RightSideView () { // constructor

    }

    private class Node {
        int value;
        Node left;
        Node right;
    }

    public List<Integer> levelOrder(Node root) {
        // one list for result ...inner list to store elements at each level
        List<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>(); // queue strores the nodes temporarily

        if (root == null) { // if empty tree
            return result;
        }

        q.offer(root); // offer - insert ...initially root node will be in queue
        while (!q.isEmpty()) { // until all nodes are traverssed and tree becomes empty
            int levelSize = q.size();// eg - first level 1 node...2 level 2 nodes ...3 level 4 nodes...so size of
                                     // level 3 is no of nodes in that level
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                // jb tk ek level complete nhi ho jata tb tk uske sare nodes ko pop krke print
                // kro and uske adj left and right nodes ko insert kro queue me
                Node curr = q.poll(); // removes the front element
                // add it to curr list ans...curr level list


                if(i==levelSize-1){
                    //if last node of the level add it to ans
                    result.add(curr.value);
                }
                //now add its left and right nodes to q
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {

    }
}

