//serialize - convert tree to file (sequence of bits)...tree to string 
//deserialize - opp of serialize

//difficult try to understand 

//we can convert into list of strings to make things easier
//we must know - the preorder and inorder traversal to serialize 
//store elements in preorder ..along with null
//usng this we can construct the tree

//time complexity - o(n)
//space complexity - 

//better method - using heaps
import java.util.*;


public class SerializeDeserializeBT {

    // Root of the tree (optional for usage)
    TreeNode root;

    // Constructor
    public SerializeDeserializeBT() {
    }

    // Simple TreeNode structure
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // -------------------------------
    // SERIALIZATION: Tree → List<String>
    // -------------------------------
    public List<String> serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        serializeHelper(node, list); // fill list with preorder values
        return list; // return final list
    }

    // Helper for serialize()
    private void serializeHelper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("n"); // use "n" to represent NULL child
            return;
        }
        // Step 1: add root value
        list.add(String.valueOf(node.val));

        // Step 2: add left subtree
        serializeHelper(node.left, list);

        // Step 3: add right subtree
        serializeHelper(node.right, list);
    }

    // -------------------------------
    // DESERIALIZATION: List<String> → Tree
    // -------------------------------
    public TreeNode deserialize(List<String> list) {
        // Reverse list so we can remove elements from the end (faster than removing from front)
        Collections.reverse(list);
        return deserializeHelper(list);
    }

    // Helper for deserialize()
    private TreeNode deserializeHelper(List<String> list) {
        // Remove the last element (which is the "current" node's value)
        String val = list.remove(list.size() - 1);

        // If the value is "n", it means this is a NULL node → return null
        if (val.equals("n")) {
            return null;
        }

        // Create a node from the value
        TreeNode node = new TreeNode(Integer.parseInt(val));

        // Recursively build left subtree
        node.left = deserializeHelper(list);

        // Recursively build right subtree
        node.right = deserializeHelper(list);

        return node; // return the constructed node
    }
}