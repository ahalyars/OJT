public class solution18 {
    public int atoi(String str) {
        if (str == null || str.length() == 0)
            return 0;

        // Trim white spaces
        str = str.trim();

        // Check for empty string after trimming
        if (str.length() == 0)
            return 0;

        // Determine sign
        int i = 0;
        char flag = '+';
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        // Use long to handle overflow
        long result = 0;

        // Process digits
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            result = result * 10 + (str.charAt(i) - '0');

            // Check for overflow
            if (result > Integer.MAX_VALUE) {
                return (flag == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            i++;
        }

        // Apply sign
        if (flag == '-')
            result = -result;

        // Convert result to int
        return (int) result;
    }

    public static void main(String[] args) {
        solution18 solution = new solution18();
        System.out.println(solution.atoi("   42")); // Output: 42
        System.out.println(solution.atoi("   -42")); // Output: -42
        System.out.println(solution.atoi("4193 with words")); // Output: 4193
        System.out.println(solution.atoi("words and 987")); // Output: 0
        System.out.println(solution.atoi("-91283472332")); // Output: -2147483648
    }
}
