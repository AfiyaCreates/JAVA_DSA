//why trees?
//coz we can add delete traverse....all these stuff can be done in O(logn)
//ordered storage like in bst - left has smaller values than right
//cost efficient

//binary tree - 0,1,2 children
//drawback - for unbalanced bt like skewed tree ....traversal will be   O(n)
//solved using - self balancing bt..avl

//applications -
//file systems....databses for fast retrieval...netork routing..maths...decision trees
//compression of files huffman code...graphs

//Node {
//    int value
//    node left
//    node right }
//size - total nodes
//height - max no of edges between from the node to leaf node.....(remember not root node)
//level - height of root - height of that node
//degree - no of children - 0 1 2

//types of bt 
//complete bt - all levels full...last level full from left to right
//full bt / strict  - each node has either 0 or 2 children
//perfect bt - all levels are full 
//height balanced bt - avg height o(log n)
//skewed bt - every node has only 1 child...avg height - o(n)
//ordered bt - each node has a property like bst

//properties
// in perfect bt height h-
//total nodes - 2^(h+1) - 1
//no of nodes at each level - 2^i 
//no of leaf nodes - 2^h
//internal nodes - 2^h -1 
//levels?..if n no of leaves- logn +1
//if n nodes - log(n+1) mi levels

//if strict bt
//no of leaf nodes = internal nodes + 1

//no of leaf nodes = internal nodes with 2 children apart from root node + 1

//implementation - using linkedlist .....or using sequential array
//for noarmal bt we use linked list
//but for heap ..or segment trees we use array