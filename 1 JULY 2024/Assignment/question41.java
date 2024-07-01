//41 Find Minimum in Rotated Sorted

public class question41 {

    public int findMin(int[] num) {
        return findMin(num, 0, num.length - 1);
    }

    public int findMin(int[] num, int left, int right) {
        // If the array has only one element
        if (left == right) {
            return num[left];
        }

        // If there are exactly two elements left
        if ((right - left) == 1) {
            return Math.min(num[left], num[right]);
        }

        int middle = left + (right - left) / 2;

        // If the array is not rotated, the smallest element is at the start
        if (num[left] < num[right]) {
            return num[left];
        } else if (num[middle] > num[left]) {
            // Minimum element is in the right half
            return findMin(num, middle, right);
        } else {
            // Minimum element is in the left half
            return findMin(num, left, middle);
        }
    }

    public static void main(String[] args) {
        question41 solution = new question41();

        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {1, 2, 3};
        int[] nums4 = {1};

        System.out.println("Minimum in nums1: " + solution.findMin(nums1)); // Output: 1
        System.out.println("Minimum in nums2: " + solution.findMin(nums2)); // Output: 0
        System.out.println("Minimum in nums3: " + solution.findMin(nums3)); // Output: 1
        System.out.println("Minimum in nums4: " + solution.findMin(nums4)); // Output: 1
    }
}
