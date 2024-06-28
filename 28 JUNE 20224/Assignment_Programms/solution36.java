import java.util.HashSet;
import java.util.Set;
public class Substring_36{
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Substring_36 solution = new Substring_36();
        String s = "abcabcbb";
        System.out.println("String: " + s);
        System.out.println("Length of longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s));
    }
}