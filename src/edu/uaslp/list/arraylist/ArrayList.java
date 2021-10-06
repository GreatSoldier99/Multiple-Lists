package edu.uaslp.list.arraylist;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object array[];
    private int capacity;
    private int size;

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex=0;
        public final ArrayList<T> arrayList;

        ArrayListIterator(ArrayList<T> arrayList){
            this.arrayList=arrayList;
        }

        public T next() {
            return (T)array[currentIndex++];
        }

        public boolean hasNext() {
            return currentIndex<size;
        }
    }

    public Iterator<T> getIterator(){
        return new ArrayListIterator(this);
    }

    public ArrayList() {
        array= new Object[10];
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
        int i;
        size++;
        if (size > capacity) {
            capacity += 10;
            array = Arrays.copyOf(array, capacity);
        }
        for(i=(size-1);i>index;i--)
            array[i]=array[i-1];
        array[i]=dato;
    }

    public void delete(int index) {
        int i;
        for(i=index;i<size;i++)
            array[i]=array[i+1];
        size--;
    }

    public int getSize() {
        return size;
    }

    public T getAt(int index) {
        return (T)array[index];
    }
}
