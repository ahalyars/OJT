import java.util.Random;
import java.util.Scanner;

public class flip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Flip Game!");
        System.out.println("Type 'flip' to flip the coin or 'quit' to exit.");

        while (true) {
            System.out.print("Enter your choice: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("flip")) {
                // Simulate coin flip
                if (random.nextBoolean()) {
                    System.out.println("It's Heads!");
                } else {
                    System.out.println("It's Tails!");
                }
            } else if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing the Flip Game!");
                break;
            } else {
                System.out.println("Invalid input. Please type 'flip' or 'quit'.");
            }
        }

        scanner.close();
    }
}
