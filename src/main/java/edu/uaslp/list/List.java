package edu.uaslp.list;

public interface List<T>{

    void add(T dato);

    int getSize();

    T getAt(int index) throws MyIndexOutOfBoundException;

    void delete(int index) throws MyIndexOutOfBoundException;

    void insert(T data, int index);

    Iterator<T> getForwardIterator();

    Iterator<T> getReverseIterator();
}
