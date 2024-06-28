import java.util.HashMap;

public class Duplicateii_32{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicateii_32 solution = new  Duplicateii_32();
        int[] nums = {1, 2, 3, 1};
        int k = 5;
        System.out.println("Array: " + java.util.Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("Contains nearby duplicate: " + solution.containsNearbyDuplicate(nums, k));
    }
}