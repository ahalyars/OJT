import java.util.Scanner;

public class subSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = increasingTriplet(nums);
        if (result) {
            System.out.println("The array contains an increasing triplet subsequence.");
        } else {
            System.out.println("The array does not contain an increasing triplet subsequence.");
        }

        scanner.close();
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // update first if num is smaller than first
            } else if (num <= second) {
                second = num;  // update second if num is smaller than second
            } else {
                // If we find a number larger than both first and second, we have an increasing triplet
                return true;
            }
        }

        return false;  // no increasing triplet found
    }
}
