//print tree nodes in zig zag order 
//eg - 1-3-2-4-5-6-7-11-10-9-8
//snce level - so bfs used

//it follows 2 order 
//norml order - remove from front add from back 
//reverse order - remove from back add from front

//can implement using dqueue
//maintain a boolean flag to know when to use which order 
//eg reverse flag = false (for root ) then  for next level ..true...

//we can have a better approach code see on chat 

import java.util.*;

public class ZigZagLevel {

    private Node root;

    public ZigZagLevel() { // constructor

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

    public List<List<Integer>> levelOrder(Node root) {
        // one list for result ...inner list to store elements at each level
        List<List<Integer>> result = new  ArrayList<>();
        Deque<Node> q = new LinkedList<>(); // queue strores the nodes temporarily

        boolean reverse = false;

        if (root == null) { // if empty tree
            return result;
        }

        q.offer(root); // offer - insert ...initially root node will be in queue
        while (!q.isEmpty()) { // until all nodes are traverssed and tree becomes empty
            int levelSize = q.size();// eg - first level 1 node...2 level 2 nodes ...3 level 4 nodes...so size of
                                     // level 3 is no of nodes in that level
                LinkedList<Integer> currLevel = new LinkedList<>();  //*****use linkedlist */

            for (int i = 0; i < levelSize; i++) {

                if (!reverse) { // normal order
                    Node curr = q.pollFirst(); // removes the front element
                    currLevel.add(curr.value);
                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }

                } else { // reverse order 
                     Node curr = q.pollLast(); // removes the front element
                    currLevel.add(curr.value); //normall add
                    if (curr.right != null) {//add right first and then left ..to maintain the reverse order of nodes in queue
                        q.addFirst(curr.right);
                    }
                    if (curr.left != null) {  
                        q.addFirst(curr.left);
                    }

                }


            }
            reverse = !reverse;  //sweitching from normal to reverse and vice versa
            result.add(currLevel); // add this list of current level nodes to final result list

        }
        return result;

    }

    public static void main(String[] args) {

    }
}
