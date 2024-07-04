public class question57 {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;
                while (left < right) {
                // Calculate the area between the two heights
                int currentArea = Math.min(height[left], height[right]) * (right - left);
                
                // Update maxArea if currentArea is greater
                maxArea = Math.max(maxArea, currentArea);
                
                // Move the pointers based on which height is smaller
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
       return maxArea;
        }
        public static void main(String[] args) {
            question57 container = new question57();
            int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println(container.maxArea(height)); // Output should be 49
        }
    }
    
    

