package edu.escuelaing.arem.ASE.app;

/**
 * @author Santiago
 */
public class Node {
    private double data;
    private Node next;

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}