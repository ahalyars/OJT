import java.util.TreeSet;

public class DuplicateIII_33 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long l = (long) nums[i] - t;
            long r = (long) nums[i] + t;
            if (set.subSet(l, r + 1L).size() > 0) {
                return true;
            }
            set.add((long) nums[i]);
            if (i > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateIII_33 solution = new DuplicateIII_33();
        int[] nums = {1, 5, 3, 1, 5};
        int k = 4;
        int t = 0;

        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("t: " + t);
        System.out.println("Contains nearby almost duplicate: " + solution.containsNearbyAlmostDuplicate(nums, k, t));
    }
}