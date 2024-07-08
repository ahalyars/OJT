public class question73 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];
        
        // Increment count for each character in s
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        // Decrement count for each character in t
        for (int i = 0; i < t.length(); i++) {
            charCounts[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        question73 solution = new question73();
        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is Anagram: " + solution.isAnagram(s, t));
    }
}
