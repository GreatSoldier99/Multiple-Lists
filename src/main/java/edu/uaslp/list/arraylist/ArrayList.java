package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object array[];
    private int capacity;
    private int size;

    private class ForwardIterator implements Iterator<T> {
        private int currentIndex = 0;
        public final ArrayList<T> arrayList;

        ForwardIterator(ArrayList<T> arrayList) {
            this.arrayList = arrayList;
        }

        public T next() {
            return (T) array[currentIndex++];
        }

        public boolean hasNext() {
            return currentIndex < size;
        }
    }

    private class ReverseIterator implements Iterator <T>{
        private int currentIndex = size-1;
        public final ArrayList<T> arrayList;

        ReverseIterator(ArrayList<T> arrayList){
            this.arrayList=arrayList;
        }

        public T next() {
            return (T)array[currentIndex--];
        }

        public boolean hasNext() {
            return currentIndex >= 0;
        }
    }

    public Iterator<T> getForwardIterator() {
        return new ForwardIterator(this);
    }

    public Iterator<T> getReverseIterator(){
        return new ReverseIterator(this);
    }

    public ArrayList() {
        array = new Object[10];
        capacity = 10;
    }

    public void add(T dato) {
        size++;
        if (size > capacity) {
            capacity += 10;
            array = Arrays.copyOf(array, capacity);
        }
        array[size - 1] = dato;
    }

    public void insert(T dato, int index) {
        if (index < 0 || index>size){
            return;
        }

        int i;
        size++;

        if (size > capacity) {
            capacity += 10;
            array = Arrays.copyOf(array, capacity);
        }
        for (i = (size - 1); i > index; i--)
            array[i] = array[i - 1];
        array[i] = dato;
    }

    public void delete(int index) {
        int i;

        if (index < 0 || index > size) {
            return;
        }

        for (i = index; i < size; i++)
            array[i] = array[i + 1];
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public T getAt(int index) {
        return (T) array[index];
    }
}
