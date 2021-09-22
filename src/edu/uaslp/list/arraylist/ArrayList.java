package edu.uaslp.list.arraylist;

import java.util.Arrays;

public class ArrayList {
    private int[] entero;
    private int capacity;
    private int size;

    public ArrayList() {
        entero = new int[10];
        capacity = 10;
    }

    public void add(int dato) {
        size++;
        if (size > capacity) {
            capacity += 10;
            entero = Arrays.copyOf(entero, capacity);
        }
        entero[size - 1] = dato;
    }

    public void insert(int dato, int index) {
        int i;
        size++;
        if (size > capacity) {
            capacity += 10;
            entero = Arrays.copyOf(entero, capacity);
        }
        for(i=(size-1);i>index;i--)
            entero[i]=entero[i-1];
        entero[i]=dato;
    }

    public void delete(int index) {
        int i;
        for(i=index;i<size;i++)
            entero[i]=entero[i+1];
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getAt(int index) {
        return entero[index];
    }

    public void print() {
        int i;
        for (i = 0; i < size; i++)
            System.out.println(entero[i]);
    }
}
