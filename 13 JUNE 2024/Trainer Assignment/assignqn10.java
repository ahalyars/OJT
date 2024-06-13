import java.util.*;

// Define a ShoppingCart class
class ShoppingCart {
    // Private ArrayList to store the items in the cart
    private ArrayList<String> items = new ArrayList<>();
    // Private variable to store the total amount
    private double total = 0;

    // Method to add an item to the cart with its amount
    public void additem(String item, double amount) {
        // Add the item to the cart
        items.add(item);
        // Increase the total amount by the specified amount
        total = total + amount;
    }

    // Method to remove an item from the cart with its amount
    public void removeitem(String item, double amount) {
        // Remove the item from the cart
        items.remove(item);
        // Decrease the total amount by the specified amount
        total = total - amount;
    }

    // Method to display the items in the cart and the total amount
    public void showcart() {
        System.out.println("---List of Items----");
        // Iterate through the items in the cart and print each item
        for (String itemname : items) {
            System.out.println(itemname);
        }
        // Print the total amount
        System.out.println("Total Amount");
        System.out.println(total + "/-");
    }
}

// Main class to demonstrate the ShoppingCart class
public class assignqn10 {
    public static void main(String[] args) {
        // Create an instance of the ShoppingCart class
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.additem("pen", 5);
        cart.additem("pencil", 3);

        // Remove an item from the cart
        //cart.removeitem("pencil", 3); // Removing the pencil which costs 3

        // Display the items in the cart and the total amount
        cart.showcart();
    }
}
