package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter library capacity: ");
        int capacity=scan.nextInt();
        Library lib=new Library(capacity);

        //init 2 docs
        lib.add(new Novel("Dune", "Frank Herbert", 800, 15.99));
        lib.add(new Dictionary("Oxford", "English"));

        int choice=0;

        //menu loop
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Novel");
            System.out.println("2. Display Documents");
            System.out.println("3. Display Authors");
            System.out.println("4. Search by ID");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice=scan.nextInt();
            scan.nextLine(); //clear buffer

            switch(choice) {
                case 1:
                    System.out.print("Title: ");
                    String title=scan.nextLine();
                    System.out.print("Author: ");
                    String author=scan.nextLine();
                    System.out.print("Pages: ");
                    int pages=scan.nextInt();
                    System.out.print("Price: ");
                    double price=scan.nextDouble();

                    //check capacity
                    boolean added=lib.add(new Novel(title, author, pages, price));
                    if(added) {
                        System.out.println("Added!");
                    } else {
                        System.out.println("Full capacity!");
                    }
                    break;
                case 2:
                    lib.displayDocuments();
                    break;
                case 3:
                    lib.displayAuthors();
                    break;
                case 4:
                    System.out.print("ID: ");
                    int id=scan.nextInt();
                    Document doc=lib.document(id);
                    if(doc != null) {
                        System.out.println("Found: " + doc);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid.");
            }
        } while(choice != 5);
    }
}