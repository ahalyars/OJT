import java.util.ArrayList;

public class library {
    ArrayList<String> books = new ArrayList<>();

        public void add(String book){
            books.add(book);
        }
        public void remove(String book){
            books.remove(book);
        }
        public void displayBooks() {
            for (String book : books) {
                System.out.println(book);
            }
        }
    public static void main(String[] args) {
        
        Library library = new Library();
        library.add("book1");
        library.add("book2");
        library.add("book3");
        library.displayBooks();
        
        library.remove("book3");
        library.displayBooks();

      
    }
    
}