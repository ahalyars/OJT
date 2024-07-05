import java.util.Arrays;

public class zero_remove {

    public static void main(String[] args) {
        int[] nums = {0,0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int count = 0; // count of non-zero elements

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the position of count
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }
}
