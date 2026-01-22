import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns
        
        int[] rowMins = new int[m];
        int[] colMaxes = new int[n];
        
        // Initialize rowMins with a large value
        for (int i = 0; i < m; i++) {
            rowMins[i] = Integer.MAX_VALUE;
        }
        
        // Pass 1: Find min for each row and max for each column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMins[i] = Math.min(rowMins[i], matrix[i][j]);
                colMaxes[j] = Math.max(colMaxes[j], matrix[i][j]);
            }
        }
        
        List<Integer> luckyNumbers = new ArrayList<>();
        
        // Pass 2: Identify elements that are both row min and column max
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxes[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        
        return luckyNumbers;
    }
}
