import java.util.ArrayList;
import java.util.List;

public class Solution66 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            result.add(nums[0] + "");
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    result.add(start + "");
                } else {
                    result.add(start + "->" + end);
                }
                start = nums[i];
                end = nums[i];
            }
        }

        if (start == end) {
            result.add(start + "");
        } else {
            result.add(start + "->" + end);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution66 solution = new Solution66();

        // Test cases
        int[] test1 = {0, 1, 2, 4, 5, 7};
        int[] test2 = {0, 2, 3, 4, 6, 8, 9};
        int[] test3 = {};
        
        System.out.println(solution.summaryRanges(test1)); // Output: ["0->2", "4->5", "7"]
        System.out.println(solution.summaryRanges(test2)); // Output: ["0", "2->4", "6", "8->9"]
        System.out.println(solution.summaryRanges(test3)); // Output: []
    }
}
