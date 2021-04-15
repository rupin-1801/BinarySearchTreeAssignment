package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {

    // variables of Node class..
    private E data;
    private Node<E> left;
    private Node<E> right;

    // Constructor for data..
    public Node(E data) {
        this.data = data;
    }

    // getters and setters..
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}
