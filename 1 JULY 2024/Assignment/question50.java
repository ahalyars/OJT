
public class question50 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (minLen > str.length()) {
                minLen = str.length();
            }
        }

        if (minLen == 0) {
            return "";
        }

        for (int j = 0; j < minLen; j++) {
            char prev = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != prev) {
                    return strs[i].substring(0, j);
                }
            }
        }

        return strs[0].substring(0, minLen);
    }

    public static void main(String[] args) {
        question50 solution = new question50();

        // Example test cases
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix in strs1: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix in strs2: " + solution.longestCommonPrefix(strs2)); // Output: ""

        String[] strs3 = {"apple", "ape", "april"};
        System.out.println("Longest common prefix in strs3: " + solution.longestCommonPrefix(strs3)); // Output: "ap"
    }
}
