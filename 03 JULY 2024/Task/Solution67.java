public class Solution67 {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int z = nums[i];
            
            if (x >= z) {
                x = z; // update x to be a smaller value
            } else if (y >= z) {
                y = z; // update y to be a smaller value
            } else {
                return true; // found an increasing triplet
            }
        }
        
        return false; // no increasing triplet found
    }

    public static void main(String[] args) {
        Solution67 solution = new Solution67();

        // Test cases
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {5, 4, 3, 2, 1};
        int[] test3 = {1, 1, 1, 1, 1};
        int[] test4 = {1, 2, 0, 3, 4};

        System.out.println(solution.increasingTriplet(test1)); // Output: true
        System.out.println(solution.increasingTriplet(test2)); // Output: false
        System.out.println(solution.increasingTriplet(test3)); // Output: false
        System.out.println(solution.increasingTriplet(test4)); // Output: true
    }
}
