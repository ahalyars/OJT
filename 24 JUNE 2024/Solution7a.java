//sorting using quicksort
import java.util.Random;

public class Solution7a {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        int pivot = nums[new Random().nextInt(right - left + 1) + left];
        int l = left, r = right;
        while (l <= r) {
            while (nums[l] < pivot) l++;
            while (nums[r] > pivot) r--;
            if (l <= r) swap(nums, l++, r--);
        }
        if (left <= k && k <= r) return quickSelect(nums, left, r, k);
        if (l <= k && k <= right) return quickSelect(nums, l, right, k);
        return nums[k];
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(new Solution7a().findKthLargest(nums, 2)); // Output: 5
    }
}
