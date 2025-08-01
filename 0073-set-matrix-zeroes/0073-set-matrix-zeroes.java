public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowHasZero = false, firstColHasZero = false;

        // Check first row and column
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0) firstRowHasZero = true;
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0) firstColHasZero = true;

        // Use first row/column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        // Handle first row and column
        if (firstRowHasZero)
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
        if (firstColHasZero)
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
    }
}
