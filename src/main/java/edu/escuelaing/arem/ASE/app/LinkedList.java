package edu.escuelaing.arem.ASE.app;

public class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static void printLinkedList(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.format(node.getData() + " ");
            printLinkedList(node.getNext());
        }
    }

    public void insertNode(double data) {
        Node nodo = new Node();
        nodo.setData(data);
        nodo.setNext(null);
        if (head == null) {
            head = nodo;
            tail = nodo;
        } else {
            tail.setNext(nodo);
            tail = nodo;
        }
    }


}
