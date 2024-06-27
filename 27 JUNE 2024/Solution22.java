public class Solution22 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        
        int hayLen = haystack.length();
        int needleLen = needle.length();
        
        for (int i = 0; i <= hayLen - needleLen; i++) {
            int j;
            for (j = 0; j < needleLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needleLen) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Solution22 solution = new Solution22();
        
        // Test cases
        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Needle 'll' found in 'hello' at index: " + solution.strStr(haystack1, needle1)); // Output: 2
        
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Needle 'bba' found in 'aaaaa' at index: " + solution.strStr(haystack2, needle2)); // Output: -1
        
        String haystack3 = "";
        String needle3 = "";
        System.out.println("Empty needle in empty haystack returns index: " + solution.strStr(haystack3, needle3)); // Output: 0
        
        String haystack4 = "mississippi";
        String needle4 = "issip";
        System.out.println("Needle 'issip' found in 'mississippi' at index: " + solution.strStr(haystack4, needle4)); // Output: 4
    }
}
