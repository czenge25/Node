/*
CZ
9/26/23
 */

public class Node<T> {

    private T data;
    private Node parent;
    private Node child;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node parent, Node child) {
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString(Node n) {
        return "Node: " + n.getData().toString();
    }

    public boolean equals(Node n1, Node n2) {
        return n1.getData().equals(n2.getData());
    }

}