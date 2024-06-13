import java.util.*;

// Define a Library class
class Library {
    // Private ArrayList to store the list of books
    private ArrayList<String> listofbooks = new ArrayList<>();

    // Method to add a book to the library
    public void addbook(String book) {
        listofbooks.add(book);
    }

    // Method to remove a book from the library
    public void removebook(String book) {
        listofbooks.remove(book);
    }

    // Method to list all books in the library
    public void listbooks() {
        for (String bookname : listofbooks) {
            System.out.println(bookname);
        }
    }
}

// Main class to demonstrate the Library class
public class assignqn9 {
    public static void main(String[] args) {
        // Create an instance of the Library class
        Library lib = new Library();

        // Add books to the library
        lib.addbook("The Great Gatsby");
        lib.addbook("The Metamorphosis");

        // Remove a book from the library
        lib.removebook("We Love Anderson Cooper"); // This book is not in the library

        // List all books in the library
        lib.listbooks();
    }
}
