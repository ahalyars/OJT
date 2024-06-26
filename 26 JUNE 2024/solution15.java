import java.util.ArrayList;
import java.util.Arrays;

public class solution15 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Sort the array
        Arrays.sort(num);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        // Iterate through the array, considering each element as the first element of the triplet
        for (int i = 0; i < num.length - 2; i++) {
            // Skip duplicates for the first element of the triplet
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int lo = i + 1;
                int hi = num.length - 1;
                int target = -num[i]; // Find pairs that sum up to -num[i]
                
                while (lo < hi) {
                    if (num[lo] + num[hi] == target) {
                        // Found a triplet
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(num[i]);
                        triplet.add(num[lo]);
                        triplet.add(num[hi]);
                        result.add(triplet);
                        
                        // Skip duplicates for the second element of the triplet
                        while (lo < hi && num[lo] == num[lo + 1]) lo++;
                        // Skip duplicates for the third element of the triplet
                        while (lo < hi && num[hi] == num[hi - 1]) hi--;
                        
                        lo++;
                        hi--;
                    } else if (num[lo] + num[hi] < target) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        solution15 sol = new solution15();
        int[] num = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> result = sol.threeSum(num);
        
        for (ArrayList<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
