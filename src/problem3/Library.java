package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity=capacity;
        this.documents=new ArrayList<>();
    }

    public void displayDocuments() {
        if(documents.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        for(Document doc1 : documents) {
            System.out.println(doc1);
        }
    }

    public boolean add(Document doc1) {
        if (this.documents.size()<this.capacity){
            this.documents.add(doc1); //adding in documents
            return true; //if added
        }
        return false; //if not added
    }

    public boolean delete(Document doc1) {
        return this.documents.remove(doc1); //removing
    }

    public Document document(int num1) {
        for (Document doc1: documents) {
            if (doc1.getNumRec()==num1) {
                return doc1;
            }
        }
        return null; // not founded
    }

    public void displayAuthors() {
        System.out.println("List of authors in the library:");
        for (Document doc1: documents) {
            if (doc1 instanceof Book) { //only elements book have an author
                System.out.println("- "+((Book) doc1).getAuthor());
            }
        }
    }
}