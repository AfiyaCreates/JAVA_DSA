//AVL trees- Adelson Velski and Lendis
//need of avl trees - the unbalanced bst or the skewed trees have o(n)..complexity so to overcome this prob
//that is for a balancd bst the diff between the height of left and right trees  for every single node should not be more than 1
//it can be -1, +1,0 ....if other than this then that is an unbalanced bst
//solution - self balancing bt - avl
//if while adding a node the tree becomes unbalanced then we just re structure the tree and then add it in a way that it maintains the balance

//algo - insert the node normally 
//starting from that node to up (bottom up)..check which node is unbalanced...for that node we will solve
//take that node as parent and its chid node and others as a tree t1,t2,t3...
// using one of the 4 rules rotate
//see the vid to check the diagram for left and right rotation 

//implementing - 4 cases(see diagrams in ds or ada notes)
//1 left-left case = right rotate .....on p
//2 left-right ->(left rotate c) left-left = (right rotate p)(same as 1)
//3 right-right = left rotate
//4 right-left -> (right rotate) right-right = left rotate (same as 3)

//if subtree was unbalanced and we balanced it it wont affect the rest tree , its already balanced

//time complexity: insertion - logn + o(1)..for rotation

public class AVL {

    private Node root;

    public AVL() { // constructor

    }

    private class Node {
        int value;
        Node left;
        Node right;
        int height; // for simplicity ..cn chcek balanced or not

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public boolean isEmpty() {
        return root == null; // if root is null then tree is empty

    }

    public int height(Node node) { // to get height of a node
        if (node == null) {
            return -1;
        }
        return node.height; // returns height ...we will set the height..during insertion
    }

    // thi sis helper methid to start this with root node we need wanother method
    public void display() {
        displayhelper(root, "Root node:");
    }

    private void displayhelper(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue()); // in this pattern it will print
        displayhelper(node.left, "Left child of " + node.getValue() + ":"); // recursively call this funtion to get the
                                                                            // left
        // of curr node
        displayhelper(node.right, "Right child of " + node.getValue() + ":"); // recursively call this funtion to get
                                                                              // the
        // right of curr node
    }

    public void insert(int value) {
        root = inserthelp(value, root); // insert it abck to root ...so assighn to root
    }

    private Node inserthelp(int value, Node node) {// value - we wan tot insert , node - we want to compare to
        if (node == null) { // eg - node.left is null...then create it and return it
            node = new Node(value);
            return node; // change
        }
        if (value < node.value) {
            node.left = inserthelp(value, node.left); // we are returning a node
        }
        if (value > node.value) {
            node.right = inserthelp(value, node.right); // we are returning a node
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node); // if no change return the current node .......................***

    }
    //****************************************** */

    // AVL ROTATION***
    // use the diagram to understand
    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left case
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left-left case = rotate right
                return RightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left-right case =left rotate = rotate right
                node.left = LeftRotate(node.left);
                return RightRotate(node);
            }

        }

        if (height(node.left) - height(node.right) < -1) {
            // right case
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right-right case = rotate left
                return LeftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // right-left case - right rotate - left rotate
                node.right = RightRotate(node.right);
                return LeftRotate(node);
            }

        }

        return node; //other cases ...when no rotation needed
    }

    //LEFT ROTATE AND RIGHT ROTATE METHOD
public Node RightRotate(Node p){ //only t2 will be changed
    Node c = p.left;
    Node t = c.right;
    c.right = p;
    p.left = t;
    
    p.height= Math.max(height(p.left),height(p.right))+1;
    c.height= Math.max(height(c.left),height(c.right))+1;
    //since new node is c(root)
    return c;
}
public Node LeftRotate(Node c){ //only t2 will be changed
    Node p = c.right;
    Node t = p.left;
    c.right = t;
    p.left = c;
    
    p.height= Math.max(height(p.left),height(p.right))+1;
    c.height= Math.max(height(c.left),height(c.right))+1;
    //since new node is c(root)
    return p;
}

    //****************************************** */


    public boolean balanced() { // dont have to pass anything just chech if the tree is ablanced or not
        return balancedHelp(root);
    }

    private boolean balancedHelp(Node node) {
        if (node == null) {
            return true;
        }
        // abs - abstract
        // check for left and right tree then again chech for left subtree and right sub
        // tree
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balancedHelp(node.left)
                && balancedHelp(node.right);
    }

    // to insert multiple items
    public void populate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            insert(nums[i]);
        }
    }

    // for sorted arr
    public void sorted(int[] nums) {
        sortedhelp(nums, 0, nums.length);
    }

    public void sortedhelp(int[] nums, int start, int end) {
        if (start >= end) {
            return; // base condition
        }
        int mid = (start + end) / 2;
        insert(nums[mid]);
        sortedhelp(nums, start, mid);
        sortedhelp(nums, mid + 1, end);
    }

    public static void main(String[] args) {
       
    }

}
