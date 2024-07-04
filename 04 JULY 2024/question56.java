import java.util.ArrayList;
import java.util.List;
public class question56 {
    public List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
    // Base case: if numRows is 0, return an empty triangle
        if (numRows == 0) {
            return triangle;
        }
        // First row (always [1])
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        // Build subsequent rows based on the previous row
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 1);
            List<Integer> row = new ArrayList<>();
            // First element of the row is always 1
            row.add(1);
           // Calculate middle elements based on the previous row
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // Last element of the row is always 1
            row.add(1);
            // Add the row to the triangle
            triangle.add(row);
        }
            return triangle;
    }
        public void printPascalTriangle(List<List<Integer>> triangle) {
        // Determine the maximum number of digits in the triangle to center it properly
        int maxDigits = triangle.get(triangle.size() - 1).get(triangle.size() / 2).toString().length();
        for (List<Integer> row : triangle) {
            // Calculate leading spaces to center the row
            int numLeadingSpaces = maxDigits * (triangle.size() - row.size()) / 2;
            // Print leading spaces
            for (int i = 0; i < numLeadingSpaces; i++) {
                System.out.print(" ");
            }
             // Print each number in the row
            for (int num : row) {
                System.out.printf("%-" + maxDigits + "d ", num);
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        question56 pascalTriangle = new question56();
        int numRows = 5;
        List<List<Integer>> triangle = pascalTriangle.generatePascalTriangle(numRows);
        pascalTriangle.printPascalTriangle(triangle);
    }
}
