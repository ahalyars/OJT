
public class question43 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (target == nums[mid]) {
                return mid;
            }
            
            // Left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        question43 solution = new question43();

        // Example test cases
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Index of target in nums1: " + solution.search(nums1, target1)); // Output: 4
        
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Index of target in nums2: " + solution.search(nums2, target2)); // Output: -1
        
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Index of target in nums3: " + solution.search(nums3, target3)); // Output: -1
        
        int[] nums4 = {3, 1};
        int target4 = 1;
        System.out.println("Index of target in nums4: " + solution.search(nums4, target4)); // Output: 1
    }
}
