import java.util.HashMap;

public class Solution77 {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        
        // If the length of the pattern and the number of words don't match, return false
        if (pattern.length() != arr.length) {
            return false;
        }

        // Create a HashMap to store the mapping from pattern characters to words
        HashMap<Character, String> map = new HashMap<>();

        // Iterate through the pattern and words
        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);  // Get the current character from the pattern
            String s = arr[i];  // Get the current word from the split string
            
            // If the character is already in the map
            if (map.containsKey(c)) {
                // Check if the mapped word is different from the current word
                if (!map.get(c).equals(s)) {
                    return false;  // If different, return false
                }
            } else {
                // If the word is already mapped to a different character, return false
                if (map.containsValue(s)) {
                    return false;
                }

                // Add the character and word to the map
                map.put(c, s);
            }
        }

        // If we complete the loop without returning false, the pattern matches the words
        return true;
    }

    public static void main(String[] args) {
        Solution77 solution = new Solution77();
        
        // Test cases
        System.out.println(solution.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(solution.wordPattern("abba", "dog dog dog dog")); // false
    }
}
