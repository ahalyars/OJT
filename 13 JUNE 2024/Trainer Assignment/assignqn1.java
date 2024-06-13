public class assignqn1 {
    public static void main(String[] args) {
        // Number of Fibonacci numbers to print
        int n = 10;
        
        // Print message indicating the number of Fibonacci numbers to be printed
        System.out.println("First " + n + " Fibonacci numbers:");
        
        // Loop to print the first n Fibonacci numbers
        for (int i = 0; i < n; i++) {
            // Print each Fibonacci number 
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: 0th Fibonacci number is 0, 1st Fibonacci number is 1
        if (n <= 1) {
            return n;
        } else {
            // Recursive call to calculate Fibonacci number
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
