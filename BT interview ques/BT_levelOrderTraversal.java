//its level order traver traversal but in reverse order 
//like bfs in reverse
//eg - we print from root to leaf ..like [1]-[2,3]-[4,5]
//but now print from leaf to root ...like ..[4,5]-[2,3]-[1]

//so instead of adding the levels one by one like first 1  then 23 then 45
//we add the new level add index 0 each time..so  the prev added levels shifts right...
//in this way we get [4,5]-[2,3]-[1]

//same code as bfs
//just chnage add line to - result.add(0,curr)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BT_levelOrderTraversal {
    Node root;
    public BT_levelOrderTraversal(){

    }

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
        this.value = value;
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
            result.add(0,currLevel); //add this list of current level nodes to final result list

        }
        return result;

    }

    public static void main(String[] args) {

    }
}


    

