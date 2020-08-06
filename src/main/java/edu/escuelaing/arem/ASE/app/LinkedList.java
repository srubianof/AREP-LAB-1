package edu.escuelaing.arem.ASE.app;

public class LinkedList {
    private Node head;
    private Node tail;

    public void insertarNodo( double data){
        Node nodo = new Node();
        nodo.setData(data);
        nodo.setNext(null);
        if (head == null){
            head = nodo;
        } else {
            tail.setNext(nodo);
            tail = nodo;
        }
    }
}
