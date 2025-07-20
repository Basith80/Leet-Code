class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][] matrix = new int[m][n];
        for(int i=0;i<indices.length;i++){
            increment(indices[i][0] , indices[i][1] , matrix);
        }
        for(int i=0 ;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2 != 0) count++;
            }
        }
        return count;
    }
    public static void increment(int r , int c ,int[][] matrix){
        for(int i=0 ; i<matrix[r].length ;i++){
            matrix[r][i] += 1;
        }
        for(int i=0 ;i<matrix.length ;i++)matrix[i][c] += 1;
    }
}