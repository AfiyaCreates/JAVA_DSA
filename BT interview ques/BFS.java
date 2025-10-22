//BFS - searching along the breadth of the tree
//1-2-3-4-5-6-7
//use - when ans lies near the root node
//when asked to search by level...eg - to compute sum of qll nodes at each level
//we use queue - start from root node ..print left and right.....remove node from front ...for next node print left and right..
//for printing we are actually adding left and right to queue
//we can create a list of list to stroe elemnets 

//time comp - O(n)...space comp- O(n/2) = O(n)..constant removed

// 🧠 Quick Reminder on offer() vs add():
// offer() is safer because it doesn’t throw an exception if the queue is full (in bounded queues).

// poll() returns null if the queue is empty, while remove() would throw an exception.



import java.util.*;

class BFS {
    private Node root;

    public BFS() { // constructor

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
        List<List<Integer>> result = new ArrayList<>();
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
                currLevel.add(curr.value);

                //now add its left and right nodes to q
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            result.add(currLevel); //add this list of current level nodes to final result list

        }
        return result;

    }

    public static void main(String[] args) {

    }
}