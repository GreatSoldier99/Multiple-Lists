package edu.uaslp.list.linkedlist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

public class LinkedList<H> implements List<H> {
    private Node<H> head;
    private Node<H> tail;
    private int size;

    private class LinkedListIterator implements Iterator<H> {
        private Node<H> currentNode;

        LinkedListIterator(){
            currentNode=head;
        }

        public H next(){
            H data=currentNode.data;
            currentNode=currentNode.next;
            return data;
        }

        public boolean hasNext() {
            return currentNode!=null;
        }
    }

    public Iterator<H> getIterator(){
        return new LinkedListIterator();
    }

    public void add(H dato) {
        Node<H> node = new Node<>();

        node.data = dato;

        if (head == null) {
            head = node;
        }

        node.previous = tail;

        if (tail != null) {
            tail.next = node;
        }

        tail = node;
        size++;
    }

    public void insert(H dato, int index) {
        int counter = 0;
        Node iterator = head;

        if (index < 0 || index > size) {
            return;
        }

        if (index == size) {
            add(dato);
            return;
        }

        while (counter < index && iterator != null) {
            iterator = iterator.next;
            counter++;
        }

        Node<H> node = new Node<>();

        node.data = dato;
        node.next = iterator;
        node.previous = iterator.previous;

        if (iterator.previous == null) {
            head = node;
        } else {
            iterator.previous.next = node;
        }
        iterator.previous = node;
    }

    public void delete(int index) {
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

    public int getSize() {
        return size;
    }

    public H getAt(int index) {
        int counter = 0;
        Node<H> it = head;

        while (counter < index && it != null) {
            counter++;
            it = it.next;
        }

        return it == null ? null : it.data;
    }
}
