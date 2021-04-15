package implementation;

import myinterface.BinarySearchTreeADT;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {

    // Root of binary search tree..
    Node<E> root = null;

    // getter for root..
    public Node<E> getRoot() {
        return root;
    }

    // insert new node to the binary search tree..
    @Override
    public void insert(E data) {
        Node<E> node = new Node<>(data);
        if (root == null) {
            root = node;
        } else {
            Node<E> temp = root;
            Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (data.compareTo(temp.getData()) > 0) {
                    temp = temp.getRight();
                } else {
                    temp = temp.getLeft();
                }
            }
            if (data.compareTo(parent.getData()) <= 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    @Override
    public boolean search(E searchElement) {
        boolean response = false;
        if (root != null) {
            Node<E> temp = root;
            while (temp != null && !response) {
                if (searchElement == temp.getData()) {
                    response = true;
                } else if (searchElement.compareTo(temp.getData()) < 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
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
