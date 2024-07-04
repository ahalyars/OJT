public class question59{
        public int trap(int[] height) {
            int n = height.length;
            if (n == 0) {
                return 0;
            }
    
            int left = 0;
            int right = n - 1;
            int leftMax = 0;
            int rightMax = 0;
            int totalWater = 0;
    
            while (left <= right) {
                // Calculate water that can be trapped at the current position
                if (height[left] <= height[right]) {
                    // Update leftMax if current height is greater
                    leftMax = Math.max(leftMax, height[left]);
                    // Water trapped is limited by leftMax
                    totalWater += leftMax - height[left];
                    left++;
                } else {
                    // Update rightMax if current height is greater
                    rightMax = Math.max(rightMax, height[right]);
                    // Water trapped is limited by rightMax
                    totalWater += rightMax - height[right];
                    right--;
                }
            }
    
            return totalWater;
        }
    
        public static void main(String[] args) {
            question59 solution = new question59();
            int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            System.out.println(solution.trap(height)); // Output should be 6
        }
    }
    
    

