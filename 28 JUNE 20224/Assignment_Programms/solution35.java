public class SortedArrayII_35 {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int prev = 1; 
        int curr = 2; 
        while (curr < A.length) {  
            if (A[curr] == A[prev] && A[curr] == A[prev - 1]) {
                curr++;
            } else {
                prev++;
                A[prev] = A[curr];
                curr++;
            }
        }
        return prev + 1; 
    }
    public static void main(String[] args) {
        SortedArrayII_35 solution = new SortedArrayII_35();
        int[] A = {1, 1, 1, 2, 2, 3};
        int newLength = solution.removeDuplicates(A);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
