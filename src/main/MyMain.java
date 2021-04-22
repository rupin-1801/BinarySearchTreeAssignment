package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();

        // insert data to tree..
        // 40, 4, 50, 2, 14, 56, 45, 1, 10, 90, 11, 80
        myBinarySearchTree.insert(40);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(2);
        myBinarySearchTree.insert(14);
        myBinarySearchTree.insert(56);
        myBinarySearchTree.insert(45);
        myBinarySearchTree.insert(1);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(90);
        myBinarySearchTree.insert(11);
        myBinarySearchTree.insert(80);

        // search elements in tree..
        System.out.println(myBinarySearchTree.search(45));
        System.out.println(myBinarySearchTree.search(89));
        System.out.println(myBinarySearchTree.search(1));

        // inorder, preorder and postorder traversal..
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());
        System.out.println();
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println();
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        System.out.println();
        myBinarySearchTree.reverseInOrder(myBinarySearchTree.getRoot());
        System.out.println();

        // deleting nodes..
        // root node..
        myBinarySearchTree.delete(40);
        // leaf node..
        myBinarySearchTree.delete(80);
        // node having right child only..
        myBinarySearchTree.delete(10);
        // node having left child only..
        myBinarySearchTree.delete(14);
        // node having both left and right child..
        myBinarySearchTree.delete(4);
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());

        // printing height of a node...
        System.out.println();
        System.out.println(myBinarySearchTree.height(myBinarySearchTree.getRoot()));
    }
}
