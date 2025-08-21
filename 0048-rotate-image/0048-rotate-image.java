class Solution {
    public void rotate(int[][] matrix) {
        int[][]arr = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            int in = 0;
            for(int j=matrix.length-1; j>=0; j--){
                arr[i][in] = matrix[j][i];
                in++; 
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j = 0 ; j<matrix.length ; j++){
                matrix[i][j] = arr[i][j];
            }
        }
        
    }
}