import java.util.Arrays;
public class question58 {
public int minCandies(int[] ratings) {
        int n = ratings.length;
        if (n == 0) {
            return 0;
        }
        int[] candies = new int[n];
        // Initialize each child with 1 candy
        Arrays.fill(candies, 1);
        // Scan from left to right to satisfy ascending ratings
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        // Scan from right to left to satisfy descending ratings
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        // Calculate total candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        return totalCandies;
    }
    public static void main(String[] args) {
        question58 candyDistribution = new  question58();
        int[] ratings = {1, 0, 2};
        System.out.println(candyDistribution.minCandies(ratings)); // Output should be 5
    }
}

    

