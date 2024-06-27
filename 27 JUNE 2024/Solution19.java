import java.util.Arrays; // Import Arrays class from java.util

public class Solution19 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1; // Index for array A
        int j = n - 1; // Index for array B
        int k = m + n - 1; // Index for the merged array
        
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        
        // If there are remaining elements in B, copy them to A
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
    
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        
        // Test Case 1
        int[] A1 = {1, 2, 3, 0, 0, 0};
        int[] B1 = {2, 5, 6};
        solution.merge(A1, 3, B1, 3);
        System.out.println("Merged Array 1: " + Arrays.toString(A1));
        
        // Test Case 2
        int[] A2 = {4, 5, 6, 0, 0, 0};
        int[] B2 = {1, 2, 3};
        solution.merge(A2, 3, B2, 3);
        System.out.println("Merged Array 2: " + Arrays.toString(A2));
    }
}
