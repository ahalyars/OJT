import java.util.HashMap;
import java.util.Stack;

public class solution20 {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            
            if (map.containsKey(curr)) {
                stack.push(curr);
            } else if (map.containsValue(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                // Invalid character (not part of the mapping)
                return false;
            }
        }
        
        return stack.empty();
    }
    
    public static void main(String[] args) {
        // Test cases
        String s1 = "()[]{}";
        String s2 = "([)]";
        
        System.out.println("Is '" + s1 + "' valid? " + isValid(s1)); // true
        System.out.println("Is '" + s2 + "' valid? " + isValid(s2)); // false
    }
}
