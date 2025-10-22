//cousins - nodes on same level but no common parent 
//bfs
//create a separate function to chechk for cousins
//lets take 2 nodes x and y 


public class Cousins {
    Node root;

    public Cousins() {
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

    // Main function to check if two nodes with values val1 and val2 are cousins
    public boolean isCousins(Node root, int val1, int val2) {
        // Find nodes with the given values
        Node node1 = findNode(root, val1);
        Node node2 = findNode(root, val2);

        // If either node doesn't exist in the tree
        if (node1 == null || node2 == null) {
            return false;
        }

        // Check if both nodes are at the same level but not siblings
        return ((getLevel(root, node1, 0) == getLevel(root, node2, 0)) &&
                (!areSiblings(root, node1, node2)));
    }

    // Helper function to find the node with the given value in the binary tree
    Node findNode(Node currentNode, int targetValue) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.value == targetValue) {
            return currentNode;
        }

        // Search in left subtree
        Node leftResult = findNode(currentNode.left, targetValue);
        if (leftResult != null) {
            return leftResult;
        }

        // Search in right subtree
        return findNode(currentNode.right, targetValue);
    }

    // Helper function to check if two nodes are siblings (share the same parent)
    boolean areSiblings(Node currentNode, Node node1, Node node2) {
        if (currentNode == null) {
            return false;
        }

        // Check if current node has both children and if they match node1 and node2
        return ((currentNode.left == node1 && currentNode.right == node2) ||
                (currentNode.left == node2 && currentNode.right == node1) ||
                areSiblings(currentNode.left, node1, node2) ||
                areSiblings(currentNode.right, node1, node2));
    }

    // Helper function to find the level of a node in the binary tree
    int getLevel(Node currentNode, Node targetNode, int currentLevel) {
        if (currentNode == null) {
            return 0; // Node not found
        }

        if (currentNode == targetNode) {
            return currentLevel;
        }

        // Search in left subtree
        int leftLevel = getLevel(currentNode.left, targetNode, currentLevel + 1);
        if (leftLevel != 0) {
            return leftLevel;
        }

        // Search in right subtree
        return getLevel(currentNode.right, targetNode, currentLevel + 1);
    }
}
