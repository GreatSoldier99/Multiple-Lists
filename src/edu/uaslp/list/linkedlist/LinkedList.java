package edu.uaslp.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int dato){
        Node node = new Node();

        node.data = dato;

        if(head == null) {
            head = node;
        }

        node.previous = tail;

        if(tail != null) {
            tail.next = node;
        }

        tail = node;
        size ++;
    }

    public void insert(int dato, int index){

    }

    public void delete(int index){

    }

    public int getSize(){
        return size;
    }

    public int getAt(int index){
        int counter = 0;
        Node it = head;

        while(counter < index && it != null){
            counter++;
            it = it.next;
        }

        return it == null ? 0 : it.data;
    }
}
