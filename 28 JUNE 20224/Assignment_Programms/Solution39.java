import java.util.HashMap;

public class WindowSubstring_39 {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        
        HashMap<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) target.put(c, target.getOrDefault(c, 0) + 1);

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, count = 0, minLen = Integer.MAX_VALUE;
        String result = "";

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (target.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
                if (map.get(c) <= target.get(c)) count++;
            }
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result = s.substring(left, right + 1);
                }
                char leftChar = s.charAt(left++);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) <= target.get(leftChar)) count--;
                    map.put(leftChar, map.get(leftChar) - 1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        WindowSubstring_39 solution = new WindowSubstring_39();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window: " + solution.minWindow(s, t));
    }
}
