class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1) Traverse from left → right across the top row
            for (int j = left; j <= right; j++)
                result.add(matrix[top][j]);
            top++;

            // 2) Traverse from top → bottom down the right column
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // 3) Traverse from right → left across the bottom row, if still in bounds
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    result.add(matrix[bottom][j]);
                bottom--;
            }

            // 4) Traverse from bottom → top up the left column, if still in bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }
}