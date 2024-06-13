// Define the Vehicle interface
interface Vehicle {
    void move();
}

// Define the Engine interface
interface Engine {
    void start();
}

// Implement the interfaces in the Car class
class Car implements Vehicle, Engine {
    
    // Implement the move() method from the Vehicle interface
    public void move() {
        System.out.println("Car is moving.");
    }

    // Implement the start() method from the Engine interface
    public void start() {
        System.out.println("Car engine started.");
    }
}

// Main class to test the Car class
public class assignqn7 {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car();

        // Call methods from the implemented interfaces
        myCar.start();
        myCar.move();
    }
}