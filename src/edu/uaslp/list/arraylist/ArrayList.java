package edu.uaslp.list.arraylist;

import java.util.Arrays;

public class ArrayList<T>{
    private Object array[];
    private int capacity;
    private int size;

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

    public Object getAt(int index) {
        return array[index];
    }

    public void print() {
        int i;
        for (i = 0; i < size; i++)
            System.out.println(array[i]);
    }
}
