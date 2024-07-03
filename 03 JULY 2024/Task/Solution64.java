public class Solution64 {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] lps = computeLPSArray(combined);

        int maxPrefixLength = lps[lps.length - 1];
        String toBeAdded = rev.substring(0, s.length() - maxPrefixLength);
        return toBeAdded + s;
    }

    private int[] computeLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        Solution64 solution = new Solution64();

        // Test cases
        String test1 = "aacecaaa";
        String test2 = "abcd";
        
        System.out.println(solution.shortestPalindrome(test1)); // Output: "aaacecaaa"
        System.out.println(solution.shortestPalindrome(test2)); // Output: "dcbabcd"
    }
}
