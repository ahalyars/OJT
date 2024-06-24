public class Solution6a {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0) {
            return (findKthElement(nums1, nums2, 0, 0, n / 2) + findKthElement(nums1, nums2, 0, 0, n / 2 + 1)) / 2.0;
        } else {
            return findKthElement(nums1, nums2, 0, 0, n / 2 + 1);
        }
    }
    
    private int findKthElement(int[] nums1, int[] nums2, int start1, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        
        int mid1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;
        
        if (mid1 < mid2) {
            return findKthElement(nums1, nums2, start1 + k / 2, start2, k - k / 2);
        } else {
            return findKthElement(nums1, nums2, start1, start2 + k / 2, k - k / 2);
        }
    }

    public static void main(String[] args) {
        Solution6a solution = new Solution6a();
        System.out.println("The median is: " + solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("The median is: " + solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
