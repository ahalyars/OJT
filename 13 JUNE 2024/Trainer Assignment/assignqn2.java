public class assignqn2 {
    public static void main(String[] args) {
        long number = 13195; // Define the number for which we want to find the largest prime factor
        for (long i = 2; i * i <= number; i++) { // Iterate through numbers from 2 up to the square root of 'number'
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                number /= i; // If 'i' is a factor, divide 'number' by 'i'
                i--; // Decrement 'i' to recheck if 'i' is still a factor of the updated 'number'
            }
        }
        System.out.println("The largest prime factor is: " + number); // Print the largest prime factor
    }
}
