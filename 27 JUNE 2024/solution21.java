import java.util.Stack;

public class solution21 {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Push initial base index

        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(i); // Push index of '(' onto stack
            } else { // c == ')'
                stack.pop(); // Pop corresponding '(' index
                
                if (stack.empty()) {
                    stack.push(i); // Update base index if stack is empty
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        // Test cases
        String s1 = "(()";
        String s2 = ")()())";
        
        System.out.println("Longest valid parentheses in '" + s1 + "': " + longestValidParentheses(s1)); // Output: 2
        System.out.println("Longest valid parentheses in '" + s2 + "': " + longestValidParentheses(s2)); // Output: 4
    }
}
