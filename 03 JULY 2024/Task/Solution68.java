import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution68 {
    public boolean canGetTargetNumber(List<Integer> nums, int target) {
        if (nums == null || nums.isEmpty()) {
            return false;
        }
        
        Set<Integer> possibleValues = new HashSet<>();
        possibleValues.add(0); // Starting point
        
        for (int num : nums) {
            Set<Integer> newPossibleValues = new HashSet<>();
            for (int value : possibleValues) {
                newPossibleValues.add(value + num);
                newPossibleValues.add(value - num);
                newPossibleValues.add(value * num);
                // Avoid division by zero
                if (num != 0) {
                    newPossibleValues.add(value / num);
                }
            }
            possibleValues = newPossibleValues;
        }
        
        return possibleValues.contains(target);
    }

    public static void main(String[] args) {
        Solution68 solution = new Solution68();

        // Test cases
        List<Integer> nums1 = Arrays.asList(2, 3, 5, 7);
        int target1 = 8;
        int target2 = 20;
        
        System.out.println(solution.canGetTargetNumber(nums1, target1)); // Output: true
        System.out.println(solution.canGetTargetNumber(nums1, target2)); // Output: true
        
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        int target3 = 10;
        
        System.out.println(solution.canGetTargetNumber(nums2, target3)); // Output: false
    }
}
