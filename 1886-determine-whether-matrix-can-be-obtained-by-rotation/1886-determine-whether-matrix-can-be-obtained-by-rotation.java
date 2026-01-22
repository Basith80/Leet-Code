class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Check all 4 possible rotations (0, 90, 180, 270 degrees)
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }

    private int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Standard 90-degree clockwise rotation formula
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
}
