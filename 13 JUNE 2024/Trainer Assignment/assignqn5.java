// Define a MathOperations class
class MathOperations {
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Add :" + (a + b));
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        System.out.println("Add :" + (a + b + c));
    }

    // Method to add four integers
    public void add(int a, int b, int c, int d) {
        System.out.println("Add :" + (a + b + c+ d)); 
    }
}

// Main class to demonstrate the MathOperations class
public class assignqn5 {
    public static void main(String[] args) {
        // Create an instance of the MathOperations class
        MathOperations Math = new MathOperations();

        // Call the add method with two integers
        Math.add(5, 2);

        // Call the add method with three integers
        Math.add(5, 2, 3);

        // Call the add method with four integers
        Math.add(5, 7, 2, 3);
    }
}

