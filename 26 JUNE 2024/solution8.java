public class solution8 {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int starIndex = -1, iIndex = -1;
        
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }
        
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }
        
        return j == p.length();
    }

    public static void main(String[] args) {
        solution8 wm = new solution8();
        System.out.println(wm.isMatch("adceb", "*a*b")); // Output: true
        System.out.println(wm.isMatch("aa", "a")); // Output: false
        System.out.println(wm.isMatch("aa", "*")); // Output: true
        System.out.println(wm.isMatch("cb", "?a")); // Output: false
        System.out.println(wm.isMatch("adceb", "*a*b")); // Output: true
    }
}
