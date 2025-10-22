//populating next right pointers in each node
//thats connecting nodes on each level like linkedlist
//without using queue..use linkedlist approach 
//start from root as current node 
//connect root.left.next=root.right.....now 
//root.left becomes the current node...now connect curr.left.next=curr.right.....now before moving to next node of level 2 
//we neec to connect this node to left node of the node on the right of curr
//see diagram in vid

public class PopulatingNextRight {
    Node root;

    public PopulatingNextRight() {}

    class Node {
        int value;
        Node left;
        Node right;
        Node next;  // ✅ Added this field

        Node(int value) {
            this.value = value;
        }
    }

    // Connects next right pointers in a perfect binary tree
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;

        // Traverse level by level (except the leaf level)
        while (leftMost.left != null) {
            Node current = leftMost;

            // Traverse nodes in the current level using already established `next` pointers
            while (current != null) {
                // Connect left child to right child
                current.left.next = current.right;

                // Connect right child to the next node's left child (bridge)
                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                // Move to next node in the same level
                current = current.next;
            }

            // Move to the next level
            leftMost = leftMost.left;
        }

        return root;
    }
}
