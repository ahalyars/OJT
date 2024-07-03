import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution63 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution63 solution = new Solution63();
        
        // Test cases
        String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] test2 = {""};
        String[] test3 = {"a"};
        
        System.out.println(solution.groupAnagrams(test1)); // Output: [[eat, tea, ate], [tan, nat], [bat]]
        System.out.println(solution.groupAnagrams(test2)); // Output: [[]]
        System.out.println(solution.groupAnagrams(test3)); // Output: [[a]]
    }
}
