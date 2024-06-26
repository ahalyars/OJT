//13 Two Sum II Input array is sorted
public class solution13 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0)
            return null;
        
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            int x = numbers[i] + numbers[j];
            
            if (x < target) {
                ++i;
            } else if (x > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        solution13 solution = new solution13();
        int[] result = solution.twoSum(numbers, target);
        
        if (result != null) {
            System.out.println("Indices of the two numbers whose sum is equal to target:");
            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
        } else {
            System.out.println("No such indices found.");
        }
    }
}
