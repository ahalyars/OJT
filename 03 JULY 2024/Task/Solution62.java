import java.util.Stack;

public class Solution62 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1; // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                // Push the current result and sign onto the stack, for later
                stack.push(result);
                stack.push(sign);
                // Reset the result and sign
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); // stack.pop() is the sign before the parenthesis
                result += stack.pop(); // stack.pop() now is the result calculated before the parenthesis
            }
        }
        if (number != 0) {
            result += sign * number;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution62 solution = new Solution62();

        // Test cases
        String test1 = "1 + 1";
        String test2 = " 2-1 + 2 ";
        String test3 = "(1+(4+5+2)-3)+(6+8)";
        
        System.out.println(solution.calculate(test1)); // Output: 2
        System.out.println(solution.calculate(test2)); // Output: 3
        System.out.println(solution.calculate(test3)); // Output: 23
    }
}
