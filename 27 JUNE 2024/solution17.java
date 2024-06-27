import java.util.Arrays;

public class solution17 {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE; // Initialize minimum difference
        int closestSum = 0; // Initialize closest sum

        // Sort the array to facilitate two-pointer technique
        Arrays.sort(nums);

        // Iterate through each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1; // Second pointer
            int k = nums.length - 1; // Third pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);

                // If exact match found, return immediately
                if (diff == 0) {
                    return sum;
                }

                // Update closest sum if current sum is closer to target
                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                // Adjust pointers based on comparison with target
                if (sum < target) {
                    j++; // Move second pointer to the right to increase sum
                } else {
                    k--; // Move third pointer to the left to decrease sum
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        solution17 sol = new solution17();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int closestSum = sol.threeSumClosest(nums, target);
        System.out.println("Closest sum to target " + target + ": " + closestSum);
    }
}
