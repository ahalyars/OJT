// Define a class ImmutablePoint
class ImmutablePoint {
    // Private final instance variables to hold the x and y coordinates
    private final int x;
    private final int y;

    // Constructor to initialize x and y coordinates
    public ImmutablePoint() {
        this.x = 5; // Set the x coordinate to 5
        this.y = 7; // Set the y coordinate to 7
    }

    // Getter method to retrieve the value of x coordinate
    public int getx() {
        return x;
    }

    // Getter method to retrieve the value of y coordinate
    public int gety() {
        return y;
    }
}

// Main class to demonstrate the ImmutablePoint class
public class assignqn8 {
    public static void main(String[] args) {
        // Create an instance of ImmutablePoint
        ImmutablePoint immpoint = new ImmutablePoint();

        // Print the value of x coordinate
        System.out.println("The value of x: " + immpoint.getx());

        // Print the value of y coordinate
        System.out.println("The value of y: " + immpoint.gety());
    }
}
