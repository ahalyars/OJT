import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class solution16 {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < num.length - 3; i++) {
            for (int j = i + 1; j < num.length - 2; j++) {
                int k = j + 1;
                int l = num.length - 1;

                while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];

                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        temp.add(num[l]);

                        if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution16 sol = new solution16();
        int[] num = {1, 0, -1, 0, -2, 2};
        int target = 0;
        ArrayList<ArrayList<Integer>> result = sol.fourSum(num, target);

        for (ArrayList<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
