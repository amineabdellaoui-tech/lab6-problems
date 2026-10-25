package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        this.queue=new LinkedList<>();
    }

    public void enqueue(Book book) {
        this.queue.addLast(book); //FIFO map
    }

    public Book dequeue() {
        if(isEmpty()) return null; //check empty
        return this.queue.removeFirst(); //FIFO map
    }

    public Book peek() {
        if(isEmpty()) return null; //check empty
        return this.queue.getFirst(); //FIFO map
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for(Book b:queue){
            System.out.println("- "+b);
        }
    }
}