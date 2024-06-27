import java.util.Arrays;

public class Solution23{
	public static int smallestSubArrayLen(int target, int[] nums) {
		int n = nums.length;
		// If the array is empty, return 0
		if (n == 0) {
			return 0;
		}
	
		int ans = Integer.MAX_VALUE;
	
		int[] sums = new int[n + 1];
		// Compute the running sum of nums and store it in "sums"
		for (int i = 1; i <= n; i++) {
			sums[i] = sums[i - 1] + nums[i - 1];
		}
		// Iterate through each starting index i
		for (int i = 1; i <= n; i++) {
			// Calculate the target sum for the subarray starting at index i
			int toFind = target + sums[i - 1];
			// Find the first element in "sums" that is >= toFind
			int bound = Arrays.binarySearch(sums, toFind);
			if (bound < 0) {
				bound = -bound - 1;
			}
			// If such an element is found and it is not equal to toFind itself
			if (bound != sums.length && sums[bound] != toFind) {
				// Compute the length of the subarray and update ans if necessary
				int length = bound - (i - 1);
				ans = Math.min(ans, length);
			}
		}
		// Return ans if it was updated, otherwise return 0
		return (ans != Integer.MAX_VALUE) ? ans : 0;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 45, 6, 10, 19};
		int target1 = 51;
		System.out.println("Length of Smallest Subarray: " + smallestSubArrayLen(target1, arr1));

		int[] arr2 = {1, 10, 5, 2, 7};
		int target2 = 9;
		System.out.println("Length of Smallest Subarray: " + smallestSubArrayLen(target2, arr2));

	}
}
