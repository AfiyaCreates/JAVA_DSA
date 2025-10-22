//path exists in bt from root to leaf 
//eg- path given -[3 9 12 8]..chcek if this path exists in tree or not
//it will be top down so dfs used
//if the pathis from root to leaf ist easy to find 
//first see if node at 0 index = root = return true 
//then check left - if node.val = node at index 1..return false if not .....check on right ...if found return true 
//use index to iterate to nodes in arr

//ofc we need to create  ahelper func
//in recursion keep index+1...not index++

public class PathExistsInBTRootToLeaf {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
        }

    }

    boolean findPath(TreeNode node, int[] arr) {
        if (node == null) {
            return arr.length == 0; // retuens true if we reahed last node itherwise return false
        }
        return helper(node, arr, 0);
    }

    private boolean helper(TreeNode node, int[] arr, int index) {
        if (node == null) {
            return false;
        }
        // if index out of bound or wrong value return false
        if (index >= arr.length || node.val != arr[index]) {
            return false;
        }
        // return true when the path found ..entire path..not just a node at correct
        // index
        // that is when we reach at correct leaf node
        if (node.left == null && node.right == null && node.val == arr[index]) {
            return true;
        }

        // Otherwise, keep searching down the left and right subtrees,
        // increasing the index to match the next element in the array.
        // Use OR because we only need the path to exist in one direction.
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);

    }

}
