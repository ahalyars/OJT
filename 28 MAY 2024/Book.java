class Book { 
    private String isbn; 
    private String title; 
    private String author; 
    private boolean isAvailable; 
 
    public Book(String isbn, String title, String author) { 
        this.isbn = isbn; 
        this.title = title; 
        this.author = author; 
        this.isAvailable = true; 
    } 
 
    public void borrowBook() { 
        if (isAvailable) { 
            isAvailable = false; 
            System.out.println("The book '" + title + "' has been borrowed."); 
        } else { 
            System.out.println("The book '" + title + "' is currently unavailable."); 
        } 
    } 
 
    public void returnBook() { 
        if (!isAvailable) { 
            isAvailable = true; 
            System.out.println("The book '" + title + "' has been returned."); 
        } else { 
            System.out.println("The book '" + title + "' was not borrowed."); 
        } 
    } 
 
    public void displayBookDetails() { 
        System.out.println("ISBN: " + isbn); 
        System.out.println("Title: " + title); 
        System.out.println("Author: " + author); 
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available")); 
    } 
 
    public String getIsbn() { 
        return isbn; 
    } 
 
    public String getTitle() { 
        return title; 
    } 
 
    public String getAuthor() { 
        return author; 
    } 
 
    public boolean isAvailable() { 
        return isAvailable; 
    } 
 
    public static void main(String[] args) { 
        Book book1 = new Book("1023", "Aadujeevitham", "Benyamin"); 
 
        book1.displayBookDetails(); 
        System.out.println(); 
 
        // Borrow the book 
         book1.borrowBook(); 
         book1.displayBookDetails(); 
         System.out.println(); 
 
        //  Attempt to borrow the book again 
         book1.borrowBook(); 
         System.out.println(); 
 
        // // Return the book 
         book1.returnBook(); 
         book1.displayBookDetails(); 
         System.out.println(); 
 
        //  Attempt to return the book again 
         book1.returnBook(); 
    } 
}