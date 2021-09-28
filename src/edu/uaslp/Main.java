package edu.uaslp;
import edu.uaslp.list.linkedlist.LinkedList;
import edu.uaslp.list.arraylist.ArrayList;

public class Main{
    public static void main(String[] args) {
        /*LinkedList<Integer> books = new LinkedList<>();
        LinkedList<Integer> students = new LinkedList<>();*/
        ArrayList<Integer> books = new ArrayList<>();
        ArrayList<Integer> students = new ArrayList<>();

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

        students.add(10);
        students.add(50);
        students.add(20);
        students.add(40);
        students.add(30);

        System.out.println("Tamaño de la lista books: "+ books.getSize());
        System.out.println("Tamaño de la lista students: "+ students.getSize());

        System.out.println("Cantidad de libros en la posición #10: " + books.getAt(10));
        System.out.println("Cantidad de estudiantes en la posición #2: " + students.getAt(2));
    }
}
