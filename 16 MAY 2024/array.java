import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, 8, 15};

        int sum = Arrays.stream(numbers).sum();
        double avg = Arrays.stream(numbers).average().orElse(Double.NaN);
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);



        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}