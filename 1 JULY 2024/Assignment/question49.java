
import java.util.Stack;

public class question49 {

    public int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int i = 0;

        while (i < height.length) {
            // Push index to stack when the current height is larger than or equal to the previous one
            if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                // Calculate max value when the current height is less than the previous one
                int p = stack.pop();
                int h = height[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }
        }

        // Calculate max for remaining elements in stack
        while (!stack.isEmpty()) {
            int p = stack.pop();
            int h = height[p];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(h * w, max);
        }

        return max;
    }

    public static void main(String[] args) {
        question49 solution = new question49();

        // Example test cases
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest rectangle area in heights1: " + solution.largestRectangleArea(heights1)); // Output: 10

        int[] heights2 = {2, 4};
        System.out.println("Largest rectangle area in heights2: " + solution.largestRectangleArea(heights2)); // Output: 4

        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println("Largest rectangle area in heights3: " + solution.largestRectangleArea(heights3)); // Output: 9
    }
}
