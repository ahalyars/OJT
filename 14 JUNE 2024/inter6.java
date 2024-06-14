
interface Printable {
    void print(); // Abstract method to be implemented by classes
}
// Implementing class A that implements Printable interface
class A implements Printable {
    public void print() {
        System.out.println("Printing from class A");
    }
}

// Implementing class B that implements Printable interface
class B implements Printable {
    public void print() {
        System.out.println("Printing from class B");
    }
}
public class inter6 {
    public static void main(String[] args) {
        Printable obj1 = new A(); // Creating object of class A using interface reference
        Printable obj2 = new B(); // Creating object of class B using interface reference

        obj1.print(); // Calls print() method of class A
        obj2.print(); // Calls print() method of class B
    }
}
