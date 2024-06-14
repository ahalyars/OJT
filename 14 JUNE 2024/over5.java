public class over5 {

    public static int add(int a, int b) {
        return a + b;
    }


    // Method to concatenate two strings
    public static String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        int sum1 = add(5, 3);
        String concat = add("Hello, ", "World!");

        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Concatenated string: " + concat);
    }
}
