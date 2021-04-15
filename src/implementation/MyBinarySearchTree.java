package implementation;

import myinterface.BinarySearchTreeADT;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {

    // Root of binary search tree..
    Node<E> root = null;

    // getter for root..
    public Node<E> getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {

    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
