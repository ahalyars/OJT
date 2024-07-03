public class Solution61 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        
        return result;
    }

    private int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        
        return index;
    }

    private int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        
        return index;
    }

    public static void main(String[] args) {
        Solution61 solution = new Solution61();
        
        // Test cases
        int[] test1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(test1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Output: [3, 4]

        int[] test2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(test2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

        int[] test3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(test3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]
    }
}
