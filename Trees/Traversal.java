//pre order - node left right
//used for evaluating mathematical exp...or making  a copy...serialization from string array

//inorder - left node right
//uses - in bst can visit the nodes in sorted manner

//post order - left right node
//use - to delete a binary tree..or for bottom up calc ..eg-calculating height

//BFS AND DFS / BFT AND DFT *** modt imp topic in tress..for search or traversal
//use these methods in BST file to see its working

// public class Traversal {
//     // pre order
//     public void preorder() {
//         pre(root);
//     }
//     private void pre(Node node) {
//         if (node == null) {
//             return;
//         }
//         System.out.println(node.value);
//         pre(node.left);
//         pre(node.right);
//     }

//     // in order
//     public void inorder() {
//         in(root);
//     }
//     private void in(Node node) {
//         if (node == null) {
//             return;
//         }
//         in(node.left);
//         System.out.println(node.value);
//         in(node.right);
//     }

//      // post order
//     public void postorder() {
//         in(root);
//     }
//     private void post(Node node) {
//         if (node == null) {
//             return;
//         }
//         post(node.left);
//         post(node.right);
//         System.out.println(node.value);
//     }

// }
