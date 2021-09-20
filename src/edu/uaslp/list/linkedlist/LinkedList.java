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
        int counter = 0;
        Node iterator = head;

        if (index < 0 || index > size) {
            return;
        }

        if(index == size){
            add(dato);
            return;
        }

        while (counter < index && iterator != null) {
            iterator = iterator.next;
            counter++;
        }

        Node node = new Node();

        node.data = dato;
        node.next = iterator;
        node.previous = iterator.previous;

        if(iterator.previous == null){
            head = node;
        } else {
            iterator.previous.next = node;
        }
        iterator.previous = node;
    }

    public void delete(int index){
        int counter = 0;
        Node iterator = head;

        if (index < 0 || index >= size) {
            return;
        }

        while (counter < index && iterator != null) {
            iterator = iterator.next;
            counter++;
        }

        if (iterator.previous == null) {
            head = iterator.next;
        } else {
            iterator.previous.next = iterator.next;
        }

        if (iterator.next == null) {
            tail = iterator.previous;
        } else {
            iterator.next.previous = iterator.previous;
        }

        size--;
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

    public void print(){
        Node iterator = head;

        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
