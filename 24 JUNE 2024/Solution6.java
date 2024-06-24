import java.util.Arrays;

public class Solution6 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, combined, nums1.length, nums2.length);
        Arrays.sort(combined);
        int mid = combined.length / 2;
        return combined.length % 2 == 0 ? (combined[mid - 1] + combined[mid]) / 2.0 : combined[mid];
    }

    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        System.out.println("The median is: " + solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("The median is: " + solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
