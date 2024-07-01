
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class question47 {
    
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Check if frequency > n/3
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        question47 solution = new question47();
        
        // Example test cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        
        System.out.println("Majority elements in nums1: " + solution.majorityElement(nums1)); // Output: [3]
        System.out.println("Majority elements in nums2: " + solution.majorityElement(nums2)); // Output: [1, 2]
    }
}
