class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length == r && mat[0].length == c) return mat;
        if(r * c != mat.length * mat[0].length) return mat;

        int[] helper = new int[mat.length * mat[0].length];
        int in =0; 
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                helper[in++] = mat[i][j];
            }
        }
        in = 0;
        int[][] arr = new int[r][c];

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++){
                arr[i][j]= helper[in++];
            }
        }
        return arr;
    }
}