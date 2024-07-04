//Pascal's Triangle.
import java.util.ArrayList;
import java.util.List;
public class question55{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case; first row is always [1]
        if (numRows == 0) {
            return triangle;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate the next rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            // The first element of each row is always 1
            newRow.add(1);

            // Each triangle element is the sum of the two elements above it
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
          // The last element of each row is always 1
            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle;
    }
 public static void main(String[] args) {
        question55 pt = new question55();
        int numRows = 5;
        List<List<Integer>> result = pt.generate(numRows);
        
        // Print the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
