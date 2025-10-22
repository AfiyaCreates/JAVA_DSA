//binary search tree- left - smaller ...right - greater 
//insertion - always start from root node
//balanced tree - height diff of any 2 nodes on the same level  should be less than or equal to 1
//while inertion it will compare only 1 itm at each level...
//max height of bst - logn...therefore max comparisons ...logn

//if array is sorted ...and we dont want skewed unbalanced tree
//we can take the middle element of arr and divide it into 2 parts
//and then call the left side and right side...like again take the middle of lhs....follows...like merge sort
//so recursively calling the same function
//no need of pointers can use the insert method
//insert the mid
//time complexity for sorted elements will be - n*logn
public class BST {

    private Node root;

    public BST() { // constructor

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
        return node; // if no change return the current node

    }

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
    //for sorted arr
    public void sorted(int[]nums){
        sortedhelp(nums,0,nums.length);
    }
    public void sortedhelp(int[]nums, int start, int end){
        if(start>=end){
            return; //base condition
        }
        int mid = (start+end)/2;
        insert(nums[mid]);
        sortedhelp(nums,start,mid);
        sortedhelp(nums,mid+1,end);
    }


    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
    }

}
