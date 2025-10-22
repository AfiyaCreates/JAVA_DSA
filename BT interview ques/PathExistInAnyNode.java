//check if path exists in bt from any node
//path not necessarily start from root node ..or en at leaf node ...can be anywhere in between
//eg - path= []
//can have multiple ans 
//we know dfs will be used

import java.util.LinkedList;
import java.util.List;

// Think of DFS like walking into a maze:
// Go down (add node to path)
// Explore left
// Explore right
// Go back (remove node from path) ← This is backtracking

// DFS (Depth First Search) to visit all nodes.
// A path list that stores the nodes along the current DFS route from the root down to the current node.
// At each node, we will:
// Check all possible subpaths ending at this node by summing backward through the path list.
// Increment the count whenever we find a sum equal to targetSum.
// Backtracking to remove the current node before returning up the recursion.

// We backtrack right after we finish exploring a node’s left and right subtrees, and before we return to its parent in the recursion.

//if the ques asks to return the path instead of count ..put it in a list 
//create  a list of list 

import java.util.*;

public class PathExistInAnyNode {
        // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    // Count number of paths in the tree that sum to a given value
    public int countPaths(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();  // to store path 
        return helper(root, targetSum, path);
    }

    private int helper(TreeNode node, int targetSum, List<Integer> path) {
        if (node == null) {
            return 0; // No path if node is null
        }

        // Add current node to path
        path.add(node.val);

        int count = 0;
        int sum = 0;

        // Check all sub-paths ending at the current node
        // Traverse path backwards (from current node upwards)
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i); //get sum 
            if (sum == targetSum) {
                count++; // Found a valid path
            }
        }

        // Recurse for left and right children
        count += helper(node.left, targetSum, path);
        count += helper(node.right, targetSum, path);

        // Backtrack: remove current node before returning to parent
        //after left recursion or right recursion is complete at elaf node 
        path.remove(path.size() - 1);

        return count;
    }


}
