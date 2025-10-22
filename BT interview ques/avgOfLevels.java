//since levels avg ...normal bfs 
//instead of using innel level list just calc and add the avg of each level to final list
//and use double instead of integer for list 

import java.util.*;

class avgOfLevels {
    private Node root;

    public avgOfLevels() { // constructor

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

    public List<Double> levelOrder(Node root) {
        // one list for result ...inner list to store elements at each level
        List<Double> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>(); // queue strores the nodes temporarily

        if (root == null) { // if empty tree
            return result;
        }

        q.offer(root); // offer - insert ...initially root node will be in queue
        while (!q.isEmpty()) { // until all nodes are traverssed and tree becomes empty
            int levelSize = q.size();// eg - first level 1 node...2 level 2 nodes ...3 level 4 nodes...so size of
                                     // level 3 is no of nodes in that level
            double avg = 0; // calc for each level
            for (int i = 0; i < levelSize; i++) {
                
                // jb tk ek level complete nhi ho jata tb tk uske sare nodes ko pop krke print
                // kro and uske adj left and right nodes ko insert kro queue me
                Node curr = q.poll(); // removes the front element
                // add it to curr list ans...curr level list
                avg += curr.value; //to calc avg take sum of all nodes in that level 
                // now add its left and right nodes to q
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
               
            }
             //to take avg // Compute average after the loop
            avg = avg/levelSize;
            
            result.add(avg); // add this list of current level nodes to final result list

        }
        return result;

    }

    public static void main(String[] args) {

    }
}