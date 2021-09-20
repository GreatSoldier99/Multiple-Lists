package edu.uaslp;
import edu.uaslp.list.linkedlist.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        LinkedList students = new LinkedList();

        books.add(7);
        books.add(70);
        books.add(14);
        books.add(63);
        books.add(21);
        books.add(56);
        books.add(28);
        books.add(49);
        books.add(35);
        books.add(42);

        students.add(10);
        students.add(50);
        students.add(20);
        students.add(40);
        students.add(30);

        System.out.println("Tamaño de la lista books: "+ books.getSize());
        System.out.println("Tamaño de la lista students: "+ students.getSize());

        System.out.println("Cantidad de libros en la posición #5: " + books.getAt(5));
        System.out.println("Cantidad de estudiantes en la posición #2: " + students.getAt(2));

        books.print();
    }
}
