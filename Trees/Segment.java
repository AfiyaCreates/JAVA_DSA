//segment trees
//why - for eg in an array find sum of elements from one index to another ...takes O(n)
//so to solve it in o(logn)...better approach is using segment trees
//use segment trees whenever to perform an operation or query on a range of values
//eg-sum , max, min, avg, product....in a range
//even for updating data in segment trees it takes logn time..

//segment tree - is a bt which has info about the interval and also the operation we are performing
//segment tree is a full bt- every node except the leaf has 2 children...
//so leaf nodes - n...internal nodes=n-1...total nodes = 2n-1
//see the vid diagram of tree 
//the root node by default cntains info for all intervals...eg-array with index 0-7...
//root node contains- interval[0,7] and the operation query/sum=27(which is sum of no from 0 to 7 index) 
//after dividing into 2 child nodes we get ...[0,3]sum=24 ..... [4,7]sum=3
//continues
//since its a binary tree it gets divided by n/2...at last only ne element will be left ...thats the base condition

//now we got the tree...if we have to find the sum between a range ..eg- between 2 indices
//we have 3 conditions
//eg- want sum between range [2,6] indexes
//case1- node interval is inside query interval -[4,5]...its sum is a part of the ans - return the value
//case2- node interval comltely outside the query interval (eg- node start index > query end index) or (node end < query start) - [7,8] - return the default value of the query ...in this case 0
//case3- overlapping - [0,3]- ask the left side and right side to give ans ...
//while returning we add...coz its sum

//updating element in segment trees
//eg - change index 3 eleemnt with 14
//first check if index lies in interval root
//then check left and right ...continues ...at end we reach leaf node with index 3 ...change its value
//if no 3 return the value 

//the only disadvantage is that it takes extra space we have to create an entire tree

//for each node set the interval and value
public class Segment {
    Node root;

    public Segment(int[] arr) { // coz it will take an array input created when the constructor is called...and
                                // will create a tree of that arr
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {  //each time create a node mention its start and end interval
            this.startInterval = startInterval;
            this.endInterval = endInterval;

        }
    }

    private Node constructTree(int[]arr,int start, int end){
        if(start==end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        //create a new node for the index u are at 
        Node node = new Node(start,end);
        int mid = (start+end)/2;
        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr, mid+1,end);
        node.data = node.left.data + node.right.data;  //this line performs the sum operation....
        //node.left returns node.right returns ..bth its value gets added and we get the value for the current node
        return node ;
    }

    public void display(){
        displayHelp(root);

    }

    //query ...3 cases
    public int query(int s, int e){
        return queryhelp(root,s,e);
    }
    private int queryhelp(Node node,int s,int e){
        if(node.startInterval>=s && node.endInterval<=e){
            //node is completely inside the query
            return node.data;
        }else if(node.startInterval>e||node.endInterval<s){
            //completely outside
            return 0 ;
        }else{
            //overlapping ...check the left and right node
            return queryhelp(node.left, s, e) + queryhelp(node.right, s, e);  //while returning we are adding
        }
    }

    //update 
    public void update(int index, int value){
        root.data = updateHelp(root, index, value); //roots data gets updated at the end so store it back to root
    }

    private int updateHelp(Node node,int index, int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){  //leaf node
                //update 
                node.data = value;
                return node.data;///returns the updated value the above tree sum gets updated

            }else{
                int leftAns = updateHelp(node.left, index, value);
                int rightAns = updateHelp(node.right, index, value);

                node.data = leftAns+rightAns;
        return node.data;

            }
        }
        //if its not in trhe range ..outside ..simply return the value 
        return node.data;
    }
   



    private void displayHelp(Node node){ //************understand this */

        String str ="";
        //left
        if(node.left!=null){
            str = str+"Interval = [ "+ node.left.startInterval + "-" + node.left.endInterval +" ] and data: " + node.left.data + "->";
        }else{
            System.out.println("No left child");
        }
        //current 
        str = str+"Interval = [ "+ node.startInterval + "-" + node.endInterval +" ] and data: " + node.data + "<-";


        //right
         if(node.right!=null){
            str = str+"Interval = [ "+ node.right.startInterval + "-" + node.right.endInterval +" ] and data: " + node.right.data ;
        }else{
            System.out.println("No right child");
        }

        System.out.println(str+ '\n');
        //call recursion 
        if(node.left!=null){
            displayHelp(node.left);
        }
         if(node.right!=null){
            displayHelp(node.right);
        }


    }

    public static void main(String[] args) {
        int[] nums = { 3, 8, 6, 7, -2, -8, 4, 9 };
        Segment tree = new Segment(nums);
        // tree.display();

        System.out.println(tree.query(1,6));
    }

}
