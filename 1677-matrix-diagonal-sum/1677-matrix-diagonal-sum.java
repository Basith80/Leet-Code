class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length -1;
        int sum =0;
        for(int i=0; i<=len; i++){
            sum+= mat[i][i];
            if(i != len-i ){
                sum+= mat[i][len-i];
            }
            
        }
return sum ;
    }
}