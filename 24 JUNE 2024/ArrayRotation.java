import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int[] result = new int[n];
        System.arraycopy(nums, n - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, n - k);
        System.arraycopy(result, 0, nums, 0, n);
    }
}
