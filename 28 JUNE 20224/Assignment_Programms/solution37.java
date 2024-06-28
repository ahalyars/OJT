import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Substring_37 {
    public static String longestSubstringWithTwoUniqueChars(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0, maxLen = 0, maxStart = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            map.put(s.charAt(end), end);
            if (map.size() > 2) {
                start = Collections.min(map.values()) + 1;
                map.remove(s.charAt(start - 1));
            }
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String s = "abcbbbbcccbdddadacb";
        System.out.println("String: " + s);
        System.out.println("Longest substring with 2 unique characters: " + longestSubstringWithTwoUniqueChars(s));
    }
}