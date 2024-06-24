//normal sorting
import java.util.Arrays;

public class Solution7 {

    // Method to find the k-th largest element
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // Main method to test the findKthLargest method
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        
        // Example array and k value
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        // Finding the k-th largest element
        int result = solution.findKthLargest(nums, k);
        
        // Printing the result
        System.out.println("The " + k + "-th largest element is: " + result);
    }
}
