
public class question48 {
    
    public int removeElement(int[] A, int elem) {
        int i = 0;
        int j = 0;
        
        while (j < A.length) {
            if (A[j] != elem) {
                A[i] = A[j];
                i++;
            }
            j++;
        }
        
        return i;
    }
    
    public static void main(String[] args) {
        question48 solution = new question48();
        
        // Example test cases
        int[] nums1 = {3, 2, 2, 3};
        int elem1 = 3;
        int len1 = solution.removeElement(nums1, elem1);
        System.out.print("New length of nums1 after removing " + elem1 + ": " + len1 + " -> [");
        for (int k = 0; k < len1; k++) {
            System.out.print(nums1[k] + " ");
        }
        System.out.println("]"); // Output: New length of nums1 after removing 3: 2 -> [2 2 ]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int elem2 = 2;
        int len2 = solution.removeElement(nums2, elem2);
        System.out.print("New length of nums2 after removing " + elem2 + ": " + len2 + " -> [");
        for (int k = 0; k < len2; k++) {
            System.out.print(nums2[k] + " ");
        }
        System.out.println("]"); // Output: New length of nums2 after removing 2: 5 -> [0 1 3 0 4 ]
    }
}
