public class Solution65 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // Calculate the area of both rectangles
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);

        // Check if there is no overlap
        if (C <= E || G <= A || D <= F || H <= B) {
            return area1 + area2;
        }

        // Calculate the overlap area
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int bottom = Math.max(B, F);
        int top = Math.min(D, H);

        int overlapArea = (right - left) * (top - bottom);

        // Return the total area minus the overlap area
        return area1 + area2 - overlapArea;
    }

    public static void main(String[] args) {
        Solution65 solution = new Solution65();

        // Test cases
        int A1 = -3, B1 = 0, C1 = 3, D1 = 4, E1 = 0, F1 = -1, G1 = 9, H1 = 2;
        int A2 = -2, B2 = -2, C2 = 2, D2 = 2, E2 = -2, F2 = -2, G2 = 2, H2 = 2;
        
        System.out.println(solution.computeArea(A1, B1, C1, D1, E1, F1, G1, H1)); // Output: 45
        System.out.println(solution.computeArea(A2, B2, C2, D2, E2, F2, G2, H2)); // Output: 16
    }
}
