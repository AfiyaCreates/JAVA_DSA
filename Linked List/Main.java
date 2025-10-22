//linked list provides non contiguous memory allocation
//each block in the list can have random memory (add)..connected using arrows
//every singly linkedlist  node knows about the nextr node 
//head ref var - points to first node
//tail- points to last
//every single node has 2 roperties - its val and next node 
//class node{
// int val;
// node next;
// }

public class Main {
    public static void main(String[] args) {
        // for singly linked list

        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        // list.display();

        // list.insertLast(88);
        // list.display();

        // list.insert(55, 3);
        // list.display();

        //insert recursion
        list.insertRec(88,2);
        list.display();

        // System.out.println(list.deleteFirst());
        // list.display(); //delets and displays val of deletd node

        // System.out.println(list.deleteLast());
        // list.display();//end is just a statment not a node here

        // System.out.println(list.delete(2));
        // list.display();

        // **********************************************
        // for doubly linked list

        // Doubly list = new Doubly();
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);

        // list.insertLast(88);
        // list.insertAfter(3,100);
        // list.display(); 

        //**************************************** 
        //circular ll
        // Circular list = new Circular();
        // list.insertAftertail(2);
        // list.insertAftertail(3);
        // list.insertAftertail(4);
        // list.insertAftertail(5);

        // list.delete(3);
        // list.display();


    }
}