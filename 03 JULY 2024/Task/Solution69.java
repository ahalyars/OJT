public class Solution69 {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            while (left < right && !vowels.contains(chars[left] + "")) {
                left++;
            }
            while (left < right && !vowels.contains(chars[right] + "")) {
                right--;
            }
            if (left < right) {
                // Swap vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution69 solution = new Solution69();

        // Test cases
        String test1 = "hello";
        String test2 = "leetcode";
        String test3 = "aA";

        System.out.println(solution.reverseVowels(test1)); // Output: "holle"
        System.out.println(solution.reverseVowels(test2)); // Output: "leotcede"
        System.out.println(solution.reverseVowels(test3)); // Output: "Aa"
    }
}
