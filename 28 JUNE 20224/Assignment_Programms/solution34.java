public class solution34 {
    public static int removeDuplicates(int[] A) {
        if (A.length < 2)
            return A.length;

        int j = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 3, 3, 4, 5, 5};
        int newLength = removeDuplicates(A);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
