public class question72 {
 public void moveZeroes(int[] nums) {
        int m = 0; // m points to the index where the next non-zero element should go
       // First pass: move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[m] = nums[i];
                m++;
            }
        }
         // Second pass: fill the rest of the array with zeros
        for (int i = m; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        question72 solution = new question72();
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        solution.moveZeroes(nums);

        System.out.println("\nAfter moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
