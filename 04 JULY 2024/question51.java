//Largest Number.
import java.util.Arrays;
import java.util.Comparator;
class question51 {
    public String largestNumber(int[] nums) {
        // Convert integer array to string array
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
 // Sort the array with a custom comparator
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String leftRight = s1 + s2;
                String rightLeft = s2 + s1;
                return -leftRight.compareTo(rightLeft);
            }
        });

        // Handle the case where the number is all zeros
        if (strs[0].equals("0")) {
            return "0";
        }

        // Create the largest number from sorted array
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        question51 q = new question51();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(q.largestNumber(nums)); // Output should be "9534330"
    }
}
