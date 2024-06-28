import java.util.HashSet;

public class solution31
 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        solution31 solution = new solution31();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 2, 4, 5};

        System.out.println("Array 1: " + java.util.Arrays.toString(nums1));
        System.out.println("Contains duplicate: " + solution.containsDuplicate(nums1));

        System.out.println("Array 2: " + java.util.Arrays.toString(nums2));
        System.out.println("Contains duplicate: " + solution.containsDuplicate(nums2));
    }
}