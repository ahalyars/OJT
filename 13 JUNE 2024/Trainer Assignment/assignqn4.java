// Define the Shape interface
interface Shape {
    void draw();
}

// Implementing Circle class
class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Implementing Square class
class Square implements Shape {
 
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Implementing Triangle class
class Triangle implements Shape {

    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Main class to demonstrate the usage
public class assignqn4 {
    public static void main(String[] args) {
        // Create an array to store shapes
        Shape[] shapes = new Shape[3];
        
        // Instantiate Circle, Square, and Triangle objects
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        
        // Iterate through the array and call draw() method on each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}