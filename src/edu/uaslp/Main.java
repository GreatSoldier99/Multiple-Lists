package edu.uaslp;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.List;
import edu.uaslp.list.linkedlist.LinkedList;
import edu.uaslp.list.arraylist.ArrayList;

public class Main{
    public static void main(String[] args) {
        List<Integer> books = new LinkedList<>();
        List<String> students = new ArrayList<>();

        books.add(7);
        books.add(70);
        books.add(14);
        books.add(63);
        books.add(56);
        books.add(28);
        books.add(49);
        books.add(35);
        books.add(42);
        books.add(20);
        books.add(21);

        students.add("Juan");
        students.add("Carlos");
        students.add("Patricia");
        students.add("Naomi");
        students.add("Tomas");

        System.out.println("Tamaño de la lista books: "+ books.getSize());
        System.out.println("Tamaño de la lista students: "+ students.getSize());

        System.out.println("Cantidad de libros en la posición #10: " + books.getAt(10));
        System.out.println("Cantidad de estudiantes en la posición #2: " + students.getAt(2));

        System.out.println("Datos de la iteración lista books");
        printBooks(books.getIterator());

        System.out.println("Datos de la iteración lista students");
        printStudents(students.getIterator());
    }

    private static void printBooks(Iterator<Integer> booksIterator){
        while(booksIterator.hasNext()){
            Integer dato=booksIterator.next();
            System.out.println(dato);
        }
    }


    public static void printStudents(Iterator<String> studentsIterator){
        while(studentsIterator.hasNext()){
            String dato=studentsIterator.next();
            System.out.println(dato);
        }
    }
}
