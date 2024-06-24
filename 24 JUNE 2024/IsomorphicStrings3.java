import java.util.HashMap;

public class IsomorphicStrings3 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("ab", "aa")); // false
    } 
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i); 
            if (mapS.containsKey(c1)) {
                if (mapS.get(c1) != c2) {
                    return false;
                }
            } else {
                mapS.put(c1, c2);
            }
            if (mapT.containsKey(c2)) {
                if (mapT.get(c2) != c1) {
                    return false;
                }
            } else {
                mapT.put(c2, c1);
            }
        }
        return true;
    }
}
