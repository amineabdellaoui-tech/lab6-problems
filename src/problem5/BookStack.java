package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        this.stack=new LinkedList<>();
    }

    public void push(Book book) {
        this.stack.addFirst(book); //LIFO map
    }

    public Book pop() {
        if(isEmpty()) return null; //check empty
        return this.stack.removeFirst(); //LIFO map
    }

    public Book peek() {
        if(isEmpty()) return null; //check empty
        return this.stack.getFirst(); //LIFO map
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for(Book b:stack){
            System.out.println("- "+b);
        }
    }
}