
public class question44 {

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[left] < nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[left] > nums[mid]) {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                // Handle duplicates, move left pointer
                left++;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        question44 solution = new question44();

        // Example test cases
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println("Does nums1 contain target1? " + solution.search(nums1, target1)); // Output: true
        
        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println("Does nums2 contain target2? " + solution.search(nums2, target2)); // Output: false
        
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Does nums3 contain target3? " + solution.search(nums3, target3)); // Output: false
        
        int[] nums4 = {3, 1};
        int target4 = 1;
        System.out.println("Does nums4 contain target4? " + solution.search(nums4, target4)); // Output: true
    }
}
