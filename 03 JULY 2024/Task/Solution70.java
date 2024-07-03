import java.util.ArrayList;
import java.util.List;

public class Solution70 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        
        if (s == null || s.length() < 2) {
            return result;
        }
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '+' && arr[i + 1] == '+') {
                arr[i] = '-';
                arr[i + 1] = '-';
                result.add(new String(arr));
                arr[i] = '+'; // Revert back for next iteration
                arr[i + 1] = '+'; // Revert back for next iteration
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution70 solution = new Solution70();

        // Test case
        String test1 = "++++";
        String test2 = "+-+-";

        System.out.println(solution.generatePossibleNextMoves(test1)); // Output: ["--++", "+--+", "++--"]
        System.out.println(solution.generatePossibleNextMoves(test2)); // Output: []
    }
}
