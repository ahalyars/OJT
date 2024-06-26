public class solution9 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();

        // Check if the first characters of s and p match, or if p starts with a '.'
        boolean firstMatch = (!s.isEmpty() &&
                              (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        // Handle patterns with '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Two possibilities:
            // 1. '*' counts as zero of the preceding element
            // 2. '*' counts as one or more of the preceding element (if firstMatch is true)
            return (isMatch(s, p.substring(2)) ||
                    (firstMatch && isMatch(s.substring(1), p)));
        } else {
            // If no '*', proceed with next characters of both s and p
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        solution9 sol = new solution9();
        System.out.println(sol.isMatch("aa", "a"));         // Output: false
        System.out.println(sol.isMatch("aa", "a*"));        // Output: true
        System.out.println(sol.isMatch("ab", ".*"));        // Output: true
        System.out.println(sol.isMatch("aab", "c*a*b"));    // Output: true
        System.out.println(sol.isMatch("mississippi", "mis*is*p*.")); // Output: false
    }
}
