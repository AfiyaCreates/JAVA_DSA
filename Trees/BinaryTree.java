
//insert funct - check insert(left)...then insert(right)
//use recursion then backtrack and to previous node again check for insertion 
//like for node a earlier we inserted at left now we go back and insert at right
import java.util.*;

public class BinaryTree {

    private Node root;

    // constructor
    public BinaryTree() {

    }

    private static class Node { // we have to create a class for node
        int value;
        Node left;
        Node right;

        // constructor to initialize nodes
        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner sc) {
        System.out.println("Enter the Root node: ");
        int value = sc.nextInt(); // take input for root
        root = new Node(value); // assign it to root using the constructor
        insert(sc, root);
    }

    private void insert(Scanner sc, Node node) {
        System.out.println("do u want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("enter value: ");
            int value = sc.nextInt();
            node.left = new Node(value); // assign this value to left node
            insert(sc, node.left);// recursively now call for this new left node
        }

        System.out.println("do u want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("enter value: ");
            int value = sc.nextInt();
            node.right = new Node(value); // assign this value to left node
            insert(sc, node.right);// recursively now call for this new left node
        }
    }

    public void display() {
        displayhelp(root, "");
    }

    private void  displayhelp(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value );
        displayhelp(node.left, indent + "\t");
        displayhelp(node.right, indent + "\t");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.display();
    }
}
