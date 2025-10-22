//level order successor is ...given a tree and a node value...return the node value ..just next to the given node 
//that is return the node on the right of that node in same level 

//simple bfs
//whenever in loop we are removing an item ..we know its next item in queue 
//so when the item to remove == th egiven value ..stop and return the value next to it in queue

//changed the method a bit returning a node
//no need of for loop 
import java.util.*;

public class LevelOrderSuccessor {

    private Node root;

    public LevelOrderSuccessor() { // constructor

    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Node levelOrder(Node root, int x) {
        // one list for result ...inner list to store elements at each level
        Queue<Node> q = new LinkedList<>(); // queue strores the nodes temporarily

        if (root == null) { // if empty tree
            return null;
        }

        q.offer(root); // offer - insert ...initially root node will be in queue

        while (!q.isEmpty()) { // until all nodes are traverssed and tree becomes empty
            Node curr = q.poll(); // removes the front element

            // now add its left and right nodes to q
            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }

            if (curr.value == x) {
               return q.peek();  // Return next node in level order
            }

        }
        return null;
    }

    public static void main(String[] args) {

    }
}
