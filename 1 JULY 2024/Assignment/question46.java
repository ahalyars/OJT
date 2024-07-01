import java.util.Arrays;

public class question46 {
    public int majorityElement(int[] num) {
        if (num.length == 1) {
            return num[0];
        }
        
        Arrays.sort(num);
        int prev = num[0];
        int count = 1;
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] == prev) {
                count++;
                if (count > num.length / 2) {
                    return num[i];
                }
            } else {
                count = 1;
                prev = num[i];
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        question46 solution = new question46();

        // Example test cases
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority element in nums1: " + solution.majorityElement(nums1)); // Output: 3
        System.out.println("Majority element in nums2: " + solution.majorityElement(nums2)); // Output: 2
    }
}
